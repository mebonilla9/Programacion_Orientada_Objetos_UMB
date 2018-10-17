/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.orejones.negocio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lord_Nightmare
 */
public class EventoClickBoton implements ActionListener {
    
    private final JPanel plContenedor;
    
    public EventoClickBoton(JPanel plContenedor) {
        this.plContenedor = plContenedor;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        JLabel etiqueta = new JLabel("Soy label dinamico!");
        etiqueta.setBounds(
                new Random().nextInt(300),
                new Random().nextInt(300),
                200,
                30);
        etiqueta.setVisible(true);
        plContenedor.add(etiqueta);
        plContenedor.repaint();
    }
    
}
