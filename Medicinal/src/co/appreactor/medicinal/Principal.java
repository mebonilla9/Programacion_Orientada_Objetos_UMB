/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.medicinal;

import co.appreactor.medicinal.modelo.entidades.Medico;
import co.appreactor.medicinal.modelo.entidades.Persona;
import co.appreactor.medicinal.modelo.entidades.PersonalMedico;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Hijo a un padre
        
        Persona pmm = new Medico();
        
        pmm.setNombre("Kevin");
        // padre a un hijo
        
        System.out.println("Nombre de la persona: "+pmm.getNombre());
        
        Medico med = (Medico) pmm;
        
        med.setEspecialidad("Dermatologia");
        
        System.out.println("El medico: "+med.getNombre()+" tiene como especialidad: "+med.getEspecialidad());
        
    }
    
}
