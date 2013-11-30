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
            System.out.println("Servidor iniciado...");

            while (true) {
                Socket cliente = server.accept();
                PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                out.println("CALCULADORA ");
                String ope = in.readLine();
                String num1 = in.readLine();
                String num2 = in.readLine();

                double resultado=0;
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
                out.println("EL RESULTADO DE " + num1 + " " + ope + " " + num2 + " es " + resultado);
                /*
                 * Cerramos el canal
                 */
                in.close();
                out.close();
                cliente.close();
            }

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException ae) {
            System.out.println("error en operacion " + ae.getMessage());
        }

    }
}
