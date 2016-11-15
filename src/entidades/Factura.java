/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorFactura;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Factura {

    private int idFactura;
    private String tipoFactura;
    private Date fechaFactura;
    private Date fechaBajaFactura;

    public Factura() {
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Date getFechaBajaFactura() {
        return fechaBajaFactura;
    }

    public void setFechaBajaFactura(Date fechaBajaFactura) {
        this.fechaBajaFactura = fechaBajaFactura;
    }

    public Factura obtenerFactura(int idFactura) throws Exception {
        return new GestorFactura().obtenerFactura(idFactura);
    }

}
