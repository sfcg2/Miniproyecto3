package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import Controler.Controller;

public interface VistaGeneral {

    public void setControlador(Controller c);

    public void iniciar();

    public void detener();

    public void mostrarMensaje(String mensaje);

    public void mostrarEnAreaTexto(String mensaje);

    // Otros métodos de presentación en la interfaz gráfica si es necesario
}
