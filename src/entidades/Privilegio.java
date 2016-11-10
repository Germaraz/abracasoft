/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorPrivilegio;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Privilegio {
    private int idPrivilegio;
    private String privilegio;
    private Date fechaAltaPrivilegio;
    private Date fechaBajaPrivilegio;

    public Privilegio() {
    }

    public int getIdPrivilegio() {
        return idPrivilegio;
    }

    public void setIdPrivilegio(int idPrivilegio) {
        this.idPrivilegio = idPrivilegio;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public Date getFechaAltaPrivilegio() {
        return fechaAltaPrivilegio;
    }

    public void setFechaAltaPrivilegio(Date fechaAltaPrivilegio) {
        this.fechaAltaPrivilegio = fechaAltaPrivilegio;
    }

    public Date getFechaBajaPrivilegio() {
        return fechaBajaPrivilegio;
    }

    public void setFechaBajaPrivilegio(Date fechaBajaPrivilegio) {
        this.fechaBajaPrivilegio = fechaBajaPrivilegio;
    }
    
    public ArrayList<Privilegio> obtenerPrivilegios(Rol rol) throws Exception{
        return new GestorPrivilegio().obtenerPrivilegios(rol);
    } 
}
