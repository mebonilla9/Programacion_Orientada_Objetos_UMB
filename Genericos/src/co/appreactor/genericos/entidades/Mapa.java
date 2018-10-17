/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.genericos.entidades;

/**
 *
 * @author Lord_Nightmare
 * @param <K> llave que representa el año del vehiculo en el Mapa
 * @param <V> Valor del nombre del vehiculo iconico del año de la llave
 */
public class Mapa<K, V> {
    
    private K anio;
    private V modelo;

    public Mapa() {
    }

    /**
     * @return the anio
     */
    public K getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(K anio) {
        this.anio = anio;
    }

    /**
     * @return the modelo
     */
    public V getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(V modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Año: ").append(anio).append("\n");
        sb.append("Modelo: ").append(modelo).append("\n");
        return sb.toString();
    }
    
    
    
}
