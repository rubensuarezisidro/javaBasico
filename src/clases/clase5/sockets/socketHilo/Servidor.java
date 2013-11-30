package clases.clase5.sockets.socketHilo;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private int puerto;

    public Servidor(int port) {
        this.puerto = port;
    }

    public void ejecutar() {
        try {
// Creamos un servidor de Socket
            ServerSocket server = new ServerSocket(this.puerto);
            System.out.println("Servidor iniciado...");
            while (true) {
                System.out.println("Esperando ...");
                Socket cliente = server.accept();
                // se está instanciando el servidor hilo
                ServidorHilo servHilo = new ServidorHilo(cliente);
                servHilo.start();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}