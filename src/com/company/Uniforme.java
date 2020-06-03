package com.company;

public class Uniforme {

    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calzado;


    Uniforme(Prenda superior, Prenda inferior, Prenda calzado){
        this.prendaSuperior = superior;
        this.prendaInferior = inferior;
        this.calzado = calzado;

        try {
            validarPartes(superior, inferior, calzado);
        } catch(UniformeInvalidoException e){
            System.out.println("partes de uniforme invalidas");
            e.printStackTrace();
        }
    }

    public static void validarPartes(Prenda superior, Prenda inferior, Prenda calzado) throws UniformeInvalidoException {

        if(superior.tipo.categoria != CategoriaDePrenda.SUPERIOR) {
            throw new UniformeInvalidoException();
        }

        if(inferior.tipo.categoria != CategoriaDePrenda.INFERIOR) {
            throw new UniformeInvalidoException();
        }

        if(calzado.tipo.categoria != CategoriaDePrenda.CALZADO) {
            throw new UniformeInvalidoException();
        }

        return;
    }

}
