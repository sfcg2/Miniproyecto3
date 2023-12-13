package View;

import javax.swing.*;
import java.awt.*;

public class VistaGeneral {
    private JTextArea areaTexto;

    public VistaGeneral() {
        this.areaTexto = areaTexto;
    }

    public void mostrarEnAreaTexto(String mensaje) {
        areaTexto.append(mensaje + "\n");
    }

    // Otros métodos de presentación en la interfaz gráfica si es necesario
}
