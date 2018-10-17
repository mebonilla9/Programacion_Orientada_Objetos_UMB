/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.rutastransmilenio.entidades;

import co.appreactor.rutastransmilenio.entidades.intermediarios.RutaParada;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class Parada {
    
    private String nombre;
    private String sentido;
    private String troncal;
    private List<RutaParada> listaRutas;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sentido
     */
    public String getSentido() {
        return sentido;
    }

    /**
     * @param sentido the sentido to set
     */
    public void setSentido(String sentido) {
        this.sentido = sentido;
    }

    /**
     * @return the troncal
     */
    public String getTroncal() {
        return troncal;
    }

    /**
     * @param troncal the troncal to set
     */
    public void setTroncal(String troncal) {
        this.troncal = troncal;
    }

    /**
     * @return the listaRutas
     */
    public List<RutaParada> getListaRutas() {
        return listaRutas;
    }

    /**
     * @param listaRutas the listaRutas to set
     */
    public void setListaRutas(List<RutaParada> listaRutas) {
        this.listaRutas = listaRutas;
    }
    
}
