/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.apprector.vehiculos.partes;

/**
 *
 * @author Lord_Nightmare
 */
public class Tanque {
    
    private double capacidad;
    private double gasolinaActual;
    
    
    public void tanquear(double gasolina){
        if (gasolina > capacidad) {
            gasolinaActual = capacidad;
            return;
        }
        gasolinaActual = gasolina;
    }
}
