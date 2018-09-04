/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.animales;

import co.appreactor.animales.aplicacion.Perro;
import co.appreactor.animales.aplicacion.Gato;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro miPerro = new Perro();
        miPerro.setNombre("Sparky");
        miPerro.setHabilidad("Saltar");
        miPerro.setEdad(4);
        miPerro.setRaza("Golden Retriver");
        miPerro.setSexo("Macho");
        
        Gato miGato = new Gato();
        miGato.setNombre("Garfield");
        miGato.setHabilidad("Comer Lasagna");
        miGato.setEdad(5);
        miGato.setColor("Naranja");
        miGato.setPeso(65.6);
        miGato.setSexo("Macho");
        
        System.out.println(miPerro.dormir()+" su raza es: "+miPerro.getRaza());
        System.out.println(miGato.comer()+" su color es: "+miGato.getColor());
        
        miPerro.sayHello();
        miGato.sayHello();
    }
    
}
