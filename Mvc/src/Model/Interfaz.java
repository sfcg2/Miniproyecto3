package Model;


import java.util.ArrayList;

public class Interfaz {

    public ArrayList<Candidato> obtenerInscritos() {
        return Insertar.getInscritos();
    }

    public ArrayList<Candidato> obtenerListaElim() {
        return Eliminar.getListaC2();
    }
}

