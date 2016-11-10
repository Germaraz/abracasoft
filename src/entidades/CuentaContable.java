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
public class CuentaContable {

    private int idCuentaContable;
    private String cuentaContable;
    private float debe;
    private float haber;
    private Date fechaAltaCuentaContable;
    private Date fechaBajaCuentaContable;
    private TipoCuentaContable tipoCuentaContable;

    public CuentaContable() {
    }

    public int getIdCuentaContable() {
        return idCuentaContable;
    }

    public void setIdCuentaContable(int idCuentaContable) {
        this.idCuentaContable = idCuentaContable;
    }

    public String getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(String cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    public float getDebe() {
        return debe;
    }

    public void setDebe(float debe) {
        this.debe = debe;
    }

    public float getHaber() {
        return haber;
    }

    public void setHaber(float haber) {
        this.haber = haber;
    }

    public Date getFechaAltaCuentaContable() {
        return fechaAltaCuentaContable;
    }

    public void setFechaAltaCuentaContable(Date fechaAltaCuentaContable) {
        this.fechaAltaCuentaContable = fechaAltaCuentaContable;
    }

    public Date getFechaBajaCuentaContable() {
        return fechaBajaCuentaContable;
    }

    public void setFechaBajaCuentaContable(Date fechaBajaCuentaContable) {
        this.fechaBajaCuentaContable = fechaBajaCuentaContable;
    }

    public TipoCuentaContable getTipoCuentaContable() {
        return tipoCuentaContable;
    }

    public void setTipoCuentaContable(TipoCuentaContable tipoCuentaContable) {
        this.tipoCuentaContable = tipoCuentaContable;
    }

}
