/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.bicicleta.entidades;

import co.appreactor.bicicleta.excepciones.BicicletaException;

/**
 *
 * @author Lord_Nightmare
 */
public class Bicicleta {

    // Lista de atributos
    private int velocidadActual;
    private int platoActual;
    private int pinonActual;

    // Lista de metodos
    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

    public void acelerar() {
        if (velocidadActual >= 40) {
            System.out.println("No es posible frenar, la bicicleta esta en reposo");
            return;
        }
        this.velocidadActual *= 2;
    }

    public void frenar() {
        if (velocidadActual <= 0) {
            System.out.println("No es posible frenar, la bicicleta esta en reposo");
            return;
        }
        this.velocidadActual /= 2;
    }

    public void cambiarPlato(int plato) throws BicicletaException {
        if (plato > 6) {
            throw new BicicletaException(-1, "La bicicleta cuenta con 6 platos no es posible cambiar a uno superior");
        }
        platoActual = plato;
    }

    public void cambiarPiñon(int piñon) throws BicicletaException {
        if (piñon > 4) {
            throw new BicicletaException(-1, "La bicicleta cuenta con 4 piñones no es posible cambiar a uno superior");
        }
        pinonActual = piñon;
    }

    // lista de encapsulamientos
    /**
     * @return the velocidadActual
     */
    public int getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * @param velocidadActual the velocidadActual to set
     */
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    /**
     * @return the platoActual
     */
    public int getPlatoActual() {
        return platoActual;
    }

    /**
     * @param platoActual the platoActual to set
     */
    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    /**
     * @return the pinonActual
     */
    public int getPinonActual() {
        return pinonActual;
    }

    /**
     * @param pinonActual the piñonActual to set
     */
    public void setPinonActual(int pinonActual) {
        this.pinonActual = pinonActual;
    }

}
