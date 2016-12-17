/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorCliente;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ema_s
 */
public class Cliente {

    private int idCliente;
    private int dniCliente;
    private String sexo;
    private String nombreCliente;
    private String apellidoCliente;
    private Date fechaNacimiento;
    private String direccionCliente;
    private String mailCliente;
    private long telefonoCliente;
    private Date fechaAltaCliente;
    private Date fechaBajaCliente;
    private Localidad localidad;

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getMailCliente() {
        return mailCliente;
    }

    public void setMailCliente(String mailCliente) {
        this.mailCliente = mailCliente;
    }

    public long getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(long telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Date getFechaAltaCliente() {
        return fechaAltaCliente;
    }

    public void setFechaAltaCliente(Date fechaAltaCliente) {
        this.fechaAltaCliente = fechaAltaCliente;
    }

    public Date getFechaBajaCliente() {
        return fechaBajaCliente;
    }

    public void setFechaBajaCliente(Date fechaBajaCliente) {
        this.fechaBajaCliente = fechaBajaCliente;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public int altaCliente(Cliente cliente) throws Exception {
        return new GestorCliente().altaCliente(cliente);
    }

    public int modificarCliente(Cliente cliente) throws Exception {
        return new GestorCliente().modificarCliente(cliente);
    }

    public int darDeBajaCliente(Cliente cliente) throws Exception {
        return new GestorCliente().darDeBajaCliente(cliente);
    }

    public ArrayList<Cliente> listarClientes() throws Exception {
        return new GestorCliente().listarClientes();
    }

    public Cliente obtenerCliente(int dni) throws Exception {
        return new GestorCliente().obtenerClientePorDoc(dni);
    }

    public Cliente obtenerCliente(String apellidoNombre) throws Exception {
        return new GestorCliente().obtenerCliente(apellidoNombre);
    }

    public Cliente obtenerClientePorId(int idCliente) throws Exception {
        return new GestorCliente().obtenerClientePorId(idCliente);
    }
}
