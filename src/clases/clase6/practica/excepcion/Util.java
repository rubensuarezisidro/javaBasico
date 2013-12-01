package clases.clase6.practica.excepcion;

public class Util {

    public static void main(String[] args) throws FueraDeRangoExcepcion {
        Util.estaEnRango(2, 5, 50);
        System.out.println("Está dentro del rango");
    }

    static void estaEnRango(int valor, int desde, int hasta) throws FueraDeRangoExcepcion {
        if ((valor < desde) | (valor > hasta)) {
            throw new FueraDeRangoExcepcion("Números fuera del intervalo");
        }

   }

}
