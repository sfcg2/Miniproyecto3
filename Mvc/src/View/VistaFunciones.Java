import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class VistaFunciones extends JFrame implements ActionListener, ItemListener {

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
    Insertar in = new Insertar();
    Actualizar ac = new Actualizar();
    Eliminar el = new Eliminar();
    Buscar bc = new Buscar();
    Votar vt = new Votar();
    ListaCandidatos lc = new ListaCandidatos();
    PMasC pc = new PMasC();
    Ciudadestop3 tp = new Ciudadestop3();