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
public class Proveedor {

    private int idProveedor;
    private int cuit;
    private String razonSocial;
    private String nombreFantasia;
    private Date fechaAltaProveedor;
    private Date fechaBajaProveedor;

    public Proveedor() {
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    public Date getFechaAltaProveedor() {
        return fechaAltaProveedor;
    }

    public void setFechaAltaProveedor(Date fechaAltaProveedor) {
        this.fechaAltaProveedor = fechaAltaProveedor;
    }

    public Date getFechaBajaProveedor() {
        return fechaBajaProveedor;
    }

    public void setFechaBajaProveedor(Date fechaBajaProveedor) {
        this.fechaBajaProveedor = fechaBajaProveedor;
    }

}
