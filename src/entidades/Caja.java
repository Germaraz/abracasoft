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
    private float importeArqueo;
    private float importeCierre;
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

    public float getImporteArqueo() {
        return importeArqueo;
    }

    public void setImporteArqueo(float importeArqueo) {
        this.importeArqueo = importeArqueo;
    }

    public float getImporteCierre() {
        return importeCierre;
    }

    public void setImporteCierre(float importeCierre) {
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
