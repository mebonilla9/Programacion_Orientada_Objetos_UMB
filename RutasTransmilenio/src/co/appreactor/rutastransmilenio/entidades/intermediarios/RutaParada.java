/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.rutastransmilenio.entidades.intermediarios;

import co.appreactor.rutastransmilenio.entidades.Parada;
import co.appreactor.rutastransmilenio.entidades.Ruta;

/**
 *
 * @author Lord_Nightmare
 */
public class RutaParada {
    
    private Ruta ruta;
    private Parada parada;

    public RutaParada() {
    }
    
    public RutaParada(Ruta ruta, Parada parada) {
        this.ruta = ruta;
        this.parada = parada;
    }

    /**
     * @return the ruta
     */
    public Ruta getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    /**
     * @return the parada
     */
    public Parada getParada() {
        return parada;
    }

    /**
     * @param parada the parada to set
     */
    public void setParada(Parada parada) {
        this.parada = parada;
    }
    
    
}
