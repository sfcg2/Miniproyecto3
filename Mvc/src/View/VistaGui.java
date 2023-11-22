package View; 
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controller.ControladorCandidato;
import Model.Candidato;


public class VistaGui extends JFrame implements VistaGeneral{

    Container contenedor;
    JMenuBar menuB;
    JMenu indica, opciones;
    JMenuItem insertar, actualizar, eliminar, buscar, listar, votar, info;
    JPanel panel;
    JScrollPane scroll;
    JLabel etq, etq2;
    JButton iniciar, ingresar, salir1, salir2, vtar ;
    ArrayList <Candidato> lsiat = Insertar.getInscritos();

    public static JFrame wnd, wnd2;
    public static JTextField nom, cc, cdad, idel, part, prom, posic;
    public static JTextArea area; 
    public static ArrayList <Candidato> lsiatElim = Eliminar.getListaC2();
    public static String buscarCedula;

    Candidato candidato = new Candidato();
    //Insertar in = new Insertar();
    //Actualizar ac = new Actualizar();
    //Eliminar el = new Eliminar();
    //Buscar bc = new Buscar();
    //Votar vt = new Votar();
    //ListaCandidatos lc = new ListaCandidatos();
    //PMasC pc = new PMasC();
    //Ciudadestop3 tp = new Ciudadestop3();

    public VistaGui (){

        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout(50,150));

        panel = new JPanel();
        panel.setLayout(new GridLayout(2,1,5,25));
        contenedor.add(panel, BorderLayout.NORTH);

        etq = new JLabel("      ELECCIONES");
        etq.setFont(new Font("Arial", Font.BOLD, 50)); 
        panel.add(etq);
        etq = new JLabel("      CANDIDATOS");
        etq.setFont(new Font("Arial", Font.BOLD, 50)); 
        panel.add(etq);

        panel = new JPanel();
        etq = new JLabel("                   ");
        etq.setFont(new Font("Serif", Font.ITALIC, 20));
        panel.add(etq);
        contenedor.add(panel, BorderLayout.WEST);

        panel = new JPanel();
        etq = new JLabel("                   ");
        etq.setFont(new Font("Serif", Font.ITALIC, 20));
        panel.add(etq);
        contenedor.add(panel, BorderLayout.EAST);

        panel = new JPanel();
        etq = new JLabel("                   ");
        etq.setFont(new Font("Serif", Font.ITALIC, 20));
        panel.add(etq);
        
        contenedor.add(panel, BorderLayout.SOUTH);

        iniciar = new JButton("Iniciar");
        contenedor.add(iniciar, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(500, 580); 
        
    }

    @Override
    public String getNombre() {
        return nom.getText();
    }

    @Override
    public String getCedula() {
        return cc.getText();
    }

    @Override
    public String getCiudad() {
        return cdad.getText();
    }

    @Override
    public String getPartido_P() {
        return part.getText();
    }

    @Override
    public String getIdeologia() {
        return idel.getText();
    }

    @Override
    public String getPromesas() {
        return prom.getText();
    }

    @Override
    public void iniciar1(ControladorCandidato candidatos) {
        iniciar.addActionListener(candidatos);
        setVisible(true); 
    }
}
