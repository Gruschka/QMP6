package com.company;

public class AgregarPrenda implements OperacionGuardarropa{

    public Prenda prenda;
    public User solicitante;
    public Guardarropa guardarropa;

    AgregarPrenda(Prenda unaPrenda, User unUser, Guardarropa unGuardarropa){
        this.prenda = unaPrenda;
        this.solicitante = unUser;
        this.guardarropa = unGuardarropa;
    }
    @Override
    public void aplicarOperacion() {
        this.guardarropa.agregarPrenda(this.prenda);

    }

    @Override
    public void deshacerOperacion() {
        //busca en this.guardarropa.prendas la prenda a remover y la saca del List
    }
}
