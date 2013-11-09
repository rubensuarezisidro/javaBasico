package clases.clase3.cadenas;

public class Cadena {

    public static void main(String[] args) {
        //Cadena.concatenar();
        //Cadena.extraccion();
        //Cadena.extraccion2();
        //Cadena.reemplazo();
        //Cadena.metodosString();
        //Cadena.espacios();
        //Cadena.buffer1();
        //Cadena.indexOf1();
        Cadena.buffer2();
    }

    public static void buffer1() {
        StringBuffer buffer = new StringBuffer("Tecsup");
        // esta agregando a memoria los texto con el metdo append
        buffer.append(" - ");
        buffer.append("Java ");

        // estamos insertando en memoria los caracteres con insert en la posicion.
        buffer.insert(6, "INSERTAMOS: INSTITUTO ");
        System.out.println(buffer);
    }

    public static void buffer2() {
        StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");
        System.out.println("Estamos ");
        sb.insert(11, " en");
        sb.delete(21, sb.length());
        System.out.println(sb);
    }

    public static void indexOf1() {
        StringBuffer buffer = new StringBuffer("Curso de Java");
        System.out.println(buffer);
        System.out.println("Estamos buscando la palabra Java");
        System.out.println(buffer.indexOf("Java", 0));
        System.out.println(buffer);
        System.out.println("Estamos elimando, desde 0 hasta posicion 3");

        System.out.println(buffer.delete(0, 3));
    }

    public static void reemplazo() {
        String texto = "java permite crear java applets, javabeans y java servlets";
        System.out.println(texto.replaceAll("java", "JAVA"));
        System.out.println(texto.replaceAll("java", "PHP"));
        System.out.println(texto.replaceAll("java", "C"));
    }

    public static void espacios() {
        String texto = "    java permite crear java applets, javabeans y java servlets    ";
        System.out.println(texto);
        System.out.println("quitamos espacios en los extremos:  " + texto.trim());

    }

    public static void metodosString() {
        String ruben = "RUBEN DARIO SUAREZ ISIDRO";

        System.out.println("Uppercase " + ruben.toUpperCase());
        //devuelve true O false
        System.out.println("buscar letra  " + ruben.contains("R"));

        System.out.println("tamaño de cadena " + ruben.length());
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
