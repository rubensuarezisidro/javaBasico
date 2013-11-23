package clases.clase4.hilos;

public class Hilo {

    public static void main(String[] args) {
        // tipo   nom_variable = new clase();
        Hilo.testHiloInterface();
    }

    public static void testHiloHerencia() {
        HiloHerencia h1 = new HiloHerencia();
        h1.start();
    }

    public static void testHiloInterface() {
        // tipo de imple nom_variable = new clase impl
        HiloImplementacion imple1 = new HiloImplementacion();
        
        // tipo Hilo (Thread) = new Clase Thread (parametro tipo hilo)
        Thread th = new Thread(imple1);
        th.start();
    }
}
