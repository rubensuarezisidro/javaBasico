package clases.clase3.cadenas;

public class Cadena {

    public static void main(String[] args) {
        //Cadena.concatenar();
        //Cadena.extraccion();
        //Cadena.extraccion2();
        Cadena.reemplazo();
        Cadena.metodosString();
    }

    public static void reemplazo() {
        String texto = "java permite crear java applets, javabeans y java servlets";
        System.out.println(texto.replaceAll("java", "JAVA"));
        System.out.println(texto.replaceAll("java", "PHP"));
        System.out.println(texto.replaceAll("java", "C"));
    }
    
    public static void metodosString(){
    String ruben = "RUBEN DARIO SUAREZ ISIDRO";
    
        System.out.println("Uppercase "+ruben.toUpperCase());
         //devuelve true O false
        System.out.println("buscar letra  "+ruben.contains("R"));
        
        System.out.println("tamaño de cadena "+ruben.length());
    }

    public static void extraccion() {
        String texto = "Tecsup";
        System.out.println("Número de Caracteres: " + texto.length() + "\n");
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.substring(i, i + 1) + "\n");
        }
    }

    public static void extraccion2() {
        String texto = "TECSUP";
        System.out.println(texto.substring(1, 3));
        System.out.println(texto.substring(3, 3));
    }

    public static void concatenar() {
        String nombre = "James";
        String apellido = "Gosling";
        if (nombre.equals("James")) {
            System.out.println(nombre + " " + apellido);
        }
        String completo = nombre.concat(" " + apellido);
        if (nombre.equals("James")) {
            System.out.println(completo);
        }
    }
}
