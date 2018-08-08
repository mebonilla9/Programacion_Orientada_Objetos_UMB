/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.simulador;

/**
 *
 * @author Lord_Nightmare
 */
public class Avion {

    private final Indicador indicadorGps;
    private final Indicador indicadorVelocimetro;
    private final Indicador indicadorAltimetro;

    private final Control controlTimon;
    private final Control controlAleron;
    private final Control controlPotencia;

    public Avion() {
        this.indicadorGps = new Indicador("Gps");
        this.indicadorVelocimetro = new Indicador("Velocimetro");
        this.indicadorAltimetro = new Indicador("Altimetro");
        this.controlTimon = new Control("Timón", true);
        this.controlAleron = new Control("Alerón", false);
        this.controlPotencia = new Control("Potencia", true);
    }

}
