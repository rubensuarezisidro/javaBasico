package clases.clase5.ejercicioPropuesto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorCal {

    private int port;

    // constructor
    public ServidorCal(int port) {
        this.port = port;
    }

    public void calcular() {
        try {
// Creamos un servidor de Socket
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado...");
            Socket cliente = server.accept();

// Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

            // COMUNICACION 1
            out.println("CALCULADORA ");
            // COMUNICACION 2
            String num1 = in.readLine();
            System.out.println(num1);
            String ope = in.readLine();
            System.out.println(ope);
            String num2 = in.readLine();
            System.out.println(num2);
            /*
             * Cerramos el canal
             */
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }

    }
}
