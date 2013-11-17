package clases.clase3.excepcion;

public class excepcion {

    public static void main(String args[]) {

        //Exception.testExcepcion();
        //TestExcepcion2();
        testExcetion3();
    }

    public static void testExcetion3() {

        try {
            //int[] numeros = null;
            int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16};
            for (int i = 0; i < 10; i++) {
                int j = numeros[i];
            }
        } catch (NullPointerException e) {

            System.out.println("ARRAY NULO ");
            e.printStackTrace();
        } finally {
            System.out.println("se coloca el bloque que seguira al activarse la exception");
        }
    }

    public static void TestExcepcion2() {

        int dividendo = 0, divisor = 0, resultado;
        try {
            // ERROR POR ARRAY
            int[] array = new int[2];
            array[10] = 100;
            // ERROR POR DIVISION ENTRE 0
            resultado = dividendo / divisor;

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
