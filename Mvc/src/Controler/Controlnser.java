package Controler;

import Model.Insertar;
import View.Interfazz;

public class Controlnser {

    private Insertar modelo;

    public Controlnser(Insertar modelo) {
        this.modelo = modelo;
    }

    public void insertar() {
        modelo.Insertar();
    }
}



