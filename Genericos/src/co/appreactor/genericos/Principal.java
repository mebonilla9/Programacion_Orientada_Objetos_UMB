/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.genericos;

import co.appreactor.genericos.entidades.Cuboide;
import co.appreactor.genericos.entidades.CuboideNumerico;
import co.appreactor.genericos.entidades.Mapa;
import co.appreactor.superteclado.Teclado;
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
        new Principal().iniciar();
    }

    private void iniciar() {
        int opcion = -1;
        while (opcion != 0) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    generarCuboides();
                    break;
                case 2:
                    generarCuboidesNumericos();
                    break;
                case 3:
                    generarMapaVehiculos();
                    break;
                default:
                    System.out.println("Opcion Invalida intente nuevamente!");
            }
        }
    }

    private int menu() {
        System.out.println("Ingrese una de las siguientes opciones");
        System.out.println("1. Crear cuboide estandar");
        System.out.println("2. Crear cuboide numerico");
        System.out.println("3. Crear mapa vehiculos");
        System.out.println("0. Salir");
        return Teclado.leerNumero();
    }

    private void generarCuboides() {
        List<Cuboide<String>> listaCubos = new ArrayList<>();
        System.out.print("Digite la cantidad de cubos que desea crear: ");
        int cantidad = Teclado.leerNumero();
        for (int i = 0; i < cantidad; i++) {
            listaCubos.add(crearCuboide());
        }

        int i = 0;
        System.out.println("");
        for (Cuboide<String> cubo : listaCubos) {
            System.out.println("Informacion del cubo en la posicion: "+(++i));
            System.out.println("------------------");
            System.out.println(cubo);
            System.out.println("------------------");
        }
        System.out.println("");
    }

    private Cuboide<String> crearCuboide() {
        Cuboide<String> cubo = new Cuboide<>();
        System.out.println("Digite la cifra de cada uno de los siguientes datos en letras:");
        System.out.print("Altura: ");
        cubo.setAltura(Teclado.leerTexto());
        System.out.print("Anchura: ");
        cubo.setAnchura(Teclado.leerTexto());
        System.out.print("Longitud: ");
        cubo.setLongitud(Teclado.leerTexto());
        return cubo;
    }

    private void generarCuboidesNumericos() {
        List<CuboideNumerico<Double>> listaNumericos = new ArrayList<>();
        System.out.print("Digite la cantidad de cubos que desea crear: ");
        int cantidad = Teclado.leerNumero();
        for (int i = 0; i < cantidad; i++) {
            listaNumericos.add(crearCuboideNumerico());
        }

        int i = 0;
        System.out.println("");
        for (Cuboide<Double> cuboNum : listaNumericos) {
            System.out.println("Informacion del cubo en la posicion: "+(++i));
            System.out.println("------------------");
            System.out.println(cuboNum);
            System.out.println("------------------");
        }
        System.out.println("");
    }

    private CuboideNumerico<Double> crearCuboideNumerico() {
        CuboideNumerico<Double> cubo = new CuboideNumerico<>();
        System.out.println("Digite la cifra de cada uno de los siguientes datos en numeros:");
        System.out.print("Altura: ");
        cubo.setAltura(Teclado.leerNumeroDecimal());
        System.out.print("Anchura: ");
        cubo.setAnchura(Teclado.leerNumeroDecimal());
        System.out.print("Longitud: ");
        cubo.setLongitud(Teclado.leerNumeroDecimal());
        return cubo;
    }

    private void generarMapaVehiculos() {
        List<Mapa<Integer, String>> listaMapa = new ArrayList<>();
        System.out.print("Digite la cantidad de objetos que desea crear: ");
        int cantidad = Teclado.leerNumero();
        for (int i = 0; i < cantidad; i++) {
            listaMapa.add(crearMapa());
        }
        
        int i = 0;
        System.out.println("");
        for (Mapa<Integer, String> mapa : listaMapa) {
            System.out.println("Informacion del objeto en el mapa para la posicion: "+(++i));
            System.out.println("------------------");
            System.out.println(mapa);
            System.out.println("------------------");
        }
        System.out.println("");
    }

    private Mapa<Integer, String> crearMapa() {
        Mapa<Integer, String> objetoMapa = new Mapa<>();
        System.out.print("Digite el año del objeto en numeros!: ");
        objetoMapa.setAnio(Teclado.leerNumero());
        System.out.print("Digite el modelo o nombre del objeto en letras!: ");
        objetoMapa.setModelo(Teclado.leerTexto());
        return objetoMapa;
    }
}
