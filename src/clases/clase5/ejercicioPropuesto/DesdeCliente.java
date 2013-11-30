package clases.clase5.ejercicioPropuesto;

public class DesdeCliente {

    public static void main(String[] args) {
        //se coloca como parametros el ip del cliente y el puerto.
        ClienteCal cliente = new ClienteCal("localhost", 7777);
        cliente.solicitar();
    }
}
