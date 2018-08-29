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
public abstract class Vehiculo {
    
    private Motor motor;
    private Rueda[] ruedas;
    private CajaCambio caja;
    private Bateria bateria;
    private Tanque tanque;
    
    public abstract void ensamblar();

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        return info.toString();
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * @return the ruedas
     */
    public Rueda[] getRuedas() {
        return ruedas;
    }

    /**
     * @param ruedas the ruedas to set
     */
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    /**
     * @return the caja
     */
    public CajaCambio getCaja() {
        return caja;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja(CajaCambio caja) {
        this.caja = caja;
    }

    /**
     * @return the bateria
     */
    public Bateria getBateria() {
        return bateria;
    }

    /**
     * @param bateria the bateria to set
     */
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    /**
     * @return the tanque
     */
    public Tanque getTanque() {
        return tanque;
    }

    /**
     * @param tanque the tanque to set
     */
    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }
    
    
    
}
