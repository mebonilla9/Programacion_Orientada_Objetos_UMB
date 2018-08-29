/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.apprector.vehiculos.partes;

import co.apprector.vehiculos.partes.subpartes.Piston;
import co.apprector.vehiculos.partes.subpartes.ArbolLevas;

/**
 *
 * @author Lord_Nightmare
 */
public class Motor {
    
    private int cilindraje;
    private String tipo;
    private Piston[] pistones;
    private ArbolLevas arbol;
    private int capacidadCamara;
            
    public void generarCombustion(double gasolina){
        //TODO -> por implementar
    }
    
    public void cambiarAceite(double aceite){
        
    }

    /**
     * @return the cilindraje
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the cilindraje to set
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the pistones
     */
    public Piston[] getPistones() {
        return pistones;
    }

    /**
     * @param pistones the pistones to set
     */
    public void setPistones(Piston[] pistones) {
        this.pistones = pistones;
    }

    /**
     * @return the arbol
     */
    public ArbolLevas getArbol() {
        return arbol;
    }

    /**
     * @param arbol the arbol to set
     */
    public void setArbol(ArbolLevas arbol) {
        this.arbol = arbol;
    }

    /**
     * @return the capacidadCamara
     */
    public int getCapacidadCamara() {
        return capacidadCamara;
    }

    /**
     * @param capacidadCamara the capacidadCamara to set
     */
    public void setCapacidadCamara(int capacidadCamara) {
        this.capacidadCamara = capacidadCamara;
    }
    
}
