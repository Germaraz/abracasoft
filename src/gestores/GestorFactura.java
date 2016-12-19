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

    public int altaFactura(Factura factura) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO factura (TIPOFACTURA, PORCIVA) VALUES (?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, factura.getTipoFactura());
            pst.setInt(2, factura.getPorcIVA());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int modificarFactura(Factura factura) throws Exception {
        int resultado = 0;
        String sql = "UPDATE factura SET TIPOFACTURA = ?, PORCIVA = ? WHERE factura.IDFACTURA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, factura.getTipoFactura());
            pst.setInt(2, factura.getPorcIVA());
            pst.setInt(3, factura.getIdFactura());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaFactura(Factura factura) throws Exception {
        int resultado = 0;
        String sql = "UPDATE factura SET FECHABAJA = ? WHERE factura.IDFACTURA = ?";
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
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return factura;
    }

    public Factura obtenerFactura(String tipoFactura) throws Exception {
        Factura factura = new Factura();
        String sql = "SELECT * FROM factura WHERE factura.FECHABAJA IS NULL AND factura.TIPOFACTURA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, tipoFactura);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                factura.setIdFactura(resultado.getInt("IDFACTURA"));
                factura.setTipoFactura(resultado.getString("TIPOFACTURA"));
                factura.setPorcIVA(resultado.getInt("PORCIVA"));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return factura;
    }

    public ArrayList<Factura> listarFacturas() throws Exception {
        ArrayList<Factura> facturas = new ArrayList<>();
        String sql = "SELECT * FROM factura WHERE factura.FECHABAJA IS NULL ";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Factura factura = new Factura();
                factura.setIdFactura(resultado.getInt("IDFACTURA"));
                factura.setTipoFactura(resultado.getString("TIPOFACTURA"));
                factura.setPorcIVA(resultado.getInt("PORCIVA"));
                facturas.add(factura);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return facturas;
    }

}
