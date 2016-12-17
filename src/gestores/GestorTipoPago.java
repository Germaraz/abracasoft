/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.TipoPago;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorTipoPago extends PoolDeConexiones {

    public GestorTipoPago() throws Exception {
        this.pedirConexion();
    }

    public int altaTipoPago(TipoPago tipoPago) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO tipo_pago (TIPOPAGO, CUOTAS, BONIFICACION) VALUES (?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, tipoPago.getTipoPago());
            pst.setInt(2, tipoPago.getCuotas());
            pst.setDouble(3, tipoPago.getBonificacion());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int modificarTipoPago(TipoPago tipoPago) throws Exception {
        int resultado = 0;
        String sql = "UPDATE tipo_pago SET TIPOPAGO = ?, CUOTAS = ?, BONIFICACION = ? WHERE tipo_pago.IDTIPOPAGO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, tipoPago.getTipoPago());
            pst.setInt(2, tipoPago.getCuotas());
            pst.setDouble(3, tipoPago.getBonificacion());
            pst.setInt(4, tipoPago.getIdTipoPago());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaTipoPago(TipoPago tipoPago) throws Exception {
        int resultado = 0;
        String sql = "UPDATE tipo_pago SET FECHABAJA = ? WHERE tipo_pago.IDTIPOPAGO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(tipoPago.getFechaBajaTipoPago().getTime()));
            pst.setInt(2, tipoPago.getIdTipoPago());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public TipoPago obtenerTipoPago(int idTipoPago) throws Exception {
        TipoPago tipoPago = new TipoPago();
        String sql = "SELECT * FROM tipo_pago WHERE tipo_pago.FECHABAJA = ? AND tipo_pago.IDTIPOPAGO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idTipoPago);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                tipoPago.setIdTipoPago(idTipoPago);
                tipoPago.setTipoPago(resultado.getString("TIPOPAGO"));
                tipoPago.setCuotas(resultado.getInt("CUOTAS"));
                tipoPago.setBonificacion(resultado.getDouble("BONIFICACION"));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return tipoPago;
    }

    public ArrayList<TipoPago> listarTiposDePago() throws Exception {
        ArrayList<TipoPago> tiposDePago = new ArrayList<>();
        String sql = "SELECT * FROM tipo_pago WHERE tipo_pago.FECHABAJA IS NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                TipoPago tipoPago = new TipoPago();
                tipoPago.setIdTipoPago(resultado.getInt("IDTIPOPAGO"));
                tipoPago.setTipoPago(resultado.getString("TIPOPAGO"));
                tipoPago.setCuotas(resultado.getInt("CUOTAS"));
                tipoPago.setBonificacion(resultado.getDouble("BONIFICACION"));
                tiposDePago.add(tipoPago);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return tiposDePago;
    }
}
