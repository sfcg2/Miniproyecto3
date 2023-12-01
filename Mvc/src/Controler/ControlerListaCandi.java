package Controler;

import java.util.ArrayList;

import Model.Candidato;
import Model.ListaCandi;
import View.Interfazz;

public class ControlerListaCandi {

    private ListaCandi modelo;

    public ControlerListaCandi(ListaCandi modelo) {
        this.modelo = modelo;
    }

    public void listarCandidatos() {
        ArrayList<Candidato> listaC = modelo.obtenerListaCandidatos();

        for (int i = 0; i < listaC.size(); i++) {
            Interfazz.getArea().append("\n\nCANDIDATO # " + (i + 1) + "\n" + listaC.get(i).toString());
            Interfazz.getArea().append("\n-----------------------------------------------------");
        }
    }
}

