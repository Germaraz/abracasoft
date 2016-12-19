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
    private double montoCompra;
    private double ivaCompra;
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

    public double getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(double montoCompra) {
        this.montoCompra = montoCompra;
    }

    public double getIvaCompra() {
        return ivaCompra;
    }

    public void setIvaCompra(double ivaCompra) {
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
        int idCompraNueva;
        int resultado = 0;
        GestorCompra gestComp = new GestorCompra();
        idCompraNueva = gestComp.altaCompra(compra);
        if (idCompraNueva != 0) {
            for (int i = 0; i < compra.getProductos().size(); i++) {
                if (gestComp.altaDetalleCompra(idCompraNueva, compra.getProductos().get(i).getIdProducto()) != 0) {
                    resultado++;
                } else {
                    throw new Exception("No se logro guardar un detalle de compra");
                }
            }
        } else {
            throw new Exception("No se logro guardar la compra");
        }
        if (resultado == compra.getProductos().size()) {
            return idCompraNueva;
        } else {
            return 0;
        }
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

    public ArrayList<Compra> obtenerComprasProveedor(int idProveedor) throws Exception {
        return new GestorCompra().obtenerComprasProveedor(idProveedor);
    }

}
