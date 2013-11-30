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
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter envia = new PrintWriter(cliente.getOutputStream(), true);
// COMUNICACION 1
            String msg = entrada.readLine();
            System.out.println(msg);
            envia.println("d");
            envia.println(81);
            envia.println(9);
            msg = entrada.readLine();
            System.out.println(msg);
// Cerrar canales
            entrada.close();
            envia.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}
