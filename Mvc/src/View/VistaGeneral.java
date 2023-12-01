package View;

import java.util.ArrayList;
import Model.CandidatoList;

public interface VistaGeneral {
    void mostrarVentanaInscripcion();
    void mostrarVentanaActualizar();
    void mostrarVentanaEliminar();
    void mostrarVentanaBuscar();
    void mostrarVentanaLista(ArrayList<CandidatoList> listaCandidatos);
    void mostrarVentanaVotacion();
    void mostrarVentanaInformacion();
    void mostrarMensaje(String mensaje);
}