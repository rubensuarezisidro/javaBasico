package clases.clase4.hilos;

public class HiloHerencia extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Ejecutando ==>  " + i);
        }
    }
}
