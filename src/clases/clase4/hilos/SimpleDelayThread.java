package clases.clase4.hilos;

public class SimpleDelayThread extends Thread {

    @Override
    public void run() {
// 
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException ex) {
                System.out.println("ERROR   " + ex.getMessage());
            }
        }

    }
}
