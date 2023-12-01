package Model;

import java.util.ArrayList;

public class ListaCandi {

    public ArrayList<Candidato> obtenerListaCandidatos() {
        return Insertar.getInscritos();
    }
}

