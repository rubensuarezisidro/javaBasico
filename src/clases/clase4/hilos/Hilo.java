package clases.clase4.hilos;

public class Hilo {

    public static void main(String[] args) {
        // tipo   nom_variable = new clase();
        HiloHerencia h1 = new HiloHerencia();
        h1.start();

        HiloImplementacion i1 = new HiloImplementacion();
        i1.run();
    }
}
