/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorProveedor;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Proveedor {

    private int idProveedor;
    private long cuit;
    private String razonSocial;
    private String nombreFantasia;
    private String direccionProveedor;
    private long telefonoProveedor;
    private String mailProveedor;
    private Date fechaAltaProveedor;
    private Date fechaBajaProveedor;
    private Localidad localidad;

    public Proveedor() {
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
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

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public long getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(long telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getMailProveedor() {
        return mailProveedor;
    }

    public void setMailProveedor(String mailProveedor) {
        this.mailProveedor = mailProveedor;
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

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public int altaProveedor(Proveedor proveedor) throws Exception {
        return new GestorProveedor().altaProveedor(proveedor);
    }

    public int modificarProveedor(Proveedor proveedor) throws Exception {
        return new GestorProveedor().modificarProveedor(proveedor);
    }

    public int darDeBajaProveedor(Proveedor proveedor) throws Exception {
        return new GestorProveedor().darDeBajaProveedor(proveedor);
    }

    public Proveedor obtenerProveedor(int idProveedor) throws Exception {
        return new GestorProveedor().obtenerProveedor(idProveedor);
    }

    public Proveedor obtenerProveedor(String nombrefantasia) throws Exception {
        return new GestorProveedor().obtenerProveedor(nombrefantasia);
    }

    public ArrayList<Proveedor> obtenerProveedores() throws Exception {
        return new GestorProveedor().obtenerProveedores();
    }

    public ArrayList<Proveedor> obtenerProveedoresRazonSocial(String razonSocial) throws Exception {
        return new GestorProveedor().obtenerProveedoresPorRazonSocial(razonSocial);
    }

    public ArrayList<Proveedor> obtenerProveedoresNombreFantasia(String nombrefantasia) throws Exception {
        return new GestorProveedor().obtenerProveedoresPorNombreFantasia(nombrefantasia);
    }
}
