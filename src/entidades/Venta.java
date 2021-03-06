/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorVenta;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Venta {

    private int idVenta;
    private Date fechaVenta;
    private double montoVenta;
    private double ivaVenta;
    private Date fechaBajaVenta;
    private Usuario usuario;
    private Cliente cliente;
    private Factura factura;
    private ArrayList<Producto> productos;

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

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }

    public double getIvaVenta() {
        return ivaVenta;
    }

    public void setIvaVenta(double ivaVenta) {
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int altaVenta(Venta venta) throws Exception {
        int idVentaNueva;
        int resultado = 0;
        GestorVenta gestVen = new GestorVenta();
        idVentaNueva = gestVen.altaVenta(venta);
        if (idVentaNueva != 0) {
            for (int i = 0; i < venta.getProductos().size(); i++) {
                if (gestVen.altaDetalleVenta(idVentaNueva, venta.getProductos().get(i).getIdProducto()) != 0) {
                    resultado++;
                } else {
                    throw new Exception("No se logro guardar un detalle de compra");
                }
            }
        } else {
            throw new Exception("No se logro guardar la compra");
        }
        if (resultado == venta.getProductos().size()) {
            return idVentaNueva;
        } else {
            return 0;
        }
    }

    public int modificarVenta(Venta venta) throws Exception {
        return new GestorVenta().modificaVenta(venta);
    }

    public int darDeBajaVenta(Venta venta) throws Exception {
        return new GestorVenta().darDeBajaVenta(venta);
    }

    public Venta obtenerVenta(int idventa) throws Exception {
        return new GestorVenta().obtenerVenta(idventa);
    }

    public ArrayList<Venta> obtenerVentasCliente(int idCliente) throws Exception {
        return new GestorVenta().obtenerVentasCliente(idCliente);
    }

    public ArrayList<Venta> listarVentas(Date desde, Date hasta) throws Exception {
        return new GestorVenta().listarVentas(desde, hasta);
    }

}
