package clases.clase5.ejercicioPropuesto;

public class DesdeServidor {

    public static void main(String[] args) {
        //se coloca como parametros el ip del cliente y el puerto.
        ClienteCal cliente = new ClienteCal("192.168.14.66", 9997);
        cliente.solicitar();
    }
}
