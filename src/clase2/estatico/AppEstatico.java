package clase2.estatico;

public class AppEstatico {

    public static void main(String[] args) {
        AppEstatico.atributoEstatico();
        AppEstatico.metodoEstatico();
    }

    public static void atributoEstatico() {
        System.out.println(Estatico.contador);
        Estatico estaUno = new Estatico();
        Estatico estaDos = new Estatico();
        Estatico estaTres = new Estatico();
        System.out.println(Estatico.contador);
    }

    public static void metodoEstatico() {
        double euro = Estatico.dolaraEuro(15d);
        System.out.println("Conversion  " + euro);
    }
}
