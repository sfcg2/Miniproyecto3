package View;

import java.util.ArrayList;
import java.awt.Container;
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
import Model.Candidato;
import javafx.scene.text.Font;


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
        iniciar.addActionListener(this);
        contenedor.add(iniciar, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(500, 580); 
        setVisible(true); 
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    @Override
    public String getCedula() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCedula'");
    }

    @Override
    public String getCiudad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCiudad'");
    }

    @Override
    public String getPartido_P() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPartido_P'");
    }

    @Override
    public String getIdeologia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIdeologia'");
    }

    @Override
    public String getPromesas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPromesas'");
    }
}
