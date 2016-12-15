/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import gestores.GestorLocalidad;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class Localidad {

    private int idLocalidad;
    private String nombreLocalidad;
    private int codigoPosta;
    private Provincia provincia;

    public Localidad() {
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public int getCodigoPosta() {
        return codigoPosta;
    }

    public void setCodigoPosta(int codigoPosta) {
        this.codigoPosta = codigoPosta;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Localidad obtenerLocalidad(int idLocalidad) throws Exception {
        return new GestorLocalidad().obtenerLocalidad(idLocalidad);
    }

    public Localidad obtenerLocalidad(String nombreLocalidad) throws Exception {
        return new GestorLocalidad().obtenerLocalidad(nombreLocalidad);
    }

    public ArrayList<Localidad> listarLocalidades(int idProvincia) throws Exception {
        return new GestorLocalidad().listarLocalidades(idProvincia);
    }
}
