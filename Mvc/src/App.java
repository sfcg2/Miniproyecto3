import Controller.ControladorCandidato;
import View.VistaGui;
import Model.Candidato;
//import Model.Ciudadano;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        VistaGui vista2 = new VistaGui();
        //Candidato candidato = new Candidato();
        //Ciudadano ciudadano = new Ciudadano();

        //ControladorInsertar insertar = new ControladorInsertar(Candidato.candidato, Ciudadano.ciudadano, vista2);
        ControladorCandidato candidatos = new ControladorCandidato(Candidato.candidato, vista2);
        candidatos.IniciarVista();
        //controlador.iniciarApp();
    }
}
