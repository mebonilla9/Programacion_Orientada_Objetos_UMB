/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.medicinal.modelo.entidades;

import co.appreactor.medicinal.ITrabajador;
import java.util.ArrayList;

/**
 *
 * @author Lord_Nightmare
 */
public class Medico extends PersonalMedico implements ITrabajador{
    
    private String especialidad;
    private String facultad;
    private ArrayList<String> estudiosSuperiores;
    
    private int aniosLaborados;

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * @param facultad the facultad to set
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * @return the estudiosSuperiores
     */
    public ArrayList<String> getEstudiosSuperiores() {
        return estudiosSuperiores;
    }

    /**
     * @param estudiosSuperiores the estudiosSuperiores to set
     */
    public void setEstudiosSuperiores(ArrayList<String> estudiosSuperiores) {
        this.estudiosSuperiores = estudiosSuperiores;
    }

    /**
     * @return the aniosLaborados
     */
    public int getAniosLaborados() {
        return aniosLaborados;
    }

    /**
     * @param aniosLaborados the aniosLaborados to set
     */
    public void setAniosLaborados(int aniosLaborados) {
        this.aniosLaborados = aniosLaborados;
    }

    @Override
    public void registrarEntrada() {
        System.out.println("Entrada Registrada");
    }
    
    
}
