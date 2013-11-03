package clase2.estatico;

public class Estatico {

    static int contador;
    // se coloca estatic para inicializar la variable y no ser instanciado 
    // posteriormente.

    public Estatico() {
        ++contador;
    }

    public static double dolaraEuro(double a) {
        double euro = a * 1.2512;
        return euro;
    }
}
