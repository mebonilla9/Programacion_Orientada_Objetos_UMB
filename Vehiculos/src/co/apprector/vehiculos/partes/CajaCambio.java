/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.apprector.vehiculos.partes;

import co.apprector.vehiculos.partes.subpartes.Eje;

/**
 *
 * @author Lord_Nightmare
 */
public class CajaCambio {
    
    private Eje eje;
    private String[] velocidades;
    private String velocidadActual;
    private String reversa;
    
    public void asignarVelocidad(String velocidad){
        setVelocidadActual(velocidad);
    }
    
    public void asignarReversa(String reversa){
        setVelocidadActual(reversa);
    }

    /**
     * @return the eje
     */
    public Eje getEje() {
        return eje;
    }

    /**
     * @param eje the eje to set
     */
    public void setEje(Eje eje) {
        this.eje = eje;
    }

    /**
     * @return the velocidades
     */
    public String[] getVelocidades() {
        return velocidades;
    }

    /**
     * @param velocidades the velocidades to set
     */
    public void setVelocidades(String[] velocidades) {
        this.velocidades = velocidades;
    }

    /**
     * @return the velocidadActual
     */
    public String getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * @param velocidadActual the velocidadActual to set
     */
    public void setVelocidadActual(String velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    /**
     * @return the reversa
     */
    public String getReversa() {
        return reversa;
    }

    /**
     * @param reversa the reversa to set
     */
    public void setReversa(String reversa) {
        this.reversa = reversa;
    }
    
}
