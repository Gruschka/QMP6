package com.company;

public class RemoverPrenda implements OperacionGuardarropa {

    public Prenda prenda;
    public User solicitante;
    public Guardarropa guardarropa;

    RemoverPrenda(Prenda unaPrenda, User unUser, Guardarropa unGuardarropa){
        this.prenda = unaPrenda;
        this.solicitante = unUser;
        this.guardarropa = unGuardarropa;
    }

    @Override
    public void aplicarOperacion() {
        //busca en this.unGuardarropa.prendas la prenda a remover y la saca del List
    }

    @Override
    public void deshacerOperacion() {
        this.guardarropa.agregarPrenda(this.prenda);
    }
}
