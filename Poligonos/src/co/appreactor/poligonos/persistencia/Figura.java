/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.poligonos.persistencia;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Lord_Nightmare
 */
public abstract class Figura {

    protected Color color;
    private String descripcion;
    
    protected Punto2d[] vertices;
    protected double[] lados;


    public Figura(Color color, String descripcion) {
        this.color = color;
        this.descripcion = descripcion;
    }

    protected double distancia(Punto2d puntoUno, Punto2d puntoDos) {
        return Math.sqrt(
                Math.pow((puntoDos.getX() - puntoUno.getX()), 2)
                + Math.pow((puntoDos.getY() - puntoUno.getY()), 2)
        );
    }

    public abstract double perimetro();

    public abstract double area();
    
    public abstract void draw(Graphics g);
    
    public void calcularLados() {
        for (int i = 0; i < getVertices().length; i++) {
            if (i == getVertices().length - 1) {
                getLados()[i] = distancia(getVertices()[i], getVertices()[0]);
                return;
            }
            getLados()[i] = distancia(getVertices()[i], getVertices()[i+1]);
        }
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the vertices
     */
    public Punto2d[] getVertices() {
        return vertices;
    }

    /**
     * @param vertices the vertices to set
     */
    public void setVertices(Punto2d[] vertices) {
        this.vertices = vertices;
    }

    /**
     * @return the lados
     */
    public double[] getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(double[] lados) {
        this.lados = lados;
    }

}
