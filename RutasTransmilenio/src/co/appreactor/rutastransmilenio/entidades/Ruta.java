/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.rutastransmilenio.entidades;

import co.appreactor.rutastransmilenio.entidades.intermediarios.RutaParada;
import co.appreactor.rutastransmilenio.entidades.intermediarios.BusConductor;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class Ruta {
    
    private String puntoInicio;
    private String puntoFin;
    private String nombre;
    private List<BusConductor> listaConductores;
    private List<RutaParada> listaParadas;

    public void establecerHoraInicio(LocalTime hora){
        listaConductores.forEach((conductor) -> {
            conductor.getConductor().getHorario()[0] = hora;
        });
    }
    
    public void establecerHoraFin(LocalTime hora){
        listaConductores.forEach((conductor) -> {
            conductor.getConductor().getHorario()[1] = hora;
        });
    }
    
    /**
     * @return the puntoInicio
     */
    public String getPuntoInicio() {
        return puntoInicio;
    }

    /**
     * @param puntoInicio the puntoInicio to set
     */
    public void setPuntoInicio(String puntoInicio) {
        this.puntoInicio = puntoInicio;
    }

    /**
     * @return the puntoFin
     */
    public String getPuntoFin() {
        return puntoFin;
    }

    /**
     * @param puntoFin the puntoFin to set
     */
    public void setPuntoFin(String puntoFin) {
        this.puntoFin = puntoFin;
    }

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

    /**
     * @return the listaParadas
     */
    public List<RutaParada> getListaParadas() {
        return listaParadas;
    }

    /**
     * @param listaParadas the listaParadas to set
     */
    public void setListaParadas(List<RutaParada> listaParadas) {
        this.listaParadas = listaParadas;
    }
    
    
    
}
