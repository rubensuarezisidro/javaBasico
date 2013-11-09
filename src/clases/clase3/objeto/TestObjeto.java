package clases.clase3.objeto;

public class TestObjeto {

    public static void main(String[] arg) {
        Socio socio1 = new Socio(302, "David", "Tecsup");
        Socio socio2 = new Socio(302, "David", "Tecsup");
        if (socio1 == socio2) {
            System.out.println("Comprobando referencia");

        }
        if (socio1.equals(socio2)) {
            System.out.println("Comprobando el valor");
            System.out.println(socio1.toString());
            
        }

    }
}
