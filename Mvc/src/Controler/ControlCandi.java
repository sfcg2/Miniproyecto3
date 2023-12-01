package Controler;

import Model.Candidato;

public class ControlCandi {
    private Candidato modelo;

    public ControlCandi(Candidato modelo) {
        this.modelo = modelo;
    }

    public void agregarCandidato(Candidato candidato) {
        modelo.agregarCandidato(candidato);
    }

   
    
}

