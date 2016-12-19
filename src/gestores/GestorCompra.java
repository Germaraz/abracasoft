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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        String sql = "INSERT INTO compra (FECHACOMPRA, MONTO, IVA, usuario_IDUSUARIO, proveedor_IDPROVEEDOR) VALUES (CURDATE(),?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setDouble(1, compra.getMontoCompra());
            pst.setDouble(2, compra.getIvaCompra());
            pst.setInt(3, compra.getUsuario().getIdUsuario());
            pst.setInt(4, compra.getProveedor().getIdProveedor());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int altaDetalleCompra(int idCompra, int idProducto) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO detallecompra (idcompra, idproducto) VALUES (?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, idCompra);
            pst.setInt(2, idProducto);
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
                + "proveedor_IDPROVEEDOR = ? WHERE compra.IDCOMPRA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(compra.getFechaCompra().getTime()));
            pst.setDouble(2, compra.getMontoCompra());
            pst.setDouble(3, compra.getIvaCompra());
            pst.setInt(4, compra.getUsuario().getIdUsuario());
            pst.setInt(5, compra.getProveedor().getIdProveedor());
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

    private ArrayList<Producto> obtenerProductosPorCompra(int idcompra) throws Exception {
        ArrayList<Producto> productos = new ArrayList<>();
        String sql = "SELECT idproducto FROM detallecompra WHERE detallecompra.idcompra = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idcompra);
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

    public Compra obtenerCompra(int idCompra) throws Exception {
        Compra compra = new Compra();
        String sql = "SELECT * FROM compra WHERE compra.FECHABAJA IS NULL AND compra.IDCOMPRA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idCompra);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                compra.setIdCompra(idCompra);
                compra.setFechaCompra(resultado.getDate("FECHACOMPRA"));
                compra.setMontoCompra(resultado.getDouble("MONTO"));
                compra.setIvaCompra(resultado.getDouble("IVA"));
                compra.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                compra.setProveedor(new Proveedor().obtenerProveedor(resultado.getInt("proveedor_IDPROVEEDOR")));
                compra.setProductos(this.obtenerProductosPorCompra(idCompra));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return compra;
    }

    public ArrayList<Compra> listarCompras(java.util.Date fechaDesde, java.util.Date fechaHasta) throws Exception {
        ArrayList<Compra> compras = new ArrayList<>();
        String sql = "SELECT * FROM compra WHERE compra.FECHABAJA IS NULL "
                + "AND (compra.FECHACOMPRA BETWEEN ? AND ?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(fechaDesde.getTime()));
            pst.setDate(2, new Date(fechaHasta.getTime()));
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(resultado.getInt("IDCOMPRA"));
                compra.setFechaCompra(resultado.getDate("FECHACOMPRA"));
                compra.setMontoCompra(resultado.getDouble("MONTO"));
                compra.setIvaCompra(resultado.getDouble("IVA"));
                compra.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                compra.setProveedor(new Proveedor().obtenerProveedor(resultado.getInt("proveedor_IDPROVEEDOR")));
                compra.setProductos(this.obtenerProductosPorCompra(resultado.getInt("IDCOMPRA")));
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
        String sql = "SELECT * FROM compra WHERE compra.FECHABAJA IS NULL "
                + "AND compra.proveedor_IDPROVEEDOR = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idProveedor);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(resultado.getInt("IDCOMPRA"));
                compra.setFechaCompra(resultado.getDate("FECHACOMPRA"));
                compra.setMontoCompra(resultado.getDouble("MONTO"));
                compra.setIvaCompra(resultado.getDouble("IVA"));
                compra.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                compra.setProveedor(new Proveedor().obtenerProveedor(resultado.getInt("proveedor_IDPROVEEDOR")));
                compra.setProductos(this.obtenerProductosPorCompra(resultado.getInt("IDCOMPRA")));
                compras.add(compra);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return compras;
    }
}
