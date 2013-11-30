package clases.clase5.ejercicioPropuesto;

import java.io.BufferedReader;
import java.io.IOException;
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
            System.out.println("Servidor listo para calcular...");

            while (true) {
                Socket cliente = server.accept();
                PrintWriter envia = new PrintWriter(cliente.getOutputStream(), true);
                BufferedReader recibe = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                envia.println("CALCULADORA ");
                String ope = recibe.readLine();
                String num1 = recibe.readLine();
                String num2 = recibe.readLine();

                double resultado = 0;
                switch (ope) {
                    case "s":
                        resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
                        
                        break;
                    case "r":
                        resultado = Double.parseDouble(num1) - Double.parseDouble(num2);
                        break;
                    case "m":
                        resultado = Double.parseDouble(num1) * Double.parseDouble(num2);
                        break;
                    case "d":
                        resultado = Double.parseDouble(num1) / Double.parseDouble(num2);
                        break;
                }
                envia.println("EL RESULTADO DE " + num1 + " " + ope + " " + num2 + " es " + resultado);
                /*
                 * Cerramos el canal
                 */
                recibe.close();
                envia.close();
                cliente.close();
            }

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("error en operacion " + ae.getMessage());
        }

    }
}
