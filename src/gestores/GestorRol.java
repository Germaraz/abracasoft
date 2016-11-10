/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorRol extends PoolDeConexiones {

    public GestorRol() throws Exception {
        this.pedirConexion();
    }

    public ArrayList<Rol> listarRoles() throws Exception {
        ArrayList<Rol> roles = null;
        Rol rol = new Rol();
        String sql = "SELECT * FROM rol WHERE rol.FECHABAJA IS NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                rol.setIdRol(resultado.getInt("IDROL"));
                rol.setRol(resultado.getString("ROL"));
                rol.setFechaAltaRol(resultado.getDate("FECHAALTA"));
                roles.add(rol);
            }
        } catch (Exception e) {
            conexion.rollback();
        }
        return roles;
    }
    
    public Rol obtenerRolPorNombre(String nombreRol) throws SQLException{
        Rol rol = null;
        String sql = "SELECT * FROM rol WHERE rol.FECHABAJA IS NULL AND rol.ROL = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, nombreRol);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                rol.setIdRol(resultado.getInt("IDROL"));
                rol.setRol(resultado.getString("ROL"));
                rol.setFechaAltaRol(resultado.getDate("FECHAALTA"));
            }
        } catch (Exception e) {
            conexion.rollback();
        }
        return rol;
    }
}
