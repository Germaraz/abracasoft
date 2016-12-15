/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorPromocion;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Promocion {
    private int idPromocion;
    private String descripPromo;
    private Date fechaVencimientoPromo;
    private Producto producto;

    public Promocion() {
    }

    public int getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

    public String getDescripPromo() {
        return descripPromo;
    }

    public void setDescripPromo(String descripPromo) {
        this.descripPromo = descripPromo;
    }

    public Date getFechaVencimientoPromo() {
        return fechaVencimientoPromo;
    }

    public void setFechaVencimientoPromo(Date fechaVencimientoPromo) {
        this.fechaVencimientoPromo = fechaVencimientoPromo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public Promocion obtenerPromocion(int idPromocion) throws Exception {
        return new GestorPromocion().obtenerPromocion(idPromocion);
    }
    
    
}
