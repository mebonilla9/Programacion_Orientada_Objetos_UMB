/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.rutastransmilenio.entidades.intermediarios;

import co.appreactor.rutastransmilenio.entidades.Bus;
import co.appreactor.rutastransmilenio.entidades.Conductor;

/**
 *
 * @author Lord_Nightmare
 */
public class BusConductor {
    
    private Bus bus;
    private Conductor conductor;

    public BusConductor(Bus bus, Conductor conductor) {
        this.bus = bus;
        this.conductor = conductor;
    }
    
    /**
     * @return the bus
     */
    public Bus getBus() {
        return bus;
    }

    /**
     * @param bus the bus to set
     */
    public void setBus(Bus bus) {
        this.bus = bus;
    }

    /**
     * @return the conductor
     */
    public Conductor getConductor() {
        return conductor;
    }

    /**
     * @param conductor the conductor to set
     */
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    
}
