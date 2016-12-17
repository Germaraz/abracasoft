/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Compra;
import entidades.Producto;
import entidades.Proveedor;
import entidades.Usuario;
import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorCompra extends PoolDeConexiones {

    public GestorCompra() throws Exception {
        this.pedirConexion();
    }

    public int altaCompra(Compra compra) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO compra (FECHACOMPRA, MONTO, IVA, usuario_IDUSUARIO, proveedor_IDPROVEEDOR, "
                + "producto_IDPRODUCTO) VALUES (?,?,?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, (Date) compra.getFechaCompra());
            pst.setDouble(2, compra.getMontoCompra());
            pst.setDouble(3, compra.getIvaCompra());
            pst.setInt(4, compra.getUsuario().getIdUsuario());
            pst.setInt(5, compra.getProveedor().getIdProveedor());
            Array productos = conexion.createArrayOf("INT", compra.getProductos().toArray());
            pst.setArray(6, productos);
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int modificarCompra(Compra compra) throws Exception {
        int resultado = 0;
        String sql = "UPDATE compra SET FECHACOMPRA = ?, MONTO = ?, IVA = ?, usuario_IDUSUARIO = ?, "
                + "proveedor_IDPROVEEDOR = ?, producto_IDPRODUCTO = ? WHERE compra.IDCOMPRA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, (Date) compra.getFechaCompra());
            pst.setDouble(2, compra.getMontoCompra());
            pst.setDouble(3, compra.getIvaCompra());
            pst.setInt(4, compra.getUsuario().getIdUsuario());
            pst.setInt(5, compra.getProveedor().getIdProveedor());
            Array productos = conexion.createArrayOf("INT", compra.getProductos().toArray());
            pst.setArray(6, productos);
            pst.setInt(7, compra.getIdCompra());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaCompra(Compra compra) throws Exception {
        int resultado = 0;
        String sql = "UPDATE compra SET FECHABAJA = ? WHERE compra.IDCOMPRA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(compra.getFechaBajaCompra().getTime()));
            pst.setInt(2, compra.getIdCompra());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public Compra obtenerCompra(int idCompra) throws Exception {
        Compra compra = new Compra();
        ArrayList<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM compra WHERE compra.FECHABAJA IS NULL AND compra.IDCOMPRA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idCompra);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                compra.setIdCompra(idCompra);
                compra.setFechaCompra(resultado.getDate("FECHACOMPRA"));
                compra.setMontoCompra(resultado.getDouble("MONTO"));
                compra.setIvaCompra(resultado.getDouble("IVA"));
                compra.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                compra.setProveedor(new Proveedor().obtenerProveedor(resultado.getInt("proveedor_IDPROVEEDOR")));
                productos.add(new Producto().obtenerProducto(resultado.getInt("producto_IDPRODUCTO")));
            }
            compra.setProductos(productos);
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return compra;
    }

    public ArrayList<Compra> listarCompras(java.util.Date fechaDesde, java.util.Date fechaHasta) throws Exception {
        ArrayList<Compra> compras = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM compra WHERE compra.FECHABAJA IS NULL "
                + "AND (compra.FECHACOMPRA BETWEEN ? AND ?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, (Date) fechaDesde);
            pst.setDate(2, (Date) fechaHasta);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(resultado.getInt("IDCOMPRA"));
                compra.setFechaCompra(resultado.getDate("FECHACOMPRA"));
                compra.setMontoCompra(resultado.getDouble("MONTO"));
                compra.setIvaCompra(resultado.getDouble("IVA"));
                compra.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                compra.setProveedor(new Proveedor().obtenerProveedor(resultado.getInt("proveedor_IDPROVEEDOR")));
                productos.add(new Producto().obtenerProducto(resultado.getInt("producto_IDPRODUCTO")));
                compra.setProductos(productos);
                compras.add(compra);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return compras;
    }

    public ArrayList<Compra> obtenerComprasProveedor(int idProveedor) throws Exception {
        ArrayList<Compra> compras = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM compra WHERE compra.FECHABAJA IS NULL "
                + "AND compra.proveedor_IDPROVEEDOR = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idProveedor);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(resultado.getInt("IDCOMPRA"));
                compra.setFechaCompra(resultado.getDate("FECHACOMPRA"));
                compra.setMontoCompra(resultado.getDouble("MONTO"));
                compra.setIvaCompra(resultado.getDouble("IVA"));
                compra.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                compra.setProveedor(new Proveedor().obtenerProveedor(resultado.getInt("proveedor_IDPROVEEDOR")));
                productos.add(new Producto().obtenerProducto(resultado.getInt("producto_IDPRODUCTO")));
                compra.setProductos(productos);
                compras.add(compra);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return compras;
    }
}
