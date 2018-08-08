/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.computadores;

/**
 *
 * @author Lord_Nightmare
 */
public interface IComputo {
    
    public void encender();
    public void accederBios();
    public void iniciarSesion(String usuario, String contrasena);
    public void arranqueSo();
}
