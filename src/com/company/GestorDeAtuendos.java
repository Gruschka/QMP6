package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeAtuendos {

    static List<Atuendo> atuendos = new ArrayList<>();


    public void crearNuevoAtuendo(){

        boolean sigueAgregandoPrendas = true;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        while(sigueAgregandoPrendas) {
            System.out.println("Ingrese prenda para el atuendo");
            GestorDePrendas.mostrarPrendasDisponibles();
            /*
            Selecciona prenda de la lista de prendas disponibles y la agrega
            al list Atuendos
             */
            System.out.println("Desea seguir agregando? y/n");
            String input =  scanner.nextLine();
            if (input.equals('n')){
                sigueAgregandoPrendas = false;
            }
        }

    }

    public void sugerirAtuendos(){
        List<Atuendo> atuendosCompletos = (List<Atuendo>) atuendos.stream().filter(atuendo -> atuendo.esAtuendoCompleto());
        //Print sugerencias
        List<Atuendo> prendasCompletasAcordesAlClima = (List<Atuendo>) atuendosCompletos.stream().filter(atuendo -> atuendo.esAdecuadoParaClimaActual());
        //Print prendasCompletasAcordesAlClima
    }


}
