package clases.clase4.ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcesoHilo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            try {
                listaProcesos();
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
                System.out.println("ERROR   " + ex.getMessage());
            }
        }
    }

    public static void listaProcesos() {
        try {
            Process proceso = Runtime.getRuntime().exec("tasklist");
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                    proceso.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(
                    proceso.getErrorStream()));
            String s = null;
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            //System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
