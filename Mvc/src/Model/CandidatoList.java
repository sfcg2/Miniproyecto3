package Model;

import java.util.ArrayList;

public class CandidatoList {
    public static ArrayList<Candidato> listaCandidatos = new ArrayList<>();

    public static ArrayList<Candidato> getListaCandidatos() {
        return listaCandidatos;
    }

    public static void setListaCandidatos(ArrayList<Candidato> lista) {
        listaCandidatos = lista;
    }

    // Otros métodos de acceso a datos si es necesario
}
