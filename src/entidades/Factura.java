/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorFactura;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Factura {

    private int idFactura;
    private String tipoFactura;
    private int porcIVA;
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

    public int getPorcIVA() {
        return porcIVA;
    }

    public void setPorcIVA(int porcIVA) {
        this.porcIVA = porcIVA;
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

    public Factura obtenerFactura(String tipofactura) throws Exception {
        return new GestorFactura().obtenerFactura(tipofactura);
    }

    public ArrayList<Factura> listarFacturas() throws Exception {
        return new GestorFactura().listarFacturas();
    }

}
