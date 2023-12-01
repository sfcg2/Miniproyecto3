package Model;


import java.util.ArrayList;

public class Eliminar {

    private static ArrayList<Candidato> listaC2 = Insertar.getInscritos();

    public void eliminarCandidato(String cedula) {
        boolean val4 = false;
        Candidato candidato = new Candidato();
        candidato.setCedula(cedula);

        for (int i = 0; i < listaC2.size(); i++) {
            if (candidato.getCedula().equalsIgnoreCase(listaC2.get(i).getCedula())) {
                val4 = true;
                listaC2.remove(i);
                //(actualizar la interfaz)
                break;
            }
        }

        if (!val4) {
            // codigo cuando no fue encontrado no fue encontrado (actualizar la interfaz)
        }
    }

    public static ArrayList<Candidato> getListaC2() {
        return listaC2;
    }
}
