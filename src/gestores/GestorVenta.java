/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Cliente;
import entidades.Factura;
import entidades.Producto;
import entidades.Usuario;
import entidades.Venta;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ema_s
 */
public class GestorVenta extends PoolDeConexiones {

    public GestorVenta() throws Exception {
        this.pedirConexion();
    }

    public int altaVenta(Venta venta) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO venta (FECHAVENTA, MONTOVENTA, IVA, usuario_IDUSUARIO, cliente_IDCLIENTE, factura_IDFACTURA) VALUES (CURDATE(),?,?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setDouble(1, venta.getMontoVenta());
            pst.setDouble(2, venta.getIvaVenta());
            pst.setInt(3, venta.getUsuario().getIdUsuario());
            pst.setInt(4, venta.getCliente().getIdCliente());
            pst.setInt(5, venta.getFactura().getIdFactura());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int altaDetalleVenta(int idventa, int idProducto) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO detalleventa (idventa, idproducto) VALUES (?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, idventa);
            pst.setInt(2, idProducto);
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int modificaVenta(Venta venta) throws Exception {
        int resultado = 0;
        String sql = "UPDATE venta SET FECHAVENTA = ?, MONTOVENTA = ?, IVA = ?, usuario_IDUSUARIO = ?, "
                + "cliente_IDCLIENTE = ?, factura_IDFACTURA = ? WHERE venta.IDVENTA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(venta.getFechaVenta().getTime()));
            pst.setDouble(2, venta.getMontoVenta());
            pst.setDouble(3, venta.getIvaVenta());
            pst.setInt(4, venta.getUsuario().getIdUsuario());
            pst.setInt(5, venta.getCliente().getIdCliente());
            pst.setInt(6, venta.getFactura().getIdFactura());
            Array productos = conexion.createArrayOf("INT", venta.getProductos().toArray());
            pst.setArray(6, productos);
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaVenta(Venta venta) throws Exception {
        int resultado = 0;
        String sql = "UPDATE venta SET FECHABAJA = ? WHERE venta.IDVENTA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(venta.getFechaBajaVenta().getTime()));
            pst.setInt(2, venta.getIdVenta());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    private ArrayList<Producto> obtenerProductosPorVenta(int idventa) throws Exception {
        ArrayList<Producto> productos = new ArrayList<>();
        String sql = "SELECT idproducto FROM detalleventa WHERE detalleventa.idventa = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idventa);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                productos.add(new Producto().obtenerProducto(resultado.getInt("idproducto")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return productos;
    }

    public Venta obtenerVenta(int idVenta) throws Exception {
        Venta venta = new Venta();
        String sql = "SELECT * FROM venta WHERE venta.IDVENTA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idVenta);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                venta.setIdVenta(idVenta);
                venta.setFechaVenta(resultado.getDate("FECHAVENTA"));
                venta.setMontoVenta(resultado.getDouble("MONTOVENTA"));
                venta.setIvaVenta(resultado.getDouble("IVA"));
                venta.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                venta.setCliente(new Cliente().obtenerClientePorId(resultado.getInt("cliente_IDCLIENTE")));
                venta.setFactura(new Factura().obtenerFactura(resultado.getInt("factura_IDFACTURA")));
                venta.setProductos(this.obtenerProductosPorVenta(resultado.getInt("IDVENTA")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return venta;
    }

    public ArrayList<Venta> listarVentas(java.util.Date fechaDesde, java.util.Date fechaHasta) throws Exception {
        ArrayList<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM venta WHERE venta.FECHABAJA IS NULL "
                + "AND (venta.FECHAVENTA BETWEEN ? AND ?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(fechaDesde.getTime()));
            pst.setDate(2, new Date(fechaHasta.getTime()));
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(resultado.getInt("IDVENTA"));
                venta.setFechaVenta(resultado.getDate("FECHAVENTA"));
                venta.setMontoVenta(resultado.getDouble("MONTOVENTA"));
                venta.setIvaVenta(resultado.getDouble("IVA"));
                venta.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                venta.setCliente(new Cliente().obtenerClientePorId(resultado.getInt("cliente_IDCLIENTE")));
                venta.setFactura(new Factura().obtenerFactura(resultado.getInt("factura_IDFACTURA")));
                venta.setProductos(this.obtenerProductosPorVenta(resultado.getInt("IDVENTA")));
                ventas.add(venta);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return ventas;
    }

    public ArrayList<Venta> obtenerVentasCliente(int idCliente) throws Exception {
        ArrayList<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM venta WHERE venta.FECHABAJA IS NULL "
                + "AND venta.cliente_IDCLIENTE = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idCliente);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(resultado.getInt("IDVENTA"));
                venta.setFechaVenta(resultado.getDate("FECHAVENTA"));
                venta.setMontoVenta(resultado.getDouble("MONTOVENTA"));
                venta.setIvaVenta(resultado.getDouble("IVA"));
                venta.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                venta.setCliente(new Cliente().obtenerClientePorId(resultado.getInt("cliente_IDCLIENTE")));
                venta.setFactura(new Factura().obtenerFactura(resultado.getInt("factura_IDFACTURA")));
                venta.setProductos(this.obtenerProductosPorVenta(resultado.getInt("IDVENTA")));
                ventas.add(venta);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return ventas;
    }
}
