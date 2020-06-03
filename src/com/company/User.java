package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Guardarropa> guardarropas = new ArrayList<>();
    private GestorDePrendas gestorDePrendas = new GestorDePrendas();
    private GestorDeAtuendos gestorDeAtuendos = new GestorDeAtuendos();
    private List<User> usuarioConocidos = new ArrayList<>();


    private void crearNuevoGuardarropa(){
        Guardarropa nuevoGuardarropa = new Guardarropa();
        //Mientras quiera seguir seleccionando
        System.out.println("Prendas disponibles para seleccionar");
        gestorDePrendas.mostrarPrendasDisponibles();
        //selecciona prenda
//        Prenda unaNuevaPrenda = new Prenda();
//        nuevoGuardarropa.agregarPrenda(unaNuevaPrenda);
/*
            and so on...
            ... and so forth
 */

    }

    private void mostrarGuardarropas(){
        //prints guardarropas List
    }

    private void sugerirRemoverPrenda(){
        //seleccione guardarropa
        mostrarGuardarropas();
        // seleccione prenda que quiere remover
        //guardarropasSeleccionado.mostrarPrendas()
        //RemoverPrenda sugerencia = new RemoverPrenda(prendaABorrar, this, guardarropaSeleccionado)
        //guardarropasSeleccionado.agregarSugerencia(sugerencia)
    }

    private void sugerirAgregarPrenda(){
        //seleccione guardarropa
        mostrarGuardarropas();
        // seleccione prenda que quiere remover
        //guardarropasSeleccionado.mostrarPrendas()
        //AgregarPrenda sugerencia = new AgregarPrenda(prendaAAgregar, this, guardarropaSeleccionado)
        //guardarropasSeleccionado.agregarSugerencia(sugerencia)
    }

    private void modificarUnGuardarropas(){
        //seleccione guardarropa
        mostrarGuardarropas();
        //Seleccione modificacion
        //guardarropaSeleccionado.mostrarModificaciones()
        //modificacionSeleccionada.aplicarOperacion()
    }

    private void deshacerOperacionDeUnGuardarropa(){
        //seleccione guardarropa
        mostrarGuardarropas();
        //Seleccione modificacion
        //guardarropaSeleccionado.mostrarModificaciones()
        //modificacionSeleccionada.deshacerOperacion()
    }

}
