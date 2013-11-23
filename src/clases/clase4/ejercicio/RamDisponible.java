package clases.clase4.ejercicio;

public class RamDisponible extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                memoriaRam();
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println("ERROR   " + ex.getMessage());
            }
        }
    }

    public void memoriaRam() {
        long mem0 = Runtime.getRuntime().totalMemory();
        long mem1 = Runtime.getRuntime().freeMemory();
        long mem2 = Runtime.getRuntime().availableProcessors();
        long mem3 = Runtime.getRuntime().maxMemory();
        System.out.println("LISTADO DE LA MEMORIA RAM");
        System.out.println("========================");
        System.out.println("Memoria Total   =  " + mem0);
        System.out.println("Memoria Libre   =  " + mem1);
        System.out.println("Procesos        =  " + mem2);
        System.out.println("Memoria máxima  =  " + mem3);
        System.out.println("========================");
    }
}
