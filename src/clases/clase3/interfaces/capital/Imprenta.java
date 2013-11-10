package clases.clase3.interfaces.capital;

public class Imprenta {

    public static void main(String[] args) {
        Capitalizable[] array = new Capitalizable[3];
        array[0] = new Palabra("HOLA");
        array[1] = new Palabra("El murcielago rojo");
        array[2] = new Oracion("Java web");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Texto " + i + ": " + array[i].cambiaMayuscula());
        }
    }
}
