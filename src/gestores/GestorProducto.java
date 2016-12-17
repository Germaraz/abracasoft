/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Producto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorProducto extends PoolDeConexiones {

    public GestorProducto() throws Exception {
        this.pedirConexion();
    }

    public int altaProducto(Producto producto) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO producto (CODIGOBARRA, NOMBREPRODUCTO, DESCRIPCIONPRODUCT, "
                + "FECHAVENCIMIENTO, PRECIOUNITARIO, ALICUOTA, STOCK) VALUES (?,?,?,?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, producto.getCodigoBarra());
            pst.setString(2, producto.getNombreProducto());
            pst.setString(3, producto.getDescripcionProducto());
            pst.setDate(4, (Date) producto.getFechaVencimientoProducto());
            pst.setDouble(5, producto.getPrecioUnitario());
            pst.setDouble(6, producto.getAlicuota());
            pst.setInt(7, producto.getStock());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int modificarProducto(Producto producto) throws Exception {
        int resultado = 0;
        String sql = "UPDATE producto SET CODIGOBARRA = ?, NOMBREPRODUCTO = ?, DESCRIPCIONPRODUCT = ?, "
                + "FECHAVENCIMIENTO = ?, PRECIOUNITARIO = ?, ALICUOTA = ?, STOCK = ? WHERE `IDPRODUCTO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, producto.getCodigoBarra());
            pst.setString(2, producto.getNombreProducto());
            pst.setString(3, producto.getDescripcionProducto());
            pst.setDate(4, (Date) producto.getFechaVencimientoProducto());
            pst.setDouble(5, producto.getPrecioUnitario());
            pst.setDouble(6, producto.getAlicuota());
            pst.setInt(7, producto.getStock());
            pst.setInt(8, producto.getIdProducto());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaProducto(Producto producto) throws Exception {
        int resultado = 0;
        String sql = "UPDATE producto SET FECHABAJA = ? WHERE producto.IDPRODUCTO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(producto.getFechaBajaProducto().getTime()));
            pst.setInt(2, producto.getIdProducto());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public Producto obtenerProducto(int idProducto) throws Exception {
        Producto producto = new Producto();
        String sql = "SELECT * FROM producto WHERE producto.FECHABAJA IS NULL AND producto.IDPRODUCTO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idProducto);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                producto.setIdProducto(idProducto);
                producto.setCodigoBarra(resultado.getInt("CODIGOBARRA"));
                producto.setNombreProducto(resultado.getString("NOMBREPRODUCTO"));
                producto.setDescripcionProducto(resultado.getString("DESCRIPCIONPRODUCTO"));
                producto.setFechaVencimientoProducto(resultado.getDate("FECHAVENCIMIENTO"));
                producto.setPrecioUnitario(resultado.getDouble("PRECIOUNITARIO"));
                producto.setAlicuota(resultado.getDouble("ALICUOTA"));
                producto.setStock(resultado.getInt("STOCK"));
                producto.setFechaAltaProducto(resultado.getDate("FECHAALTA"));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return producto;
    }

    public ArrayList<Producto> obtenerProductosCodBarra(int codigobarra) throws Exception {
        ArrayList<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM producto WHERE producto.FECHABAJA IS NULL "
                + "AND producto.CODIGOBARRA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, codigobarra);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(resultado.getInt("IDPRODUCTO"));
                producto.setCodigoBarra(resultado.getInt("CODIGOBARRA"));
                producto.setNombreProducto(resultado.getString("NOMBREPRODUCTO"));
                producto.setDescripcionProducto(resultado.getString("DESCRIPCIONPRODUCTO"));
                producto.setFechaVencimientoProducto(resultado.getDate("FECHAVENCIMIENTO"));
                producto.setPrecioUnitario(resultado.getDouble("PRECIOUNITARIO"));
                producto.setAlicuota(resultado.getDouble("ALICUOTA"));
                producto.setStock(resultado.getInt("STOCK"));
                producto.setFechaAltaProducto(resultado.getDate("FECHAALTA"));
                productos.add(producto);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return productos;
    }

    public ArrayList<Producto> obtenerProductosDescripcion(String descripcion) throws Exception {
        ArrayList<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM producto WHERE producto.FECHABAJA IS NULL "
                + "AND producto.DESCRIPCIONPRODUCTO LIKE '?%'";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, descripcion);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(resultado.getInt("IDPRODUCTO"));
                producto.setCodigoBarra(resultado.getInt("CODIGOBARRA"));
                producto.setNombreProducto(resultado.getString("NOMBREPRODUCTO"));
                producto.setDescripcionProducto(resultado.getString("DESCRIPCIONPRODUCTO"));
                producto.setFechaVencimientoProducto(resultado.getDate("FECHAVENCIMIENTO"));
                producto.setPrecioUnitario(resultado.getDouble("PRECIOUNITARIO"));
                producto.setAlicuota(resultado.getDouble("ALICUOTA"));
                producto.setStock(resultado.getInt("STOCK"));
                producto.setFechaAltaProducto(resultado.getDate("FECHAALTA"));
                productos.add(producto);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return productos;
    }

    public ArrayList<Producto> listarProductos() throws Exception {
        ArrayList<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM producto WHERE producto.FECHABAJA IS NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(resultado.getInt("IDPRODUCTO"));
                producto.setCodigoBarra(resultado.getInt("CODIGOBARRA"));
                producto.setNombreProducto(resultado.getString("NOMBREPRODUCTO"));
                producto.setDescripcionProducto(resultado.getString("DESCRIPCIONPRODUCTO"));
                producto.setFechaVencimientoProducto(resultado.getDate("FECHAVENCIMIENTO"));
                producto.setPrecioUnitario(resultado.getDouble("PRECIOUNITARIO"));
                producto.setAlicuota(resultado.getDouble("ALICUOTA"));
                producto.setStock(resultado.getInt("STOCK"));
                producto.setFechaAltaProducto(resultado.getDate("FECHAALTA"));
                productos.add(producto);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return productos;
    }

    public Producto obtenerProductoCodBarra(int codigoBarra) throws Exception {
        Producto producto = new Producto();
        String sql = "SELECT * FROM producto WHERE producto.FECHABAJA IS NULL "
                + "AND producto.CODIGOBARRA LIKE '?%'";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, codigoBarra);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                producto.setIdProducto(resultado.getInt("IDPRODUCTO"));
                producto.setCodigoBarra(resultado.getInt("CODIGOBARRA"));
                producto.setNombreProducto(resultado.getString("NOMBREPRODUCTO"));
                producto.setDescripcionProducto(resultado.getString("DESCRIPCIONPRODUCTO"));
                producto.setFechaVencimientoProducto(resultado.getDate("FECHAVENCIMIENTO"));
                producto.setPrecioUnitario(resultado.getDouble("PRECIOUNITARIO"));
                producto.setAlicuota(resultado.getDouble("ALICUOTA"));
                producto.setStock(resultado.getInt("STOCK"));
                producto.setFechaAltaProducto(resultado.getDate("FECHAALTA"));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return producto;
    }
}
