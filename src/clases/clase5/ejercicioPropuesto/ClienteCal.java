
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
            PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
// COMUNICACION 1
            String msg = entrada.readLine();
            System.out.println(msg);
            salida.println("s");
            salida.println(10);
            salida.println(20);
// Cerrar canales
            entrada.close();
            salida.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}
