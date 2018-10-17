/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.apprector.vehiculos.partes;

import co.apprector.vehiculos.partes.subpartes.Celda;

/**
 *
 * @author Lord_Nightmare
 */
public class Bateria {
    
    private Celda[] celdas;
    private double amperaje;
    private double voltaje;
    private String tipoCaja;
    private double capacidad;
    private double cargaMaxima;
    
    public void cargar(){
        //TODO -> por implementar
    }
    
    public void transmitirEnergia(){
        //TODO -> por implementar
    }

    /**
     * @return the celdas
     */
    public Celda[] getCeldas() {
        return celdas;
    }

    /**
     * @param celdas the celdas to set
     */
    public void setCeldas(Celda[] celdas) {
        this.celdas = celdas;
    }

    /**
     * @return the amperaje
     */
    public double getAmperaje() {
        return amperaje;
    }

    /**
     * @param amperaje the amperaje to set
     */
    public void setAmperaje(double amperaje) {
        this.amperaje = amperaje;
    }

    /**
     * @return the voltaje
     */
    public double getVoltaje() {
        return voltaje;
    }

    /**
     * @param voltaje the voltaje to set
     */
    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    /**
     * @return the tipoCaja
     */
    public String getTipoCaja() {
        return tipoCaja;
    }

    /**
     * @param tipoCaja the tipoCaja to set
     */
    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    /**
     * @return the capacidad
     */
    public double getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the cargaMaxima
     */
    public double getCargaMaxima() {
        return cargaMaxima;
    }

    /**
     * @param cargaMaxima the cargaMaxima to set
     */
    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    
    
    
}
