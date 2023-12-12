package Model;

import java.util.List;

public class Candidato extends Ciudadano {
    private String partidoPolitico;
    private String orientacionPolitica;
    private List<String> promesas;


    public Candidato(String nombre, String cedula, String ciudadOrigen, String partidoPolitico, String orientacionPolitica, List<String> promesas) {
        super(nombre, cedula, ciudadOrigen);
        this.partidoPolitico = partidoPolitico;
        this.orientacionPolitica = orientacionPolitica;
        this.promesas = promesas;
    }


    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getOrientacionPolitica() {
        return orientacionPolitica;
    }

    public void setOrientacionPolitica(String orientacionPolitica) {
        this.orientacionPolitica = orientacionPolitica;
    }

    public List<String> getPromesas() {
        return promesas;
    }

    public void setPromesas(List<String> promesas) {
        this.promesas = promesas;
    }
}

