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
public class Rueda {
    
    private double diametroRin;
    private double anchoLlanta;
    private String relacionAspecto;
    private int tamaño;
    
    public void girar(){
        //TODO -> por implementar
    }

    /**
     * @return the diametroRin
     */
    public double getDiametroRin() {
        return diametroRin;
    }

    /**
     * @param diametroRin the diametroRin to set
     */
    public void setDiametroRin(double diametroRin) {
        this.diametroRin = diametroRin;
    }

    /**
     * @return the anchoLlanta
     */
    public double getAnchoLlanta() {
        return anchoLlanta;
    }

    /**
     * @param anchoLlanta the anchoLlanta to set
     */
    public void setAnchoLlanta(double anchoLlanta) {
        this.anchoLlanta = anchoLlanta;
    }

    /**
     * @return the relacionAspecto
     */
    public String getRelacionAspecto() {
        return relacionAspecto;
    }

    /**
     * @param relacionAspecto the relacionAspecto to set
     */
    public void setRelacionAspecto(String relacionAspecto) {
        this.relacionAspecto = relacionAspecto;
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
}
