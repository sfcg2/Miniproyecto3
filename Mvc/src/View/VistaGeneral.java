package View;

import java.lang.ModuleLayer.Controller;

import javax.swing.*;

public class VistaGeneral extends JFrame {
    private JButton iniciar;
    private Controller controlador;

    public VistaGeneral(Controller controlador) {
        this.controlador = controlador;

        iniciar = new JButton("Iniciar");

        JPanel panel = new JPanel();
        panel.add(iniciar);

        add(panel);
        setTitle("Interfaz Vista General");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); 
        setVisible(true);

        // ActionListener al botón iniciar 
        iniciar.addActionListener(e -> {
            // las cositas  del boton
            JOptionPane.showMessageDialog(this, "Botón Iniciar presionado");
        });
    }

    // el resto

}

