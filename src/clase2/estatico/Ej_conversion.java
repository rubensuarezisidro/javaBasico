package clase2.estatico;

public class Ej_conversion {

    public static void main(String args[]) {
        double cantidad = 20.00;
        double conv = Ej_conversion.dolaraEuro(cantidad);
        System.out.println("Conversion de Moneda:");
        System.out.println(cantidad + " dolares es " + conv + " euros");
    }

    public static double dolaraEuro(double a) {
        double euro = a * 0.81559;
        return euro;
    }
}
