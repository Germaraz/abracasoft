/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorTipoPago;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class TipoPago {

    private int idTipoPago;
    private String tipoPago;
    private int cuotas;
    private float bonificacion;
    private Date fechaBajaTipoPago;

    public TipoPago() {
    }

    public int getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public float getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }

    public Date getFechaBajaTipoPago() {
        return fechaBajaTipoPago;
    }

    public void setFechaBajaTipoPago(Date fechaBajaTipoPago) {
        this.fechaBajaTipoPago = fechaBajaTipoPago;
    }

    public TipoPago obtenerTipoPago(int idTipoPago) throws Exception {
        return new GestorTipoPago().obtenerTipoPago(idTipoPago);
    }

}
