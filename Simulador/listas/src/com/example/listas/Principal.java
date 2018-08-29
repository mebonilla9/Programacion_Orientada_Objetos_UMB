/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaracion    = Construccion / asignacion 
        List<String> info = new ArrayList();
        
        // O
        
        info.add("Hola1");
        info.add("Hola2");
        info.add("Hola3");
        info.add("Hola4");
        info.add("Hola5");
        
        /**
         * Array[] -> length
         * List<>  -> size()
         */
        /*for (int i = 0; i < info.size(); i++) {
            
            System.out.println(info.get(i));
            
        }
        
        info.remove(3);
        System.out.println("--------------------");
        
        for (int i = 0; i < info.size(); i++) {
            
            System.out.println(info.get(i));
            
        }*/
        
        // foreach info -> 10 .get(x)
        for (String palabra : info) {
            System.out.println(palabra);
        }
        
        
    }
    
}
