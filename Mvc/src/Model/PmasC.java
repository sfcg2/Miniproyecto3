package Model;

import java.util.ArrayList;

import View.VistaGui;

public class PmasC{

    public PmasC(){};

    public void pMasC(){

        ArrayList<Candidato> listaC = Eliminar.getListaC2(); 
        
        int contDr = 0;
        int contIz = 0;

        for (PartidoDer pd : PartidoDer.values()){

            contDr = contDr + pd.getSumaDr();    

        }if(contDr != listaC.size()){
            contDr = contDr - 1;}
        

        for (PartidoIzquie pz : PartidoIzquie.values()){

            contIz = contIz + pz.getSumaIz();

        }if(contIz != listaC.size()){
            contIz = contIz - 1;}


        if (contDr > contIz){

            VistaGui.getArea().append("\n\n-> PARTIDO CON MÁS CANDIDATOS -> Partido de Derecha\n");
            VistaGui.getArea().append("  Con Un Total De " + contDr + " Candidato/s.\n");
        }

        else if (contDr < contIz){

            VistaGui.getArea().append("\n\n-> PARTIDO CON MÁS CANDIDATOS -> El Partido de Izquierda\n");
            VistaGui.getArea().append("  Con Un Total De " + contIz + "Candidato/s.\n");

        }else if(contDr == contIz){

            VistaGui.getArea().append("\n\n-> PARTIDOS EMPATADOS\n");
            VistaGui.getArea().append("  Con Un Total De " + contIz + " Candidatos En Cada Partido.\n");   
        }
    }
}
