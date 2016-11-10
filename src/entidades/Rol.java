/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorRol;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Rol {

    private int idRol;
    private String rol;
    private Date fechaAltaRol;
    private Date fechaBajaRol;

    public Rol() {
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getFechaAltaRol() {
        return fechaAltaRol;
    }

    public void setFechaAltaRol(Date fechaAltaRol) {
        this.fechaAltaRol = fechaAltaRol;
    }

    public Date getFechaBajaRol() {
        return fechaBajaRol;
    }

    public void setFechaBajaRol(Date fechaBajaRol) {
        this.fechaBajaRol = fechaBajaRol;
    }
    
    public ArrayList<Rol> obtenerRoles() throws Exception{
        return new GestorRol().listarRoles();
    }
    
    public Rol obtenerRolPorNombre(String nombreRol) throws Exception{
        return new GestorRol().obtenerRolPorNombre(nombreRol);
    }
}
