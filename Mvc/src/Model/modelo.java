package Model;

import java.util.ArrayList;

public class modelo {
    private ArrayList<Candidato> listaCandidatos = new ArrayList<>();

    public void agregarCandidato(Candidato candidato) {
        listaCandidatos.add(candidato);
    }

    public ArrayList<Candidato> getListaCandidatos() {
        return listaCandidatos;
    }
}
