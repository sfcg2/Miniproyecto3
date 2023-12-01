package Model;

public class Ciudadano {

    private String nombre;
    private String cedula;
    private String ciudad;

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
