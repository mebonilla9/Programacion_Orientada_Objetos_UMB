/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.bicicleta;

import co.appreactor.bicicleta.entidades.Bicicleta;
import co.appreactor.bicicleta.excepciones.BicicletaException;
import co.appreactor.superteclado.Teclado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    private Bicicleta miBici;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Principal().iniciar();
    }

    private void iniciar() {
        int opcion = -1;
        while (opcion != 0) {
            opcion = menu();
            try {
                switch (opcion) {
                    case 1:
                        if (miBici != null) {
                            System.out.println("La bicicleta ya fue creada");
                            break;
                        }
                        crearBicicleta();
                        break;
                    case 2:
                        miBici.acelerar();
                        System.out.println("Velocidad Actual de la bicicleta: " + miBici.getVelocidadActual() + "m/s");
                        break;
                    case 3:
                        miBici.frenar();
                        System.out.println("Velocidad Actual de la bicicleta: " + miBici.getVelocidadActual() + "m/s");
                        break;
                    case 4:
                        System.out.println("Indique el numero de Plato a cambiar");
                        miBici.cambiarPlato(Teclado.leerNumero());
                        System.out.println("El plato: " + miBici.getPlatoActual() + ", ha sido seleccionado");
                        break;
                    case 5:
                        System.out.println("Indique el numero de Piñon a cambiar");
                        miBici.cambiarPiñon(Teclado.leerNumero());
                        System.out.println("El plato: " + miBici.getPinonActual() + ", ha sido seleccionado");
                        break;
                    case 0:
                        System.out.println("Gracias por usar este Poderosisimo Software. Hasta Pronto");
                        break;
                    default:
                        System.out.println("Opcion no valida intente nuevamente");
                        break;
                }
            } catch (BicicletaException e) {
                System.out.println(e.getMensaje() + ", codigo error: " + e.getCodigo());
            }
        }
    }

    private int menu() {
        System.out.println("Digite una de las siguientes opciones");
        System.out.println("1. Crear mi bicicleta");
        System.out.println("2. Acelerar bicicleta");
        System.out.println("3. Frenar bicicleta");
        System.out.println("4. Cambiar plato");
        System.out.println("5. Cambiar piñon");
        System.out.println("0. Salir");
        return Teclado.leerNumero();
    }

    private void crearBicicleta() {
        System.out.println("Digite el valor de la velocidad inicial");
        int velocidadInicial = Teclado.leerNumero();
        System.out.println("Digite el valor del plato actual");
        int platoActual = Teclado.leerNumero();
        System.out.println("Digite el valor del piñon actual");
        int pinonActual = Teclado.leerNumero();
        miBici = new Bicicleta(velocidadInicial, platoActual, pinonActual);
        System.out.println("La bicicleta ha sido Creada");
    }

}
