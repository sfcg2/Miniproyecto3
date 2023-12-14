package Controler;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import Model.Actualizar;
import Model.Buscar;
import Model.Insertar;
import Model.Listar;    
import Model.Eliminar;
import Model.PmasC;
import Model.TopCiudades;
import Model.Votar;
import View.VistaGeneral;


public class Controller implements ActionListener {

    private VistaGeneral vistaGeneral;
    private Insertar insertar;
    private Listar listar;
    private Eliminar eliminar;
    private PmasC pmasC;
    private Actualizar actualizar;
    private Buscar  buscar;
    private Votar votar;
    
    private TopCiudades topCiudades;

    public Controller(VistaGeneral vistaGeneral, Insertar insertar, Listar listar, Eliminar eliminar, PmasC pmasC, TopCiudades topCiudades, Actualizar actualizar, Buscar buscar, Votar votar) {
        this.vistaGeneral = vistaGeneral;
        this.insertar = insertar;
        this.listar = listar;
        this.eliminar = eliminar;
        this.pmasC = pmasC;
        this.topCiudades = topCiudades;
        this.actualizar = actualizar;
        this.buscar = buscar;
        this.votar = votar;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertar) {
            insertar.insertar();
        }
        if (e.getSource() == listar) {
            listar.listaCandidatos();
        }
        if (e.getSource() == eliminar) {
            eliminar.eliminar();
        }
        if (e.getSource() == pmasC) {
           PmasC.pMasC();
        }
        if (e.getSource() == topCiudades) {
            topCiudades.ciudadestop3();
        }
        if(e.getSource() == actualizar){
            actualizar.actualizar();
        }
        if(e.getSource() == buscar){
            buscar.buscar();
        }  
        if(e.getSource() == votar){
            votar.votar();
        } 
    }
    public void iniciarApp(){
        vistaGeneral.iniciar();
    }
}
