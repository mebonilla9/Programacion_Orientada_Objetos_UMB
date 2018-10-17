/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.genericos.entidades;

/**
 *
 * @author Lord_Nightmare
 */
public class Cuboide<T> {

    private T longitud;
    private T anchura;
    private T altura;

    /**
     * @return the longitud
     */
    public T getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(T longitud) {
        this.longitud = longitud;
    }

    /**
     * @return the anchura
     */
    public T getAnchura() {
        return anchura;
    }

    /**
     * @param anchura the anchura to set
     */
    public void setAnchura(T anchura) {
        this.anchura = anchura;
    }

    /**
     * @return the altura
     */
    public T getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(T altura) {
        this.altura = altura;
    }

    public Double doubleValue(T valor) {
        return Double.parseDouble(String.valueOf(valor));
    }

    public Double getVolumen() {
        try {
            return (Double) longitud * (Double) anchura * (Double) altura;
        } catch (ClassCastException e) {
            System.out.println("El valor generico de la clase cuboide no representa un dato numerico");
            return 0.0;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Longitud: ").append(longitud).append(" cm\n");
        sb.append("Anchura: ").append(anchura).append(" cm\n");
        sb.append("Altura: ").append(altura).append(" cm\n");
        sb.append("--------------\n");
        sb.append("Volumen: ").append(getVolumen()).append(" cm^3\n");
        return sb.toString();
    }

}
