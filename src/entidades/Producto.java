/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorProducto;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Producto {

    private int idProducto;
    private long codigoBarra;
    private String nombreProducto;
    private String descripcionProducto;
    private Date fechaVencimientoProducto;
    private double precioUnitario;
    private double alicuota;
    private int stock;
    private Date fechaAltaProducto;
    private Date fechaBajaProducto;

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public long getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(long codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Date getFechaVencimientoProducto() {
        return fechaVencimientoProducto;
    }

    public void setFechaVencimientoProducto(Date fechaVencimientoProducto) {
        this.fechaVencimientoProducto = fechaVencimientoProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getAlicuota() {
        return alicuota;
    }

    public void setAlicuota(double alicuota) {
        this.alicuota = alicuota;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getFechaAltaProducto() {
        return fechaAltaProducto;
    }

    public void setFechaAltaProducto(Date fechaAltaProducto) {
        this.fechaAltaProducto = fechaAltaProducto;
    }

    public Date getFechaBajaProducto() {
        return fechaBajaProducto;
    }

    public void setFechaBajaProducto(Date fechaBajaProducto) {
        this.fechaBajaProducto = fechaBajaProducto;
    }

    public int altaProducto(Producto producto) throws Exception {
        return new GestorProducto().altaProducto(producto);
    }

    public int modificarProducto(Producto producto) throws Exception {
        return new GestorProducto().modificarProducto(producto);
    }

    public int darDebajaProducto(Producto producto) throws Exception {
        return new GestorProducto().darDeBajaProducto(producto);
    }

    public Producto obtenerProducto(int idProducto) throws Exception {
        return new GestorProducto().obtenerProducto(idProducto);
    }

    public ArrayList<Producto> obtenerProductosCodBarra(int codigobarra) throws Exception {
        return new GestorProducto().obtenerProductosCodBarra(codigobarra);
    }

    public ArrayList<Producto> obtenerProductosDescripcion(String descripcion) throws Exception {
        return new GestorProducto().obtenerProductosDescripcion(descripcion);
    }

    public ArrayList<Producto> listarProductos() throws Exception {
        return new GestorProducto().listarProductos();
    }

    public Producto obtenerProductoCodBarra(long codigoBarra) throws Exception {
        return new GestorProducto().obtenerProductoCodBarra(codigoBarra);
    }
}
