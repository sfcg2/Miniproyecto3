package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import Controler.Control;
import Model.CandidatoList;

public class VistaGui extends JFrame implements VistaGeneral {
    //  la interfaz 

    @Override
    public void mostrarVentanaLista(ArrayList<CandidatoList> candidatos) {
        // el codigo de la ventana
    }

    @Override
    public void mostrarVentanaInformacion() {
        //el codigo pa mostrar la info
    }

    @Override
    public void mostrarVentanaActualizar() {
        //  el tin pa actualizar
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // el codigo del mensaje
    }

    @Override
    public void mostrarVentanaVotacion() {
        // el codigo de las votaciones
    }

    @Override
    public void mostrarVentanaBuscar() {
        //el codigo pa buscar
    }

    @Override
    public void mostrarVentanaEliminar() {
        // el codigo pa eliminar
    }

    @Override
    public void mostrarVentanaInscripcion() {
        // el codigo pa inscribir
    }
}
