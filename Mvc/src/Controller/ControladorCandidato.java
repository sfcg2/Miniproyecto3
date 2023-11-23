package Controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Model.Candidato;
import Model.Ciudadano;
import View.VistaGeneral;
import View.VistaGui;

public class ControladorCandidato implements ActionListener, ItemListener{

    Candidato candidato;
    Ciudadano ciudadano;
    VistaGeneral vista1;
    VistaGui vista2;
    CiudadOrigen ciudadO;
    PartidoDer derecha;
    PartidoIzq izquierda;

    JMenuBar menuB;
    JMenu indica, opciones;
    JMenuItem insertar, actualizar, eliminar, buscar, listar, votar, info;
    JPanel panel;
    JScrollPane scroll;
    JLabel etq, etq2;
    JButton iniciar, ingresar, salir1, salir2, vtar ;
    JFrame wnd;

    public ControladorCandidato(Candidato candidato, VistaGeneral vista1){

        this.candidato = candidato;
        //this.ciudadano = ciudadano;
        this.vista1 = vista1;
    }

    public CiudadOrigen getCiudadOrigen(){
        return ciudadO;
    }

    public void setCiudadOrigen(CiudadOrigen ciudadO){
        this.ciudadO = ciudadO;
    }

    public PartidoDer getPartidoDer(){
        return derecha;
    }
    public void setPartidoDer(PartidoDer derecha){
        this.derecha = derecha;
    }

    public PartidoIzq getPartidoIzq(){
        return izquierda;
    }
    public void setPartidoIzq(PartidoIzq izquierda){
        this.izquierda = izquierda;
    }

    

    @Override
    public void itemStateChanged(ItemEvent e) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        
        /*candidato.setNombre(vista1.getNombre());
        candidato.setCedula(vista1.getCedula());
        candidato.setCiudad(vista1.getCiudad());
        candidato.setIdeologia(vista1.getIdeologia());
        candidato.setPartido_P(vista1.getPartido_P());
        candidato.setPromesas(vista1.getPromesas());
        candidato.setsumarVotos();*/
        

            //dispose();
        System.out.println("hola");
    }
    
    public void IniciarVista(){
        vista1.iniciar1(this);
    }
    

}   
