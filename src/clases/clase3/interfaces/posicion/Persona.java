package clases.clase3.interfaces.posicion;

public class Persona implements Posicion {

    private String nombre;
    private String sexo;
    private double longitud;
    private double latitud;

    public Persona(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public double getLongitud() {
        return getLongitud();
    }

    @Override
    public double getLatitud() {
        return getLatitud();
    }
}
