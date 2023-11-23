package View;

import Controller.ControladorCandidato;

public interface VistaGeneral {
    
    public String getNombre();
    public String getCedula();
    public String getCiudad();
    public String getPartido_P();
    public String getIdeologia();
    public String getPromesas();
    //public JMenuBar getmenuB();
    //public int setsumarVotos();
    //public void iniciar1();
    public void iniciar1(ControladorCandidato controladorCandidato);
    //public void iniciar2(ControladorCandidato controladorCandidato);
    

}
