/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.orejones.negocio;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/**
 *
 * @author Lord_Nightmare
 */
public class EventoTecla implements KeyListener{
    
    private final JTextField txtCampo;

    public EventoTecla(JTextField txtCampo) {
        this.txtCampo = txtCampo;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Tecla: "+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        txtCampo.setText("");
        txtCampo.setText("Estas presionando la tecla: "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        txtCampo.setText("");
        txtCampo.setText("Has liberado la tecla: "+e.getKeyChar());
    }
    
}
