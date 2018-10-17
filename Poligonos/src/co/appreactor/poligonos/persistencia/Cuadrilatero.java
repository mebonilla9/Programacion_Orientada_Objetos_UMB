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
public class Cuadrilatero extends Figura {

    public Cuadrilatero(Color color, String descripcion) {
        super(color, descripcion);
        vertices = new Punto2d[4];
        lados = new double[4];
    }

    @Override
    public double perimetro() {
        return this.lados[0] + this.lados[1] + this.lados[2] + this.lados[3];
    }

    @Override
    public double area() {
        double distanciaDiagonal = distancia(this.vertices[1], this.vertices[3]);
        double subPerimetroUno = (this.lados[0] + this.lados[1] + distanciaDiagonal) / 2;
        double heronUno = Math.sqrt(subPerimetroUno * (subPerimetroUno - this.lados[0]) * (subPerimetroUno - this.lados[1]) * (subPerimetroUno - distanciaDiagonal));
        double heronDos = Math.sqrt(subPerimetroUno * (subPerimetroUno - this.lados[2]) * (subPerimetroUno - this.lados[3]) * (subPerimetroUno - distanciaDiagonal));
        return heronUno + heronDos;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Polygon p = new Polygon(
                new int[]{
                    this.getVertices()[0].getX(),
                    this.getVertices()[1].getX(),
                    this.getVertices()[2].getX(),
                    this.getVertices()[3].getX()
                },
                new int[]{
                    this.getVertices()[0].getY(),
                    this.getVertices()[1].getY(),
                    this.getVertices()[2].getY(),
                    this.getVertices()[3].getY()
                },
                4
        );
        g2.setColor(this.color);
        g2.fill(p);
    }

}
