package Controler;

import Model.Candidato;

public class Control {
    private Candidato modelo;

    public Control(Candidato modelo) {
        this.modelo = modelo;
    }

    public void agregarCandidato(Candidato candidato) {
        modelo.agregarCandidato(candidato);
    }

   
}

