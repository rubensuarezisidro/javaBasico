package clases.clase4.hilos;

public class Simple2DelayThread extends Thread {

    private long delay;
    private String nombre;

    public Simple2DelayThread( String nombre,long delay) {
        this.delay = delay;
        this.nombre = nombre;
    }

    @Override
    public void run() {
// 
        for (int i = 0; i <= 5; i++) {
            System.out.println("nombre: "+ nombre + " delay= "+ delay);
            try {
                // método para retrasar el proceso 
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                System.out.println("ERROR   " + ex.getMessage());
            }
        }

    }
}
