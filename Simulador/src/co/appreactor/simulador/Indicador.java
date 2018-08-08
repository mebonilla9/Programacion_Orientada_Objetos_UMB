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
public class Indicador implements Inspector{
    
    private String tipo;
    private final double valorMinimoIndicador = 0;
    private final double valorMaximoIndicador = 300;
    private double valorIndicadorActual;

    public Indicador(String tipo) {
        this.tipo = tipo;
    }
    
    public void emitirAlerta(){
        // TODO -> por implementar
    }
    
    
    public void calibrar(){
        // TODO -> por implementar
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

    @Override
    public void autoInspeccionar() {
        
    }

    @Override
    public void autoReparar() {
        
    }
    
    
}
