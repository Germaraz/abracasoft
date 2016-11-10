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
public class Venta {
    private int idVenta;
    private Date fechaVenta;
    private float montoVenta;
    private float ivaVenta;
    private Date fechaBajaVenta;
    private Usuario usuario;
    private Cliente cliente;
    private Factura factura;

    public Venta() {
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public float getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(float montoVenta) {
        this.montoVenta = montoVenta;
    }

    public float getIvaVenta() {
        return ivaVenta;
    }

    public void setIvaVenta(float ivaVenta) {
        this.ivaVenta = ivaVenta;
    }

    public Date getFechaBajaVenta() {
        return fechaBajaVenta;
    }

    public void setFechaBajaVenta(Date fechaBajaVenta) {
        this.fechaBajaVenta = fechaBajaVenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    
}
