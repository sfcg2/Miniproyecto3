package Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import View.VistaGui;

public class Buscar {
        
    public Buscar(){}

    public static boolean val;

    public void buscar(){
        
        ArrayList<Candidato> listaC = Insertar.getInscritos();   
        Candidato candidato = new Candidato(null, null, null);
        String cc = VistaGui.getBuscarCedula();
            
        candidato.setCedula(cc);

        for(int i = 0; i<listaC.size(); i++){ 
            
            if(candidato.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())){
                Buscar.setVal(true);
                JOptionPane.showMessageDialog(VistaGui.getwidth(), "  Candidato Encontrado", "INFO", JOptionPane.INFORMATION_MESSAGE);
                VistaGui.getArea().append(listaC.get(i).toString());
            }

        }if(Buscar.getVal() == false){
            JOptionPane.showMessageDialog(VistaGui.getwidth(), "  Candidato NO encontrado","ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } 
    
    }public static void setVal(boolean valorin){
        val = valorin;
    }  
    public static boolean getVal(){
        return val;
    }  
} 
