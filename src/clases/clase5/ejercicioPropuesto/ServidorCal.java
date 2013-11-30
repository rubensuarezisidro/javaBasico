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
        ServerSocket server;
        try {
// Creamos un servidor de Socket
            server = new ServerSocket(port);
            System.out.println("Servidor iniciado...");
            
            while (true) {
                Socket cliente = server.accept();
                PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                out.println("CALCULADORA ");
                out.println("Ingrese 1er NUMERO: ");
                String num1 = in.readLine();
                out.println("Ingrese 2do NUMERO: ");
                String ope = in.readLine();
                out.println("Ingrese OPERACION: ");
                String num2 = in.readLine();
                
                /*
                 * Cerramos el canal
                 */
                in.close();
                out.close();
                cliente.close();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }

    }
}
