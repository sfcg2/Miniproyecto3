package Model;

public class Ciudadano {

    public static Ciudadano ciudadano = new Ciudadano();

    public Ciudadano(){};

    private String nombre, cedula, ciudad;

    public String getNombre (){
        return nombre;
    }
    
    public void setNombre(String nom) {
        this.nombre = nom; 
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cc) {
        this.cedula = cc;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String cdad) {
        this.ciudad = cdad;

    }
}
