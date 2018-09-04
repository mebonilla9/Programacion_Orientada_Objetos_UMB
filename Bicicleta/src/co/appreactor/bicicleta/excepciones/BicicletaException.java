/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.bicicleta.excepciones;

/**
 *
 * @author Lord_Nightmare
 */
public class BicicletaException extends Exception{
    
    protected final int codigo;
    protected final String mensaje;

    public BicicletaException(int codigo, String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }
    
    
    
}
