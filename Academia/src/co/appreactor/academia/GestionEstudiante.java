/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.academia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class GestionEstudiante {

    private BufferedReader lector;
    private List<Estudiante> listaEstudiantes;

    public GestionEstudiante() {
        lector = new BufferedReader(new InputStreamReader(System.in));
        listaEstudiantes = new ArrayList<>();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    private void agregarEstudiante() throws IOException{
        Estudiante est = new Estudiante();
        System.out.println("Ingrese la cedula del estudiante");
        est.setCedula(lector.readLine());
        System.out.println("Ingrese los nombres del estudiante");
        est.setNombres(lector.readLine());
        System.out.println("Ingrese los apellidos del estudiante");
        est.setApellidos(lector.readLine());
        System.out.println("Ingrese el genero del estudiante");
        est.setGenero(lector.readLine().charAt(0));
        System.out.println("Ingrese el programa del estudiante");
        est.setPrograma(lector.readLine());
        listaEstudiantes.add(est);
    }
    
}
