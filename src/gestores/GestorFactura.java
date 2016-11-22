/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Factura;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorFactura extends PoolDeConexiones {

    public GestorFactura() throws Exception {
        this.pedirConexion();
    }

    int altaFactura(Factura factura) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO factura (TIPOFACTURA, FECHAFACTURA) VALUES (?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, factura.getTipoFactura());
            pst.setDate(2, (Date) factura.getFechaFactura());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    int modificarFactura(Factura factura) throws Exception {
        int resultado = 0;
        String sql = "UPDATE factura SET TIPOFACTURA = ?, FECHAFACTURA = ? WHERE IDFACTURA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, factura.getTipoFactura());
            pst.setDate(2, (Date) factura.getFechaFactura());
            pst.setInt(3, factura.getIdFactura());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    int darDeBajaFactura(Factura factura) throws Exception {
        int resultado = 0;
        String sql = "UPDATE factura SET FECHABAJA = ? WHERE IDFACTURA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(factura.getFechaBajaFactura().getTime()));
            pst.setInt(2, factura.getIdFactura());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public Factura obtenerFactura(int idFactura) throws Exception {
        Factura factura = new Factura();
        String sql = "SELECT * FROM factura WHERE factura.FECHABAJA IS NULL AND factura.IDFACTURA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idFactura);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                factura.setIdFactura(idFactura);
                factura.setTipoFactura(resultado.getString("TIPOFACTURA"));
                factura.setPorcIVA(resultado.getInt("PORCIVA"));
                factura.setFechaFactura(resultado.getDate("FECHAFACTURA"));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return factura;
    }

    public ArrayList<Factura> listarFacturas(java.util.Date fechaDesde, java.util.Date fechaHasta) throws Exception {
        ArrayList<Factura> facturas = new ArrayList<>();
        String sql = "SELECT * FROM factura WHERE factura.FECHABAJA IS NULL "
                + "AND (factura.FECHAFACTURA BETWEEN ? AND ?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, (Date) fechaDesde);
            pst.setDate(2, (Date) fechaHasta);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Factura factura = new Factura();
                factura.setIdFactura(resultado.getInt("IDFACTURA"));
                factura.setTipoFactura(resultado.getString("TIPOFACTURA"));
                factura.setFechaFactura(resultado.getDate("FECHAFACTURA"));
                facturas.add(factura);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return facturas;
    }

}
