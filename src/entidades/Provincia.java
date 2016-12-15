/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorProvincia;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class Provincia {

    private int idProvincia;
    private String nombreProvincia;

    public Provincia() {
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public Provincia obtenerProvincia(int idProvincia) throws Exception {
        return new GestorProvincia().obtenerProvincia(idProvincia);
    }
    
    public ArrayList<Provincia> listarProvincias() throws Exception{
        return new GestorProvincia().listarProvincias();
    }

}
