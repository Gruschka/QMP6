package com.company;

import java.util.ArrayList;
import java.util.List;

public class Atuendo {

    static List<Prenda> prendas = new ArrayList<>();



    public boolean esAtuendoCompleto(){
        //Si tiene una prenda de cada categoria
        for (CategoriaDePrenda cat : CategoriaDePrenda.values()) {
            if (prendas.stream().filter(prenda -> prenda.categoria() == cat).count() == 0)
                return false;
        }
        return true;
    }

    public boolean esAdecuadoParaClimaActual(){

        if (prendas.stream().filter(prenda -> prenda.esAdecuadaParaElClimaActual()).count() == 0) { return false; }

        return true;
    }


}
