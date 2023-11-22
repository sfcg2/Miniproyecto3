package Controller;
/* 
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;

import Model.Candidato;
import Model.Ciudadano;
import View.VistaGeneral;
import View.VistaGui;

public class ControladorInsertar implements ActionListener, ItemListener {

    Candidato candidato;
    Ciudadano ciudadano;
    VistaGeneral vista1;
    VistaGui vista2;
    JButton iniciar, ingresar, salir1, salir2, vtar ;
    JLabel etq, etq2;
    JMenuBar menuB;
    JMenu indica, opciones;
    JMenuItem insertar, actualizar, eliminar, buscar, listar, votar, info;
    JPanel panel;
    public static JFrame wnd, wnd2;
    public static JTextField nom, cc, cdad, idel, part, prom, posic;
    public static JTextArea area; 

    public ControladorInsertar(Candidato candidato, Ciudadano ciudadano, VistaGeneral vista1){

        this.candidato = candidato;
        this.ciudadano = ciudadano;
        this.vista1 = vista1;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == iniciar){

            //dispose();
            wnd = new JFrame("Elecciones");
            wnd.setLayout(new BorderLayout(15,15));

            menuB = new JMenuBar();
            menuB.setBounds(10, 5, 230, 12);
            wnd.add(menuB, BorderLayout.NORTH);

            indica = new JMenu("Indicaciones");
            indica.addItemListener(this);
            menuB.add(indica);

            
            opciones = new JMenu("Opciones");
            opciones.addItemListener(this);
            menuB.add(opciones);

            insertar = new JMenuItem("Insertar Candidato");
            insertar.addActionListener(this);
            opciones.add(insertar);
            
            actualizar = new JMenuItem("Actualizar Candidato");
            actualizar.addActionListener(this);
            opciones.add(actualizar);
            
            eliminar = new JMenuItem("Eliminar Candidato");
            eliminar.addActionListener(this);
            opciones.add(eliminar);

            buscar = new JMenuItem("Buscar Candidato");
            buscar.addActionListener(this);
            opciones.add(buscar);

            listar = new JMenuItem("Lista Candidatos");
            listar.addActionListener(this);
            opciones.add(listar);

            votar = new JMenuItem("Votar");
            votar.addActionListener(this);
            opciones.add(votar);

            info = new JMenuItem("Información");
            info.addActionListener(this);
            opciones.add(info);

            panel = new JPanel();
            etq.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Miniproyecto2-main\\Proyecto\\img\\colV.jpg"));
            etq.setPreferredSize(new Dimension(800,600));
            panel.add(etq);
            wnd.add(panel, BorderLayout.CENTER);
 
            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);

        }else if(e.getSource() == insertar){

            wnd = new JFrame("Datos Candidato");
            wnd.setLayout(new BorderLayout(15,15));

            etq = new JLabel("D A T O S");
            etq.setFont(new Font("Arial", Font.BOLD, 50)); 

            panel = new JPanel();
            panel.setLayout(new FlowLayout());
            panel.add(etq);
            wnd.add(panel, BorderLayout.NORTH);

            JPanel p = new JPanel();
            p.setLayout(new GridLayout(6,2,20,40));

            etq = new JLabel("Nombre: ");
            etq.setFont(new Font("Arial", Font.BOLD, 15)); 
            nom = new JTextField(15);
            p.add(etq);
            p.add(nom);

            etq = new JLabel("Cédula: ");
            etq.setFont(new Font("Arial", Font.BOLD, 15)); 
            cc = new JTextField(15);
            p.add(etq);
            p.add(cc);

            etq = new JLabel("Ciudad: ");
            etq.setFont(new Font("Arial", Font.BOLD, 15)); 
            cdad = new JTextField(15);
            p.add(etq);
            p.add(cdad);

            etq = new JLabel("Ideología: ");
            etq.setFont(new Font("Arial", Font.BOLD, 15)); 
            idel = new JTextField(15);
            p.add(etq);
            p.add(idel);

            etq = new JLabel("Partido: ");
            etq.setFont(new Font("Arial", Font.BOLD, 15)); 
            part = new JTextField(15);
            p.add(etq);
            p.add(part);

            etq = new JLabel("Promesas: ");
            etq.setFont(new Font("Arial", Font.BOLD, 15)); 
            prom = new JTextField(15);
            p.add(etq);
            p.add(prom);

            wnd.add(p, BorderLayout.CENTER);

            p = new JPanel();
            ingresar = new JButton("Inscribir");
            ingresar.setFont(new Font("Arial", Font.ITALIC, 20));
            ingresar.addActionListener(this);
            p.add(ingresar);
            salir1 = new JButton("Salir");
            salir1.setFont(new Font("Arial", Font.ITALIC, 20));
            salir1.addActionListener(this);
            p.add(salir1);
            wnd.add(p, BorderLayout.SOUTH);

            p = new JPanel();
            p.add(new JLabel("                "));
            wnd.add(p, BorderLayout.WEST);

            p = new JPanel();
            p.add(new JLabel("                "));
            wnd.add(p, BorderLayout.EAST);

            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);
                
        }else if(e.getSource() == ingresar){

            //in.insertar();
            
        }else if(e.getSource() == salir1){
            wnd.dispose();
        }

    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == 1){

            if(e.getItemSelectable() == indica){
                System.out.println("gkg");
                JOptionPane.showMessageDialog(wnd, "Ingresar:\n *Promesas juntas, separadas por comas (,)\n  *Cedula sin puntos", 
                "Indicaciones", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }
}*/

