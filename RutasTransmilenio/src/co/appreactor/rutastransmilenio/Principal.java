/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.rutastransmilenio;

import co.appreactor.rutastransmilenio.entidades.Ruta;
import java.time.LocalTime;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Declaracion de un objeto de ruta de transmilenio
         */
        
        Ruta rutaUno = new Ruta();
        rutaUno.setNombre("M81");
        rutaUno.setPuntoInicio("Puente Guadua");
        rutaUno.setPuntoFin("Museo Nacional");
        
        rutaUno.establecerHoraInicio(LocalTime.MIN);
        rutaUno.establecerHoraInicio(LocalTime.NOON);
        
    }
    
}
