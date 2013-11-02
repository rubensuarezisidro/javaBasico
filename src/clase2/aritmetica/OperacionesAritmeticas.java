package clase2.aritmetica;

public class OperacionesAritmeticas {

    public double suma(double a, double b) {
        double resultado = a + b;
        return resultado;
    }

    public int getmax(int a, int b) {
        int mayor = a;
        if (a > b) {
            mayor = a;
        } else if (a == b) {
            mayor = 0; //por ser iguales
        } else {
            mayor = b;
        }
        return mayor;
    }

    public float getmax(float a, float b) {
        float mayor = a;
        if (a > b) {
            mayor = a;
        } else if (a == b) {
            mayor = 0; //por ser iguales
        } else {
            mayor = b;
        }
        return mayor;
    }
    
    public int getmax(String mensaje) {
        return 0;
    }
}
