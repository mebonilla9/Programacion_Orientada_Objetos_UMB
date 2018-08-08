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
public class Control implements Inspector{

    private final String tipo;
    private final boolean ajuste;

    public Control(String tipo, boolean ajuste) {
        this.tipo = tipo;
        this.ajuste = ajuste;
    }

    @Override
    public void autoInspeccionar() {
        
    }

    @Override
    public void autoReparar() {
        
    }
    
}
