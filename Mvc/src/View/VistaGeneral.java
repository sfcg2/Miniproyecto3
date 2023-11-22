package View;

import Controller.ControladorCandidato;

public interface VistaGeneral {
    
    public String getNombre();
    public String getCedula();
    public String getCiudad();
    public String getPartido_P();
    public String getIdeologia();
    public String getPromesas();
    public int setsumarVotos();
    public void iniciar1(ControladorCandidato controladorCandidato);
    

}
