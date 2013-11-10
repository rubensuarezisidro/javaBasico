package clases.clase3.interfaces.posicion;

public class Auto implements Posicion {

    private int nroPuertas;
    private String color;
    private double longitud;
    private double latitud;

    // se coloco un constructor para poder utilizar la interface
    public Auto(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    @Override
    public double getLongitud() {
        // debes retornar la variable
        return longitud;
    }

    @Override
    public double getLatitud() {
        // debes retornar la variable
        return latitud;
    }
}
