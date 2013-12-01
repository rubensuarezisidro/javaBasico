package clases.clase6.practica.excepcion;

public class FueraDeRangoExcepcion extends Exception {

    public FueraDeRangoExcepcion() {
    }

    public FueraDeRangoExcepcion(String msg) {
        super(msg);
    }
}
