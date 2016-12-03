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
public class Producto {
   private int idProducto;
   private int codigoBarra;
   private String nombreProducto;
   private String descripcionProducto;
   private Date fechaVencimientoProducto;
   private float precioUnitario;
   private int alicuota;
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

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
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

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getAlicuota() {
        return alicuota;
    }

    public void setAlicuota(int alicuota) {
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

    public Producto obtenerProducto(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
