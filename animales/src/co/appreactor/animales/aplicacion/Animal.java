/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.animales.aplicacion;

/**
 *
 * @author Lord_Nightmare
 */
public class Animal {

    protected String nombre;
    protected String habilidad;
    protected String sexo;

    public String dormir() {
        return "El animal " + this.getNombre() + "no desea dormir";
    }

    public String comer() {
        return "El animal esta comiendo, su habilidad es: " + this.getHabilidad();
    }

    public String mover() {
        return "El animal " + this.getNombre() + " de sexo " + this.getSexo() + " cuya habilidad es: " + this.getHabilidad() + " se ha movido 25cm a la Izquierda";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the habitat
     */
    public String getHabilidad() {
        return habilidad;
    }

    /**
     * @param habilidad the habilidad to set
     */
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void sayHello(){
        System.out.println("----");
    }

}
