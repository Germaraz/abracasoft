/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Pago;
import entidades.TipoPago;
import entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ema_s
 */
public class GestorPago extends PoolDeConexiones {

    public GestorPago() throws Exception {
        this.pedirConexion();
    }

    public int altaPago(Pago pago) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO pago (MONTOPAGO, FECHAPAGO, venta_IDVENTA, tipo_pago_IDTIPOPAGO) VALUES (?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setFloat(1, pago.getMontoPago());
            pst.setDate(2, (Date) pago.getFechaPago());
            pst.setInt(3, pago.getVenta().getIdVenta());
            pst.setInt(4, pago.getTipoPago().getIdTipoPago());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int modificarPago(Pago pago) throws Exception {
        int resultado = 0;
        String sql = "UPDATE pago SET MONTOPAGO = ?, FECHAPAGO = ?, tipo_pago_IDTIPOPAGO = ? WHERE pago.IDPAGO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setFloat(1, pago.getMontoPago());
            pst.setDate(2, (Date) pago.getFechaPago());
            pst.setInt(3, pago.getTipoPago().getIdTipoPago());
            pst.setInt(4, pago.getIdPago());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaPago(Pago pago) throws Exception {
        int resultado = 0;
        String sql = "UPDATE pago FECHABAJA = ? WHERE pago.IDPAGO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(pago.getFechaBajaPago().getTime()));
            pst.setInt(2, pago.getIdPago());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public Pago obtenerPago(int idPago) throws Exception {
        Pago pago = new Pago();
        String sql = "SELECT * FROM pago WHERE pago.FECHABAJA IS NULL AND pago.IDPAGO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idPago);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                pago.setIdPago(idPago);
                pago.setMontoPago(resultado.getFloat("MONTOPAGO"));
                pago.setFechaPago(resultado.getDate("FECHAPAGO"));
                pago.setTipoPago(new TipoPago().obtenerTipoPago(resultado.getInt("tipo_pago_IDTIPOPAGO")));
                pago.setVenta(new Venta().obtenerVenta(resultado.getInt("venta_IDVENTA")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return pago;
    }
}
