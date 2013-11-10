
package clases.clase3.interfaces.posicion;


public class Auto implements Posicion{
    private int nroPuertas;
    private String color;
    
    private double longitud;
    private double latitud;

    
    // se coloco un constructor para poder utilizar la interface
    public Auto() {
        this.longitud=20d;
        this.latitud=50d;
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
        return(getLongitud());
    }

    @Override
    public double getLatitud() {
        return(getLatitud());
    }
    
    
}
