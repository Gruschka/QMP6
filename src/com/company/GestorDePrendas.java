package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDePrendas {

    static List<Prenda> prendas = new ArrayList<>();
    static PrendaBuilder borrador; //Se persiste


    public void crearNuevaPrenda(){

        if (borrador != null){
            crearPrendaDesdeBorrador();
            borrador = null;
            return;
        }

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        PrendaBuilder builder = new PrendaBuilder();

        ingresarTipo(builder);

        if(deseaGuardarEnBorrador()){
            actualizarBorrador(builder);
            return;
        }

        // Read user input
        ingresarMaterial(builder);

        if(deseaGuardarEnBorrador()){
            actualizarBorrador(builder);
            return;
        }

        ingresarColorPrimario(builder);

        System.out.println("Desea agregar color secundario? y/n");
        String input =  scanner.nextLine();
        if (input.equals('y') ){
            ingresarColorSecundario(builder);
        }

        if(deseaGuardarEnBorrador()){
            actualizarBorrador(builder);
            return;
        }

        System.out.println("Desea indicar la trama? y/n");
        input =  scanner.nextLine();

        if (input.equals('y') ){
            ingresarTrama(builder);
        }

        try {
            Prenda nuevaPrenda = new Prenda(builder);
            prendas.add(nuevaPrenda);
        } catch (PrendaInvalidaException e){
            System.out.println("prenda ingresada invalida");
            e.printStackTrace();
        }

        return;
    }
    public void crearPrendaDesdeBorrador(){

        if (borrador.material == null) {
            ingresarMaterial(borrador);
            if(deseaGuardarEnBorrador()){
                actualizarBorrador(borrador);
                return;
            }
        }

        if (borrador.colorPrimario == null) {
            ingresarColorPrimario(borrador);
            if(deseaGuardarEnBorrador()){
                actualizarBorrador(borrador);
                return;
            }
        }

        if (borrador.colorSecundario == null) {
            ingresarColorSecundario(borrador);
            if(deseaGuardarEnBorrador()){
                actualizarBorrador(borrador);
                return;
            }
        }

        if (borrador.trama == null) {
            ingresarTrama(borrador);
        }

        try {
            Prenda nuevaPrenda = new Prenda(borrador);
            prendas.add(nuevaPrenda);
        } catch (PrendaInvalidaException e){
            System.out.println("prenda ingresada invalida");
            e.printStackTrace();
        }

        return;

    }


    public static void mostrarPrendasDeCategoria(CategoriaDePrenda categoria){
        System.out.println("Prendas disponible con categoria:"+categoria);
        //hace un filter de la lista de prendas e imprime las prendas de la categoria deseada

    }

    public void mostrarPrendasDisponibles(){
        System.out.println("Prendas disponible con categoria");
        //Muestra el list Prendas

    }


    public void actualizarBorrador(PrendaBuilder builder){
        borrador = builder;
    }



    public Boolean deseaGuardarEnBorrador(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Desea continuar creando la prenda? y/n");
        String input =  scanner.nextLine();
        if (input.equals('n')){
            return  false;
        }
        return true;
    }

    public void ingresarTipo(PrendaBuilder builder) {
        System.out.println("Ingrese tipo de prenda");
        //capturo user input
        TipoDePrenda tipo = new TipoDePrenda();
        builder.tipo(tipo);
        return;
    }

    public void ingresarMaterial(PrendaBuilder builder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese material de prenda");
        String input =  scanner.nextLine();
        MaterialDePrenda material = MaterialDePrenda.valueOf(input);
        builder.material(material);
        return;
    }

    public void ingresarColorPrimario(PrendaBuilder builder) {
        System.out.println("Ingrese color primario de prenda");
        //capturo input
        ColorDePrenda color = new ColorDePrenda();
        builder.colorPrimario(color);
        return;
    }

    public void ingresarColorSecundario(PrendaBuilder builder) {
        System.out.println("Ingrese color secundario de prenda");
        //capturo input
        ColorDePrenda color = new ColorDePrenda();
        builder.colorSecundario(color);
        return;
    }

    public void ingresarTrama(PrendaBuilder builder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese trama de prenda");
        String input =  scanner.nextLine();
        TramaDeTela trama = TramaDeTela.valueOf(input);
        return;
    }


}
