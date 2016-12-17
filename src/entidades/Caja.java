/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.Date;

/**
 *
 * @author Ema
 */
public class Caja {
    private int idCaja;
    private double importeArqueo;
    private double importeCierre;
    private Date fechaApertura;
    private Date fechaCierre;
    private Date fechaBaja;

    public Caja() {
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public double getImporteArqueo() {
        return importeArqueo;
    }

    public void setImporteArqueo(double importeArqueo) {
        this.importeArqueo = importeArqueo;
    }

    public double getImporteCierre() {
        return importeCierre;
    }

    public void setImporteCierre(double importeCierre) {
        this.importeCierre = importeCierre;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
    
}
