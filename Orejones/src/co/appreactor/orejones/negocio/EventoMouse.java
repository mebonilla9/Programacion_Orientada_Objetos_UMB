/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.orejones.negocio;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lord_Nightmare
 */
public class EventoMouse implements MouseListener{
    
    private final JPanel plContenedor;
    private final Color colorDefecto;

    public EventoMouse(JPanel plContenedor) {
        this.plContenedor = plContenedor;
        colorDefecto = this.plContenedor.getBackground();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
        JLabel etiqueta = new JLabel("Click en el punto ("+e.getX()+","+e.getY()+")");
        etiqueta.setBounds(
                e.getX(),
                e.getY(),
                200,
                30);
        etiqueta.setVisible(true);
        plContenedor.add(etiqueta);
        plContenedor.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        plContenedor.setBackground(Color.orange);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        plContenedor.setBackground(colorDefecto);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        plContenedor.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        plContenedor.setBackground(colorDefecto);
    }
    
}
