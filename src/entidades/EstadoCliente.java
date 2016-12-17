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
public class EstadoCliente {

    private int idEstadoCliente;
    private String estadoCliente;
    private double saldo;
    private double interes;
    private Date fechaAltaEstadoCliente;
    private Date fechaBajaEstadoCliente;
    private Cliente cliente;

    public EstadoCliente() {
    }

    public int getIdEstadoCliente() {
        return idEstadoCliente;
    }

    public void setIdEstadoCliente(int idEstadoCliente) {
        this.idEstadoCliente = idEstadoCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public Date getFechaAltaEstadoCliente() {
        return fechaAltaEstadoCliente;
    }

    public void setFechaAltaEstadoCliente(Date fechaAltaEstadoCliente) {
        this.fechaAltaEstadoCliente = fechaAltaEstadoCliente;
    }

    public Date getFechaBajaEstadoCliente() {
        return fechaBajaEstadoCliente;
    }

    public void setFechaBajaEstadoCliente(Date fechaBajaEstadoCliente) {
        this.fechaBajaEstadoCliente = fechaBajaEstadoCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
