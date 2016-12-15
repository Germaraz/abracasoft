/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Localidad;
import entidades.Provincia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorLocalidad extends PoolDeConexiones {

    public GestorLocalidad() throws Exception {
        this.pedirConexion();
    }

    public Localidad obtenerLocalidad(int idLocalidad) throws Exception {
        Localidad localidad = new Localidad();
        String sql = "SELECT * FROM localidad WHERE localidad.FECHABAJA IS NULL AND localidad.IDLOCALIDAD = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idLocalidad);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                localidad.setIdLocalidad(resultado.getInt("IDLOCALIDAD"));
                localidad.setCodigoPosta(resultado.getInt("CODIGOPOSTAL"));
                localidad.setNombreLocalidad(resultado.getString("NOMBRE_LOCALIDAD"));
                localidad.setProvincia(new Provincia().obtenerProvincia(resultado.getInt("provincia_IDPROVINCIA")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return localidad;
    }

    public Localidad obtenerLocalidad(String nombreLocalidad) throws Exception {
        Localidad localidad = new Localidad();
        String sql = "SELECT * FROM localidad WHERE localidad.FECHABAJA IS NULL AND "
                + "localidad.NOMBRE_LOCALIDAD = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, nombreLocalidad);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                localidad.setIdLocalidad(resultado.getInt("IDLOCALIDAD"));
                localidad.setCodigoPosta(resultado.getInt("CODIGOPOSTAL"));
                localidad.setNombreLocalidad(resultado.getString("NOMBRE_LOCALIDAD"));
                localidad.setProvincia(new Provincia().obtenerProvincia(resultado.getInt("provincia_IDPROVINCIA")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return localidad;
    }

    public ArrayList<Localidad> listarLocalidades(int idProvincia) throws Exception {
        ArrayList<Localidad> localidades = new ArrayList<>();
        String sql = "SELECT * FROM localidad WHERE localidad.FECHABAJA IS NULL AND localidad.provincia_IDPROVINCIA = ? "
                + "ORDER BY localidad.NOMBRE_LOCALIDAD ASC";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idProvincia);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Localidad localidad = new Localidad();
                localidad.setIdLocalidad(resultado.getInt("IDLOCALIDAD"));
                localidad.setCodigoPosta(resultado.getInt("CODIGOPOSTAL"));
                localidad.setNombreLocalidad(resultado.getString("NOMBRE_LOCALIDAD"));
                //localidad.setProvincia(new Provincia().obtenerProvincia(resultado.getInt("provincia_IDPROVINCIA")));
                localidades.add(localidad);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        conexion.close();
        return localidades;
    }
}
