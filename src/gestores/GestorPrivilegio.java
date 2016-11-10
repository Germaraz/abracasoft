/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Privilegio;
import entidades.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ema
 */
public class GestorPrivilegio extends PoolDeConexiones {

    public GestorPrivilegio() throws Exception {
        this.pedirConexion();
    }

    public ArrayList<Privilegio> listarPrivilegios() throws Exception {
        ArrayList<Privilegio> listaPrivilegio = null;
        String sql = "SELECT * FROM habilidad WHERE habilidad.FECHABAJA IS NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Privilegio privilegio = new Privilegio();
                privilegio.setIdPrivilegio(resultado.getInt("IDHABILIDAD"));
                privilegio.setPrivilegio(resultado.getString("HABILIDAD"));
                privilegio.setFechaAltaPrivilegio(resultado.getDate("FECHAALTA"));
                listaPrivilegio.add(privilegio);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return listaPrivilegio;
    }
    
    public ArrayList<Privilegio> obtenerPrivilegios(Rol rol) throws Exception{
        ArrayList<Privilegio> listaPrivilegio = null;
        String sql = "SELECT rol_habilidad.habilidad_IDHABILIDAD, habilidad.HABILIDAD, habilidad.FECHAALTA "
                + "FROM rol_habilidad "
                + "WHERE rol_habilidad.habilidad_IDHABILIDAD = habilidad.IDHABILIDAD "
                + "AND rol_habilidad.rol_IDROL = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, rol.getIdRol());
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Privilegio privilegio = new Privilegio();
                privilegio.setIdPrivilegio(resultado.getInt("IDHABILIDAD"));
                privilegio.setPrivilegio(resultado.getString("HABILIDAD"));
                privilegio.setFechaAltaPrivilegio(resultado.getDate("FECHAALTA"));
                listaPrivilegio.add(privilegio);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return listaPrivilegio;
    }

}
