/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Rol;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorUsuario extends PoolDeConexiones {

    public GestorUsuario() throws Exception {
        this.pedirConexion();
    }

    public int altaUsuario(Usuario usuario) throws Exception {
        int resultado = 0;
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
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int modificarUsuario(Usuario usuario) throws Exception {
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
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaUsuario(Usuario usuario) throws Exception {
        int resultado = 0;
        String sql = "UPDATE usuario SET FECHABAJA = ? WHERE IDUSUARIO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, (Date) usuario.getFechaBajaUsuario());
            pst.setInt(2, usuario.getIdUsuario());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public ArrayList<Usuario> listarUsuarios() throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario WHERE FECHABAJA IS NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(resultado.getInt("IDUSUARIO"));
                usuario.setApellido(resultado.getString("APELLIDO"));
                usuario.setNombre(resultado.getString("NOMBRE"));
                usuario.setNombreUsuario(resultado.getString("NOMBREUSUARIO"));
                usuario.setPassUsuario(resultado.getString("PASSUSUARIO"));
                usuario.setEmail(resultado.getString("EMAIL"));
                usuario.setFechaCreacion(resultado.getDate("FECHACREACION"));
                usuario.setRol(new Rol().obtenerRol(resultado.getInt("rol_IDROL")));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return usuarios;
    }

    public Usuario login(Usuario usuario) throws Exception {
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
                usuario1.setRol(new Rol().obtenerRol(resultado.getInt("rol_IDROL")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return usuario1;
    }

    public Usuario obtenerUsuarioPorApellidoyNombre(String apellidoYNombre) throws Exception {
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
                usuario.setRol(new Rol().obtenerRol(resultado.getInt("rol_IDROL")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return usuario;
    }

    public Usuario obtenerUsuarioPorNombreUsuario(String nombreUsuario) throws Exception {
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
                usuario.setRol(new Rol().obtenerRol(resultado.getInt("rol_IDROL")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return usuario;
    }

    public ArrayList<Usuario> listarUsuariosDadosDeBaja() throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario WHERE FECHABAJA IS NOT NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(resultado.getInt("IDUSUARIO"));
                usuario.setApellido(resultado.getString("APELLIDO"));
                usuario.setNombre(resultado.getString("NOMBRE"));
                usuario.setNombreUsuario(resultado.getString("NOMBREUSUARIO"));
                usuario.setPassUsuario(resultado.getString("PASSUSUARIO"));
                usuario.setEmail(resultado.getString("EMAIL"));
                usuario.setFechaCreacion(resultado.getDate("FECHACREACION"));
                usuario.setRol(new Rol().obtenerRol(resultado.getInt("rol_IDROL")));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return usuarios;
    }

    public Usuario obtenerUsuario(int idUsuario) throws Exception {
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuario WHERE usuario.FECHABAJA IS NULL AND usuario.IDUSUARIO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idUsuario);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                usuario.setIdUsuario(idUsuario);
                usuario.setApellido(resultado.getString("APELLIDO"));
                usuario.setNombre(resultado.getString("NOMBRE"));
                usuario.setNombreUsuario(resultado.getString("NOMBREUSUARIO"));
                usuario.setPassUsuario(resultado.getString("PASS"));
                usuario.setEmail(resultado.getString("EMAIL"));
                usuario.setFechaCreacion(resultado.getDate("FECHACREACION"));
                usuario.setRol(new Rol().obtenerRol(resultado.getInt("rol_IDROL")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return usuario;
    }
}
