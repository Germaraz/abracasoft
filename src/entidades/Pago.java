/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorPago;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Pago {

    private int idPago;
    private double montoPago;
    private Date fechaPago;
    private Date fechaBajaPago;
    private Venta venta;
    private TipoPago tipoPago;
    private Compra compra;

    public Pago() {
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaBajaPago() {
        return fechaBajaPago;
    }

    public void setFechaBajaPago(Date fechaBajaPago) {
        this.fechaBajaPago = fechaBajaPago;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Pago obtenerPago(int idPago) throws Exception {
        return new GestorPago().obtenerPago(idPago);
    }

    public Pago obtenerPagoCompra(int idCompra) throws Exception {
        return new GestorPago().obtenerPagoCompra(idCompra);
    }

    public ArrayList<Pago> obtenerPagosVenta(int idVenta) throws Exception {
        return new GestorPago().obtenerPagosVenta(idVenta);
    }
}
