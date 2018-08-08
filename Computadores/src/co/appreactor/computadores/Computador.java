/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.computadores;

/**
 *
 * @author Lord_Nightmare
 */
public class Computador implements IComputo{
    
    private String mainBoard;
    private int ram;
    private String procesador;
    private double frecuenciaProcesador;
    private String enfriamiento;
    private String discoDuro;
    private int capacidadDisco;
    
    @Override
    public void encender(){
        // TODO-> por implementar
    }
    
    @Override
    public void accederBios(){
        // TODO-> por implementar
    }
    
    @Override
    public void iniciarSesion(String usuario, String contrasena){
        // TODO-> por implementar
    }
    
    @Override
    public void arranqueSo(){
        // TODO-> por implementar
    }

    /**
     * @return the mainBoard
     */
    public String getMainBoard() {
        return mainBoard;
    }

    /**
     * @param mainBoard the mainBoard to set
     */
    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the frecuenciaProcesador
     */
    public double getFrecuenciaProcesador() {
        return frecuenciaProcesador;
    }

    /**
     * @param frecuenciaProcesador the frecuenciaProcesador to set
     */
    public void setFrecuenciaProcesador(double frecuenciaProcesador) {
        this.frecuenciaProcesador = frecuenciaProcesador;
    }

    /**
     * @return the enfriamiento
     */
    public String getEnfriamiento() {
        return enfriamiento;
    }

    /**
     * @param enfriamiento the enfriamiento to set
     */
    public void setEnfriamiento(String enfriamiento) {
        this.enfriamiento = enfriamiento;
    }

    /**
     * @return the discoDuro
     */
    public String getDiscoDuro() {
        return discoDuro;
    }

    /**
     * @param discoDuro the discoDuro to set
     */
    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    /**
     * @return the capacidadDisco
     */
    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    /**
     * @param capacidadDisco the capacidadDisco to set
     */
    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }
    
}
