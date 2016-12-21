/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Usuario {

    private int idUsuario;
    private String apellido;
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String passUsuario;
    private Date fechaCreacion;
    private Date fechaBajaUsuario;
    private Rol rol;

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaBajaUsuario() {
        return fechaBajaUsuario;
    }

    public void setFechaBajaUsuario(Date fechaBajaUsuario) {
        this.fechaBajaUsuario = fechaBajaUsuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public int altaUsuario(Usuario usuario) throws Exception, SQLException{
        return new GestorUsuario().altaUsuario(usuario);
    }

    public int bajaUsuario(Usuario usuario) throws Exception {
        return new GestorUsuario().darDeBajaUsuario(usuario);
    }

    public int modificarUsuario(Usuario usuario) throws Exception {
        return new GestorUsuario().modificarUsuario(usuario);
    }

    public ArrayList<Usuario> obtenerUsuarios() throws Exception {
        return new GestorUsuario().listarUsuarios();
    }

    public Usuario login(Usuario usuario) throws Exception {
        return new GestorUsuario().login(usuario);
    }

    public Usuario obtenerUsuarioPorApellidoyNombre(String apellidoYnombre) throws Exception {
        return new GestorUsuario().obtenerUsuarioPorApellidoyNombre(apellidoYnombre);
    }

    public Usuario obtenerUsuarioPorNombreUsuario(String nombreUsuario) throws Exception {
        return new GestorUsuario().obtenerUsuarioPorNombreUsuario(nombreUsuario);
    }

    public Usuario obtenerUsuario(int idUsuario) throws Exception {
        return new GestorUsuario().obtenerUsuario(idUsuario);
    }
}
