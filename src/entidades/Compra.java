/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorCompra;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ema
 */
public class Compra {

    private int idCompra;
    private Date fechaCompra;
    private float montoCompra;
    private float ivaCompra;
    private Date fechaBajaCompra;
    private Usuario usuario;
    private Proveedor proveedor;
    private ArrayList<Producto> productos;

    public Compra() {
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public float getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(float montoCompra) {
        this.montoCompra = montoCompra;
    }

    public float getIvaCompra() {
        return ivaCompra;
    }

    public void setIvaCompra(float ivaCompra) {
        this.ivaCompra = ivaCompra;
    }

    public Date getFechaBajaCompra() {
        return fechaBajaCompra;
    }

    public void setFechaBajaCompra(Date fechaBajaCompra) {
        this.fechaBajaCompra = fechaBajaCompra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int altaCompra(Compra compra) throws Exception {
        return new GestorCompra().altaCompra(compra);
    }

    public int modificarCompra(Compra compra) throws Exception {
        return new GestorCompra().modificarCompra(compra);
    }

    public int darDeBajaCompra(Compra compra) throws Exception {
        return new GestorCompra().darDeBajaCompra(compra);
    }

    public Compra obtenerCompra(int idCompra) throws Exception {
        return new GestorCompra().obtenerCompra(idCompra);
    }

    public ArrayList<Compra> listaCompras(Date fechaDesde, Date fechaHasta) throws Exception {
        return new GestorCompra().listarCompras(fechaDesde, fechaHasta);
    }

}
