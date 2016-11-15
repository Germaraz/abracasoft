/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Provincia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ema_s
 */
public class GestorProvincia extends PoolDeConexiones {

    public GestorProvincia() throws Exception {
        this.pedirConexion();
    }

    public Provincia obtenerProvincia(int idProvincia) throws Exception {
        Provincia provincia = new Provincia();
        String sql = "SELECT * FROM provincia WHERE provincia.FECHABAJA IS NULL AND provincia.IDPROVINCIA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idProvincia);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                provincia.setIdProvincia(resultado.getInt("IDPROVINCIA"));
                provincia.setNombreProvincia(resultado.getString("NOMBRE_PROVINCIA"));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return provincia;
    }
}
