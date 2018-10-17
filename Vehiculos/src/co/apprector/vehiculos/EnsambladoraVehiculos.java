/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.apprector.vehiculos;

import co.apprector.vehiculos.tipos.Bus;

/**
 *
 * @author Lord_Nightmare
 */
public class EnsambladoraVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bus bus = new Bus();
        bus.ensamblar();
        bus.acelerar();
    }
    
}
