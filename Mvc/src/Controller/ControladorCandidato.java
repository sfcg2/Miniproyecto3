package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import Model.Candidato;
import Model.Ciudadano;
import View.VistaGeneral;

public class ControladorCandidato implements ActionListener, ItemListener{

    Candidato candidato;
    Ciudadano ciudadano;
    VistaGeneral vista1;
    CiudadOrigen ciudadO;
    PartidoDer derecha;
    PartidoIzq izquierda;

    public ControladorCandidato(Candidato candidato, Ciudadano ciudadano, VistaGeneral vista1){

        this.candidato = candidato;
        this.ciudadano = ciudadano;
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

    public void IniciarVista(){
        vista1.iniciar1(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        candidato.setNombre(vista1.getNombre());
        candidato.setCedula(vista1.getCedula());
        candidato.setCiudad(vista1.getCiudad());
        candidato.setIdeologia(vista1.getIdeologia());
        candidato.setPartido_P(vista1.getPartido_P());
        candidato.setPromesas(vista1.getPromesas());
        //candidato.setsumarVotos();
        vista1.setsumarVotos();

    }

    

}   
