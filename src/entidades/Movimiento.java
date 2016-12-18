/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorMovimiento;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Movimiento {

    private int idMovimiento;
    private String descripcionMovimiento;
    private double montoMovimiento;
    private Date fechaMovimiento;
    private Date fechaBajaMovimiento;
    private Caja caja;
    private Venta venta;
    private Compra compra;
    private Gasto gasto;

    public Movimiento() {
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getDescripcionMovimiento() {
        return descripcionMovimiento;
    }

    public void setDescripcionMovimiento(String descripcionMovimiento) {
        this.descripcionMovimiento = descripcionMovimiento;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public Date getFechaBajaMovimiento() {
        return fechaBajaMovimiento;
    }

    public void setFechaBajaMovimiento(Date fechaBajaMovimiento) {
        this.fechaBajaMovimiento = fechaBajaMovimiento;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Gasto getGasto() {
        return gasto;
    }

    public void setGasto(Gasto gasto) {
        this.gasto = gasto;
    }

    public int altaMovimiento(Movimiento movimiento) throws Exception {
        return new GestorMovimiento().altaMovimiento(movimiento);
    }

    public int darDeBajaMovimiento(Movimiento movimiento) throws Exception {
        return new GestorMovimiento().darDeBajaMovimiento(movimiento);
    }

    public ArrayList<Movimiento> listarMovimientoPorCaja(int idcaja) throws Exception {
        return new GestorMovimiento().listarMovimientosPorCaja(idcaja);
    }

}
