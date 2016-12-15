/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Gasto {
    private int idGasto;
    private String descripcionGasto;
    private Date fechaGasto;
    private float montoGasto;
    private Date fechaBajaGasto;
    private Usuario usuario;

    public Gasto() {
    }

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public String getDescripcionGasto() {
        return descripcionGasto;
    }

    public void setDescripcionGasto(String descripcionGasto) {
        this.descripcionGasto = descripcionGasto;
    }

    public Date getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(Date fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    public float getMontoGasto() {
        return montoGasto;
    }

    public void setMontoGasto(float montoGasto) {
        this.montoGasto = montoGasto;
    }

    public Date getFechaBajaGasto() {
        return fechaBajaGasto;
    }

    public void setFechaBajaGasto(Date fechaBajaGasto) {
        this.fechaBajaGasto = fechaBajaGasto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
