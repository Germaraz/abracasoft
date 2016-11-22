/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Compra;
import entidades.Producto;
import entidades.Promocion;
import entidades.Reserva;
import entidades.Venta;
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
                + "FECHAVENCIMIENTO, PRECIOUNITARIO, STOCK, compra_IDCOMPRA, venta_IDVENTA, "
                + "promocion_IDPROMOCION, reserva_IDRESERVA`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, producto.getCodigoBarra());
            pst.setString(2, producto.getNombreProducto());
            pst.setString(3, producto.getDescripcionProducto());
            pst.setDate(4, (Date) producto.getFechaVencimientoProducto());
            pst.setFloat(5, producto.getPrecioUnitario());
            pst.setInt(6, producto.getStock());
            pst.setInt(7, producto.getCompra().getIdCompra());
            pst.setInt(8, producto.getVenta().getIdVenta());
            pst.setInt(9, producto.getPromocion().getIdPromocion());
            pst.setInt(10, producto.getReserva().getIdReserva());
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
                + "FECHAVENCIMIENTO = ?, PRECIOUNITARIO = ?, STOCK = ?, compra_IDCOMPRA = ?, "
                + "venta_IDVENTA = ?, promocion_IDPROMOCION = ?, reserva_IDRESERVA = ? WHERE `IDPRODUCTO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, producto.getCodigoBarra());
            pst.setString(2, producto.getNombreProducto());
            pst.setString(3, producto.getDescripcionProducto());
            pst.setDate(4, (Date) producto.getFechaVencimientoProducto());
            pst.setFloat(5, producto.getPrecioUnitario());
            pst.setInt(6, producto.getStock());
            pst.setInt(7, producto.getCompra().getIdCompra());
            pst.setInt(8, producto.getVenta().getIdVenta());
            pst.setInt(9, producto.getPromocion().getIdPromocion());
            pst.setInt(10, producto.getReserva().getIdReserva());
            pst.setInt(11, producto.getIdProducto());
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
                producto.setDescripcionProducto(resultado.getString("DESCRIPCIONPRODUCT"));
                producto.setFechaVencimientoProducto(resultado.getDate("FECHAVENCIMIENTO"));
                producto.setPrecioUnitario(resultado.getFloat("PRECIOUNITARIO"));
                producto.setStock(resultado.getInt("STOCK"));
                producto.setFechaAltaProducto(resultado.getDate("FECHAALTA"));
                producto.setCompra(new Compra().obtenerCompra(resultado.getInt("compra_IDCOMPRA")));
                producto.setVenta(new Venta().obtenerVenta(resultado.getInt("venta_IDVENTA")));
                producto.setPromocion(new Promocion().obtenerPromocion(resultado.getInt("promocion_IDPROMOCION")));
                producto.setReserva(new Reserva().obtenerReserva(resultado.getInt("reserva_IDRESERVA")));
                productos.add(producto);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return productos;
    }
}
