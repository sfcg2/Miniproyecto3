package Controler;

import javax.swing.JOptionPane;
import Model.Candidato;
import Model.Insertar;
import javax.swing.text.View;

public class BuscarController {
    
    private boolean val;

    public BuscarController() {
        val = false;
    }

    public void buscar() {
        ArrayList<Candidato> listaC = Insertar.getInscritos();   
        Candidato candidato = new Candidato();
        String cc = Interfazz.getBuscarCedula();
            
        candidato.setCedula(cc);

        for(int i = 0; i < listaC.size(); i++) { 
            if(candidato.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())) {
                setVal(true);
                JOptionPane.showMessageDialog(Interfazz.getwidth(), "  Candidato Encontrado", "INFO", JOptionPane.INFORMATION_MESSAGE);
                Interfazz.getArea().append(listaC.get(i).toString());
            }
        }

        if (!val) {
            JOptionPane.showMessageDialog(Interfazz.getwidth(), "  Candidato NO encontrado","ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } 
    }

    public void setVal(boolean valorin) {
        val = valorin;
    }  

    public boolean getVal() {
        return val;
    }  
}