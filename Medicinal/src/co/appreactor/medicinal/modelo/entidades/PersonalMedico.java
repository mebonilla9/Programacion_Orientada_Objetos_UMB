/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.medicinal.modelo.entidades;

import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class PersonalMedico extends Persona{
    
    protected String clinica;
    protected String dependencia;
    protected String sueldo;
    protected List<Paciente> pacientesAcargo;

    /**
     * @return the clinica
     */
    public String getClinica() {
        return clinica;
    }

    /**
     * @param clinica the clinica to set
     */
    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    /**
     * @return the dependencia
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * @param dependencia the dependencia to set
     */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    /**
     * @return the sueldo
     */
    public String getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the pacientesAcargo
     */
    public List<Paciente> getPacientesAcargo() {
        return pacientesAcargo;
    }

    /**
     * @param pacientesAcargo the pacientesAcargo to set
     */
    public void setPacientesAcargo(List<Paciente> pacientesAcargo) {
        this.pacientesAcargo = pacientesAcargo;
    }
    
    
    
}
