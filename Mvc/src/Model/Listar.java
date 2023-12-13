package Model;

import java.util.ArrayList;

import View.VistaGui;

public class Listar {

    public void listaCandidatos(){     
        
        ArrayList<Candidato> listaC = Insertar.getInscritos();   

        for(int i=0; i<listaC.size();i++){
            VistaGui.getArea().append("\n\nCANDIDATO # " + (i + 1) + "\n"+ listaC.get(i).toString());
            VistaGui.getArea().append("\n-----------------------------------------------------");
        }
    }
    
}