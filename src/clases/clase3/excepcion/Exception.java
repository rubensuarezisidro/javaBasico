package clases.clase3.excepcion;

public class Exception {

    public static void main(String args[]) {

        //Exception.testExcepcion();
        TestExcepcion2();
    }

    public static void TestExcepcion2() {

        int x = (int) (Math.random() * 5);
        int y = (int) (Math.random() * 10);
        int[] z = new int[5];

        try {
            System.out.println("y/x gives " + (y / x));
            System.out.println("y is " + y + " z[y] is " + z[y]);


        } catch (ArithmeticException e) {
            System.out.println("Problema Aritmético " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error en Arrays  " + e);
        } finally {
            System.out.println("LINEA QUE AVISA QUE TERMINÓ EL PROGRAMA ");
        }

    }

    public static void testExcepcion() {
        int dividendo = 0, divisor = 0, resultado;

        try {
            resultado = dividendo / divisor;
        } catch (java.lang.Exception e) {
            System.out.println("Error en division " + e.getMessage());
        }


    }
}
