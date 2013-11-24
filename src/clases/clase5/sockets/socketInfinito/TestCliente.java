package clases.clase5.sockets.socketInfinito;


public class TestCliente {

    public static void main(String[] args) {
        //se coloca como parametros el ip del cliente y el puerto.
        Cliente cliente = new Cliente("192.168.14.66", 99);
        cliente.doConectar();
    }
}
