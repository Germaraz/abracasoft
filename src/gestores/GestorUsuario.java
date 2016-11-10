/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Usuario;
import entidades.Rol;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorUsuario extends PoolDeConexiones {

    public GestorUsuario() throws Exception {
        this.pedirConexion();
    }

    public boolean altaUsuario(Usuario usuario) throws SQLException {
        boolean resultado = false;
        String sql = "INSERT INTO usuario (APELLIDO, NOMBRE, NOMBREUSUARIO, EMAIL, PASSUSUARIO, rol_IDROL) "
                + "VALUES (?,?,?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, usuario.getApellido());
            pst.setString(2, usuario.getNombre());
            pst.setString(3, usuario.getNombreUsuario());
            pst.setString(4, usuario.getEmail());
            pst.setString(5, usuario.getPassUsuario());
            pst.setInt(6, usuario.getRol().getIdRol());
            resultado = pst.execute();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
        }
        return resultado;
    }

    public int modificarUsuario(Usuario usuario) throws SQLException {
        int resultado = 0;
        String sql = "UPDATE usuario SET APELLIDO = ?, NOMBRE = ?, NOMBREUSUARIO = ?, "
                + "EMAIL = ?, PASSUSUARIO = ?, rol_IDROL = ? WHERE IDUSUARIO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, usuario.getApellido());
            pst.setString(2, usuario.getNombre());
            pst.setString(3, usuario.getNombreUsuario());
            pst.setString(4, usuario.getEmail());
            pst.setString(5, usuario.getPassUsuario());
            pst.setInt(6, usuario.getRol().getIdRol());
            pst.setInt(7, usuario.getIdUsuario());
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            conexion.rollback();
        }
        return resultado;
    }

    public boolean darDeBajaUsuario(Usuario usuario) throws SQLException {
        boolean resultado = false;
        String sql = "INSERT INTO usuario (FECHABAJA) VALUES (?) WHERE IDUSUARIO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, (Date) usuario.getFechaBajaUsuario());
            pst.setInt(2, usuario.getIdUsuario());
            resultado = pst.execute();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
        }
        return resultado;
    }

    public ArrayList<Usuario> listarUsuarios() throws SQLException {
        ArrayList<Usuario> usuarios = null;
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuario WHERE FECHABAJA IS NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                usuario.setIdUsuario(resultado.getInt("IDUSUARIO"));
                usuario.setApellido(resultado.getString("APELLIDO"));
                usuario.setNombre(resultado.getString("NOMBRE"));
                usuario.setNombreUsuario(resultado.getString("NOMBREUSUARIO"));
                usuario.setPassUsuario(resultado.getString("PASSUSUARIO"));
                usuario.setEmail(resultado.getString("EMAIL"));
                usuario.setFechaCreacion(resultado.getDate("FECHACREACION"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            conexion.rollback();
        }
        return usuarios;
    }

    public Usuario login(Usuario usuario) throws SQLException {
        Usuario usuario1 = new Usuario();
        String sql = "SELECT * FROM usuario WHERE NOMBREUSUARIO = ? AND PASSUSUARIO = ? AND FECHABAJA IS NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, usuario.getNombreUsuario());
            pst.setString(2, usuario.getPassUsuario());
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                usuario1.setIdUsuario(resultado.getInt("IDUSUARIO"));
                usuario1.setApellido(resultado.getString("APELLIDO"));
                usuario1.setNombre(resultado.getString("NOMBRE"));
                usuario1.setNombreUsuario(resultado.getString("NOMBREUSUARIO"));
                usuario1.setPassUsuario(resultado.getString("PASSUSUARIO"));
                usuario1.setEmail(resultado.getString("EMAIL"));
                usuario1.setFechaCreacion(resultado.getDate("FECHACREACION"));
            }
        } catch (Exception e) {
            conexion.rollback();
        }
        return usuario1;
    }

    public Usuario obtenerUsuarioPorApellidoyNombre(String apellidoYNombre) throws SQLException {
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuario WHERE TRIM(CONCAT(APELLIDO,NOMBRE)) LIKE '?%'";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, apellidoYNombre.trim());
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                usuario.setIdUsuario(resultado.getInt("IDUSUARIO"));
                usuario.setApellido(resultado.getString("APELLIDO"));
                usuario.setNombre(resultado.getString("NOMBRE"));
                usuario.setNombreUsuario(resultado.getString("NOMBREUSUARIO"));
                usuario.setPassUsuario(resultado.getString("PASSUSUARIO"));
                usuario.setEmail(resultado.getString("EMAIL"));
                usuario.setFechaCreacion(resultado.getDate("FECHACREACION"));
            }
        } catch (Exception e) {
            conexion.rollback();
        }
        return usuario;
    }

    public Usuario obtenerUsuarioPorNombreUsuario(String nombreUsuario) throws SQLException {
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuario WHERE TRIM(nombreUsuario) LIKE '?%'";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, nombreUsuario.trim());
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                usuario.setIdUsuario(resultado.getInt("IDUSUARIO"));
                usuario.setApellido(resultado.getString("APELLIDO"));
                usuario.setNombre(resultado.getString("NOMBRE"));
                usuario.setNombreUsuario(resultado.getString("NOMBREUSUARIO"));
                usuario.setPassUsuario(resultado.getString("PASSUSUARIO"));
                usuario.setEmail(resultado.getString("EMAIL"));
                usuario.setFechaCreacion(resultado.getDate("FECHACREACION"));
            }
        } catch (Exception e) {
            conexion.rollback();
        }
        return usuario;
    }

    public ArrayList<Usuario> listarUsuariosDadosDeBaja() throws SQLException {
        ArrayList<Usuario> usuarios = null;
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuario WHERE FECHABAJA IS NOT NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                usuario.setIdUsuario(resultado.getInt("IDUSUARIO"));
                usuario.setApellido(resultado.getString("APELLIDO"));
                usuario.setNombre(resultado.getString("NOMBRE"));
                usuario.setNombreUsuario(resultado.getString("NOMBREUSUARIO"));
                usuario.setPassUsuario(resultado.getString("PASSUSUARIO"));
                usuario.setEmail(resultado.getString("EMAIL"));
                usuario.setFechaCreacion(resultado.getDate("FECHACREACION"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            conexion.rollback();
        }
        return usuarios;
    }
}
