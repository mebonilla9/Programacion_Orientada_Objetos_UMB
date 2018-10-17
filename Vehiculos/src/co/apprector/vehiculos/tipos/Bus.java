/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.apprector.vehiculos.tipos;

import co.apprector.vehiculos.partes.Bateria;
import co.apprector.vehiculos.partes.CajaCambio;
import co.apprector.vehiculos.partes.Motor;
import co.apprector.vehiculos.partes.Rueda;
import co.apprector.vehiculos.partes.Tanque;

/**
 *
 * @author Lord_Nightmare
 */
public class Bus extends Vehiculo{

    @Override
    public void ensamblar() {
        this.setBateria(new Bateria());
        this.setCaja(new CajaCambio());
        this.setMotor(new Motor());
        this.setRuedas(new Rueda[4]);
        this.setTanque(new Tanque());
    }
    
    public void acelerar(){
        
    }
    
    public void frenar(){
        
    }
    
}
