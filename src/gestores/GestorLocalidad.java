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
import java.sql.SQLException;

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
            pst.setInt(1, localidad.getIdLocalidad());
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                localidad.setIdLocalidad(resultado.getInt("IDLOCALIDAD"));
                localidad.setCodigoPosta(resultado.getInt("CODIGOPOSTAL"));
                localidad.setNombreLocalidad(resultado.getString("NOMBRE_LOCALIDAD"));
                localidad.setProvincia(new Provincia().obtenerProvincia(resultado.getInt("provincia_IDPROVINCIA")));
            }
        } catch (Exception e) {
            conexion.commit();
            throw new Exception(e.getMessage());
        }
        return localidad;
    }
}
