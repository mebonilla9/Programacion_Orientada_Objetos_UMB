/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.rutastransmilenio.entidades;

import co.appreactor.rutastransmilenio.entidades.intermediarios.BusConductor;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class Bus {
    
    private String placa;
    private String modelo;
    private String kilometraje;
    private String consorcio;
    private List<BusConductor> listaConductores;

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the kilometraje
     */
    public String getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the consorcio
     */
    public String getConsorcio() {
        return consorcio;
    }

    /**
     * @param consorcio the consorcio to set
     */
    public void setConsorcio(String consorcio) {
        this.consorcio = consorcio;
    }

    /**
     * @return the listaConductores
     */
    public List<BusConductor> getListaConductores() {
        return listaConductores;
    }

    /**
     * @param listaConductores the listaConductores to set
     */
    public void setListaConductores(List<BusConductor> listaConductores) {
        this.listaConductores = listaConductores;
    }
    
}
