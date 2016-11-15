/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Compra;
import entidades.Proveedor;
import entidades.Usuario;
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
        String sql = "INSERT INTO compra (FECHACOMPRA, MONTO, IVA, usuario_IDUSUARIO, proveedor_IDPROVEEDOR) "
                + "VALUES (?,?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, (Date) compra.getFechaCompra());
            pst.setFloat(2, compra.getMontoCompra());
            pst.setFloat(3, compra.getIvaCompra());
            pst.setInt(4, compra.getUsuario().getIdUsuario());
            pst.setInt(5, compra.getProveedor().getIdProveedor());
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
            pst.setDate(1, (Date) compra.getFechaCompra());
            pst.setFloat(2, compra.getMontoCompra());
            pst.setFloat(3, compra.getIvaCompra());
            pst.setInt(4, compra.getUsuario().getIdUsuario());
            pst.setInt(5, compra.getProveedor().getIdProveedor());
            pst.setInt(6, compra.getIdCompra());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    int darDeBajaCompra(Compra compra) throws Exception {
        int resultado = 0;
        String sql = "UPDATE compra SET FECHABAJA = ? WHERE compra.IDCOMPRA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, (Date) compra.getFechaBajaCompra());
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
        String sql = "SELECT * FROM compra WHERE compra.FECHABAJA IS NULL AND compra.IDCOMPRA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idCompra);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                compra.setIdCompra(idCompra);
                compra.setFechaCompra(resultado.getDate("FECHACOMPRA"));
                compra.setMontoCompra(resultado.getFloat("MONTO"));
                compra.setIvaCompra(resultado.getFloat("IVA"));
                compra.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario.IDUSUARIO")));
                compra.setProveedor(new Proveedor().obtenerProveedor(resultado.getInt("proveedor.IDPROVEEDOR")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return compra;
    }

    ArrayList<Compra> listarCompras(java.util.Date fechaDesde, java.util.Date fechaHasta) throws Exception {
        ArrayList<Compra> compras = new ArrayList<>();
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
                compra.setMontoCompra(resultado.getFloat("MONTO"));
                compra.setIvaCompra(resultado.getFloat("IVA"));
                compra.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                compra.setProveedor(new Proveedor().obtenerProveedor(resultado.getInt("proveedor_IDPROVEEDOR")));
                compras.add(compra);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return compras;
    }
}
