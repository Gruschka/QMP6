package com.company;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {

    public CriterioGuardarropa criterio;
    public List<Prenda> prendas = new ArrayList<>();
    public List<User> duenios = new ArrayList<>();
    public List<OperacionGuardarropa> propuestas = new ArrayList<>();
    public List<OperacionGuardarropa> modificaciones = new ArrayList<>();



    public void agregarPrenda(Prenda unaPrenda){
        prendas.add(unaPrenda);
    }

    public void compartirCon(User unUsuario){
        duenios.add(unUsuario);
    }

    public void agregarSugerencia(OperacionGuardarropa unaSugerencia){
        propuestas.add(unaSugerencia);
    }

    public void mostrarPrendas(){
        //prints prendas list
    }
    public void mostrarPropuestas(){
        //prints propuestas list
    }

    public void mostrarModificaciones(){
        //prints propuestas list
    }

    public void deshacerModificacion(OperacionGuardarropa modificacion){
        //prints propuestas list
    }


}
