package com.company;


import java.util.ArrayList;
import java.util.List;

public class GestorDeUniformes {

    static List<Uniforme> sugerencias = new ArrayList<>();



    public void mostrarSugerencias(){

        //prints content of sugerencias ArrayList
        return;
    }

    public void crearNuevoUniforme(){
        GestorDePrendas gestor = new GestorDePrendas();

        gestor.mostrarPrendasDeCategoria(CategoriaDePrenda.SUPERIOR);
        //guardo user input -> superior

        gestor.mostrarPrendasDeCategoria(CategoriaDePrenda.INFERIOR);
        //guardo user input -> inferior

        gestor.mostrarPrendasDeCategoria(CategoriaDePrenda.CALZADO);
        //guardo user input -> calzado

        Uniforme nuevoUniforme = new Uniforme(superior, inferior, calzado);
        sugerencias.add(nuevoUniforme);
    }

    public void configurarUniformeDeColegio(Colegio unColegio){
        GestorDePrendas gestor = new GestorDePrendas();

        gestor.mostrarPrendasDeCategoria(CategoriaDePrenda.SUPERIOR);
        //guardo user input -> nuevaPrendaSuperior
        unColegio.uniforme.prendaSuperior = nuevaPrendaSuperior;

        gestor.mostrarPrendasDeCategoria(CategoriaDePrenda.INFERIOR);
        //guardo user input -> nuevaPrendaInferior
        unColegio.uniforme.prendaInferior = nuevaPrendaInferior;

        gestor.mostrarPrendasDeCategoria(CategoriaDePrenda.CALZADO);
        //guardo user input -> nuevoCalzado
        unColegio.uniforme.prendaInferior = nuevoCalzado;
    }

}
