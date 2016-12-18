/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Compra;
import entidades.Pago;
import entidades.TipoPago;
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
public class GestorPago extends PoolDeConexiones {

    public GestorPago() throws Exception {
        this.pedirConexion();
    }

    public int altaPago(Pago pago) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO pago (MONTOPAGO, FECHAPAGO, venta_IDVENTA, tipo_pago_IDTIPOPAGO, compra_IDCOMPRA) "
                + "VALUES (?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDouble(1, pago.getMontoPago());
            pst.setDate(2, new Date(pago.getFechaPago().getTime()));
            pst.setInt(3, pago.getVenta().getIdVenta());
            pst.setInt(4, pago.getTipoPago().getIdTipoPago());
            pst.setInt(5, pago.getCompra().getIdCompra());
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
        String sql = "UPDATE pago SET MONTOPAGO = ?, FECHAPAGO = ?, tipo_pago_IDTIPOPAGO = ?, compra_IDCOMPRA = ?"
                + " WHERE pago.IDPAGO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDouble(1, pago.getMontoPago());
            pst.setDate(2, new Date(pago.getFechaPago().getTime()));
            pst.setInt(3, pago.getTipoPago().getIdTipoPago());
            pst.setInt(4, pago.getCompra().getIdCompra());
            pst.setInt(5, pago.getIdPago());
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
            conexion.commit();
            while (resultado.next()) {
                pago.setIdPago(idPago);
                pago.setMontoPago(resultado.getDouble("MONTOPAGO"));
                pago.setFechaPago(resultado.getDate("FECHAPAGO"));
                pago.setTipoPago(new TipoPago().obtenerTipoPago(resultado.getInt("tipo_pago_IDTIPOPAGO")));
                pago.setVenta(new Venta().obtenerVenta(resultado.getInt("venta_IDVENTA")));
                pago.setCompra(new Compra().obtenerCompra(resultado.getInt("compra_IDCOMPRA")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return pago;
    }

    public Pago obtenerPagoCompra(int idCompra) throws Exception {
        Pago pago = new Pago();
        String sql = "SELECT * FROM pago WHERE pago.FECHABAJA IS NULL AND pago.compra_IDCOMPRA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idCompra);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                pago.setIdPago(resultado.getInt("IDPAGO"));
                pago.setMontoPago(resultado.getDouble("MONTOPAGO"));
                pago.setFechaPago(resultado.getDate("FECHAPAGO"));
                pago.setTipoPago(new TipoPago().obtenerTipoPago(resultado.getInt("tipo_pago_IDTIPOPAGO")));
                pago.setVenta(new Venta().obtenerVenta(resultado.getInt("venta_IDVENTA")));
                pago.setCompra(new Compra().obtenerCompra(resultado.getInt("compra_IDCOMPRA")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return pago;
    }

    public ArrayList<Pago> obtenerPagosVenta(int idVenta) throws Exception {
        ArrayList<Pago> pagos = new ArrayList<>();
        String sql = "SELECT * FROM pago WHERE pago.FECHABAJA IS NULL AND pago.venta_IDVENTA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idVenta);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Pago pago = new Pago();
                pago.setIdPago(resultado.getInt("IDPAGO"));
                pago.setMontoPago(resultado.getDouble("MONTOPAGO"));
                pago.setFechaPago(resultado.getDate("FECHAPAGO"));
                pago.setTipoPago(new TipoPago().obtenerTipoPago(resultado.getInt("tipo_pago_IDTIPOPAGO")));
                pago.setVenta(new Venta().obtenerVenta(resultado.getInt("venta_IDVENTA")));
                pago.setCompra(new Compra().obtenerCompra(resultado.getInt("compra_IDCOMPRA")));
                pagos.add(pago);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return pagos;
    }
}
