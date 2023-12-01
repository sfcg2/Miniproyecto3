package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import Controler.ControlCandi;
import Model.CandidatoList;
import Model.Eliminar;

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
        private Eliminar modelo;

        public void Eliminar (Eliminar modelo) {
            this.modelo = modelo;
        }
    
        public void eliminar() {
            String buscarCedula = JOptionPane.showInputDialog(null, "Ingrese la cédula del candidato a eliminar:");
    
            if (buscarCedula != null) {
                modelo.eliminarCandidato(buscarCedula);
            } else {
                //  caso en el que se presiona cancelar en el cuadro
            }
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            // Implementar si es necesario
        }
    }
    }

    @Override
    public void mostrarVentanaInscripcion() {
        // el codigo pa inscribir
    }
}
