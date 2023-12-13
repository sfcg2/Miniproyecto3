package Model;

import java.util.Arrays;
import java.util.Comparator;

import View.VistaGui;

public class TopCiudades{

    public TopCiudades(){};

    public void ciudadestop3(){

        CiudadOri[] listaCiudad = CiudadOri.values();
        Comparator<CiudadOri> comparadorC = Comparator.comparing(CiudadOri::getCont);
        Arrays.sort(listaCiudad,comparadorC);
        
        VistaGui.getArea().append("\n-> TOP 3 DE CIUDADES CON MENOS CANDIDATOS\n");

        for(int i = 0; i<3; i++){
            VistaGui.getArea().append(" " + (i+1) + ". " + listaCiudad[i] + " con " + listaCiudad[i].getCont() + " Candidato/s." + "\n");
            
        }

    }

}
