/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Caja;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorCaja extends PoolDeConexiones {

    public GestorCaja() throws Exception {
        this.pedirConexion();
    }

    public int abrirCaja(Caja caja) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO caja (IMPORTEARQUEO, FECHAAPERTURA, usuario_IDUSUARIO) VALUES (?,CURDATE(),?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setDouble(1, caja.getImporteArqueo());
            pst.setInt(2, caja.getUsuario().getIdUsuario());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int cerrarCaja(Caja caja) throws Exception {
        int resultado = 0;
        String sql = "UPDATE caja SET IMPORTECIERRE = ?, FECHACIERRRE = NOW() WHERE caja.IDCAJA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDouble(1, caja.getImporteCierre());
            pst.setInt(2, caja.getIdCaja());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaCaja(Caja caja) throws Exception {
        int resultado = 0;
        String sql = "UPDATE caja SET FECHABAJA = ? WHERE caja.IDCAJA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(caja.getFechaBaja().getTime()));
            pst.setInt(2, caja.getIdCaja());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public Caja obtenerCaja(int idCaja) throws Exception {
        Caja caja = null;
        String sql = "SELECT * FROM caja WHERE caja.FECHABAJA IS NULL AND caja.IDCAJA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idCaja);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                caja = new Caja();
                caja.setIdCaja(idCaja);
                caja.setFechaApertura(resultado.getDate("FECHAAPERTURA"));
                caja.setImporteArqueo(resultado.getDouble("IMPORTEARQUEO"));
                caja.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return caja;
    }

    public Caja obtenerCajaPorUsuario(int idusuario) throws Exception {
        Caja caja = null;
        String sql = "SELECT * FROM caja WHERE caja.FECHABAJA IS NULL AND caja.usuario_IDUSUARIO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idusuario);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                caja = new Caja();
                caja.setIdCaja(resultado.getInt("IDCAJA"));
                caja.setFechaApertura(resultado.getDate("FECHAAPERTURA"));
                caja.setImporteArqueo(resultado.getDouble("IMPORTEARQUEO"));
                caja.setUsuario(new Usuario().obtenerUsuario(idusuario));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return caja;
    }

    public ArrayList<Caja> listarCajas(java.util.Date fechaDesde, java.util.Date fechaHasta) throws Exception {
        ArrayList<Caja> cajas = new ArrayList<>();
        String sql = "SELECT * FROM caja WHERE caja.FECHABAJA IS NULL AND (caja.FECHAAPERTURA BETWEEN ? AND ?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(fechaDesde.getTime()));
            pst.setDate(2, new Date(fechaHasta.getTime()));
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Caja caja = new Caja();
                caja.setIdCaja(resultado.getInt("IDCAJA"));
                caja.setFechaApertura(resultado.getDate("FECHAAPERTURA"));
                caja.setImporteArqueo(resultado.getDouble("IMPORTEARQUEO"));
                caja.setFechaCierre(resultado.getDate("FECHACIERRE"));
                caja.setImporteCierre(resultado.getDouble("IMPORTECIERRE"));
                caja.setUsuario(new Usuario().obtenerUsuario(resultado.getInt("usuario_IDUSUARIO")));
                cajas.add(caja);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return cajas;
    }

}
