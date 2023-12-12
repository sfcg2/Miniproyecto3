package Model;

public class Ciudadano {
    private String nombre;
    private String cedula;
    private String ciudadOrigen;

    
    public Ciudadano(String nombre, String cedula, String ciudadOrigen) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudadOrigen = ciudadOrigen;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
}

