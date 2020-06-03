package com.company;
import static java.util.Objects.requireNonNull;

public class PrendaBuilder {

    TipoDePrenda tipo;
    MaterialDePrenda material;
    TramaDeTela trama = TramaDeTela.LISA;
    ColorDePrenda colorPrimario;
    ColorDePrenda colorSecundario;
    CondicionClimatica condicionClimatica;

    public PrendaBuilder(){

    }

    public PrendaBuilder tipo(TipoDePrenda tipo) {
        this.tipo = requireNonNull(tipo, "tipo es obligatorio");
        return this;
    }
    public PrendaBuilder material(MaterialDePrenda material) {
        this.material = requireNonNull(material, "material es obligatorio");
        return this;
    }
    public PrendaBuilder colorPrimario(ColorDePrenda color) {
        this.colorPrimario = requireNonNull(color, "colorP es obligatorio");
        return this;
    }

    public PrendaBuilder colorSecundario(ColorDePrenda color) {
        this.colorSecundario = color;
        return this;
    }

    public PrendaBuilder condicionClimatica(CondicionClimatica cond) {
        this.condicionClimatica = cond;
        return this;
    }

    public PrendaBuilder trama(TramaDeTela trama) {
        this.trama = trama;
        return this;
    }

    public Prenda build() {
        Prenda nuevaPrenda =  new Prenda(this);
        validarPrenda(nuevaPrenda);
        return nuevaPrenda;
    }

    private void validarPrenda(Prenda prenda) throws PrendaInvalidaException {
        //Do some basic validations to check
        //if user object does not break any assumption of system

    }

}
