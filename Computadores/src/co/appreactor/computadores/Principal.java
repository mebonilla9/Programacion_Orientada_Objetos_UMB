/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.computadores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {
    
    private List<Computador> listaComputadores;

    public Principal() {
        this.listaComputadores = new ArrayList<>();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computador torre = new Computador();
        torre.setCapacidadDisco(1024);
        torre.setDiscoDuro("HDD");
        torre.setEnfriamiento("EWKB 'Enfriamiento liquido'");
        torre.setFrecuenciaProcesador(2.7);
        torre.setMainBoard("Asus ROG Maximus Hero XI");
        torre.setProcesador("Intel Core i7 8600");
        torre.setRam(16);
        
        Computador macBook = new Computador();
        torre.setCapacidadDisco(1024);
        torre.setDiscoDuro("SSD");
        torre.setEnfriamiento("ventilacion interna");
        torre.setFrecuenciaProcesador(2.8);
        torre.setMainBoard("Apple Macbook Pro A1278");
        torre.setProcesador("Intel Core i7 7600");
        torre.setRam(16);
        
        Computador servidor = new Computador();
        torre.setCapacidadDisco(512000);
        torre.setDiscoDuro("SSD");
        torre.setEnfriamiento("Enfriamiento por aire");
        torre.setFrecuenciaProcesador(2.7);
        torre.setMainBoard("Asus ROG Maximus Hero XI");
        torre.setProcesador("Intel Core i7 8600");
        torre.setRam(512);
        
        macBook.iniciarSesion("root", "33fo43A88!");
        torre.arranqueSo();
        servidor.encender();
    }
    
}
