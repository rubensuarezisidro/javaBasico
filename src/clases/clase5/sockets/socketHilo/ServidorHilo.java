package clases.clase5.sockets.socketHilo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServidorHilo extends Thread {
    // estamos cerando el atributo Cliente 

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    public void run() {
        try {
// Crear los canales de lectura y escritura
            PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));
// COMUNICACION 1
            salida.println("SERVIDOR: Bienvenido, ¿Cómo te llamas? ");
// COMUNICACION 2
            String resp2 = entrada.readLine();
            System.out.println(resp2);
//Cerramos el canal
            entrada.close();
            salida.close();
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cliente != null) {
                    cliente.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
