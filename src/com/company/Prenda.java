package com.company;

public class Prenda {

    private final TipoDePrenda tipo;
    private final MaterialDePrenda material;
    private final TramaDeTela trama;
    private final ColorDePrenda colorPrimario;
    private final ColorDePrenda colorSecundario;
    private final CondicionClimatica condicionClimatica;

    Prenda(PrendaBuilder builder) {
        this.tipo = builder.tipo;
        this.material = builder.material;
        this.trama = builder.trama;
        this.colorPrimario = builder.colorPrimario;
        this.colorSecundario = builder.colorSecundario;
        this.condicionClimatica = builder.condicionClimatica;
    }

    CategoriaDePrenda categoria() {
        return tipo.categoria();
    }

    public boolean esAdecuadaParaElClimaActual(){
        float temperaturaActual = Clima.getInstance().temperaturaActual;

        if(temperaturaActual > condicionClimatica.maxTemp || temperaturaActual < condicionClimatica.minTemp ){
            return false;
        }

        return true;
    }


}
