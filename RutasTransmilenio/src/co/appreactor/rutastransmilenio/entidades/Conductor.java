/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.rutastransmilenio.entidades;

import co.appreactor.rutastransmilenio.entidades.intermediarios.BusConductor;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class Conductor {
    
    private String nombre;
    private String documento;
    private String consorcio;
    private LocalTime[] horario;
    private List<BusConductor> buses;

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
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
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
     * @return the horario
     */
    public LocalTime[] getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(LocalTime[] horario) {
        this.horario = horario;
    }

    /**
     * @return the buses
     */
    public List<BusConductor> getBuses() {
        return buses;
    }

    /**
     * @param buses the buses to set
     */
    public void setBuses(List<BusConductor> buses) {
        this.buses = buses;
    }
    
}
