package Model;

import java.util.ArrayList;

public class modelo {
    private CandidatoList candidatoList;

    public modelo() {
        this.candidatoList = new CandidatoList();
    }

    public ArrayList<Candidato> getListaCandidatos() {
        return candidatoList.getListaCandidatos();
    }

    public void setListaCandidatos(ArrayList<Candidato> lista) {
        CandidatoList.setListaCandidatos(lista);
    }
}
