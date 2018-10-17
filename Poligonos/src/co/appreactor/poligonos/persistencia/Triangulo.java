/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.poligonos.persistencia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Lord_Nightmare
 */
public class Triangulo extends Figura {

    public Triangulo(Color color, String descripcion) {
        super(color, descripcion);
        vertices = new Punto2d[3];
        lados = new double[3];
    }

    @Override
    public double perimetro() {
        return lados[0]+lados[1]+lados[2];
    }

    @Override
    public double area() {
        double subPerimetro = (lados[0]+lados[1]+lados[2])/2;
        return Math.sqrt(subPerimetro*(subPerimetro-lados[0])*(subPerimetro-lados[1])*(subPerimetro-lados[2]));
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Polygon p = new Polygon(
                new int[]{
                    this.getVertices()[0].getX(),
                    this.getVertices()[1].getX(),
                    this.getVertices()[2].getX()
                },
                new int[]{
                    this.getVertices()[0].getY(),
                    this.getVertices()[1].getY(),
                    this.getVertices()[2].getY()
                },
                3
        );
        g2.setColor(this.color);
        g2.fill(p);
    }

}
