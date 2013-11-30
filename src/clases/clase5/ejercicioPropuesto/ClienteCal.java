
package clases.clase5.ejercicioPropuesto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteCal {

    private String host;
    private int port;

    public ClienteCal(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void solicitar() {
        try {
            Socket cliente = new Socket(host, port);
// Crear los canales de lectura y escritura
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
// COMUNICACION 1
            String msg = in.readLine();
            System.out.println(msg);
            out.println("s");
            out.println(10);
            out.println(20);
// Cerrar canales
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}
