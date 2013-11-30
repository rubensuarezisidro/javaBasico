
package clases.clase5.ejercicioPropuesto;

import clases.clase5.sockets.socketBasico.Cliente;

public class AplicacionCalc {

    public static void main(String[] args) {
        //se coloca como parametros el ip del cliente y el puerto.
        Cliente cliente = new Cliente("192.168.14.66", 99);
        cliente.doConectar();
    }
}

