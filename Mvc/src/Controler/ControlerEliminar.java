package Controler;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.Candidato;
import Model.Insertar;
import vista.Interfazz;

public class ControlerEliminar {

    private ArrayList<Candidato> listaC2 = new Insertar().getInscritos();

    public void eliminar() {
        boolean val4 = false;
        Candidato candidato = new Candidato();
        String cc = Interfazz.getBuscarCedula();

        candidato.setCedula(cc);

        for (int i = 0; i < listaC2.size(); i++) {
            if (candidato.getCedula().equalsIgnoreCase(listaC2.get(i).getCedula())) {
                val4 = true;
                listaC2.remove(i);
                JOptionPane.showMessageDialog(Interfazz.getwidth(), "  Candidato Eliminado", "INFO",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (!val4) {
            JOptionPane.showMessageDialog(Interfazz.getwidth(), "  Candidato NO encontrado", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    public ArrayList<Candidato> getListaC2() {
        return listaC2;
    }
}

