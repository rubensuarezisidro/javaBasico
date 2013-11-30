package clases.clase5.ejercicioPropuesto;

public class DesdeServ {

    public static void main(String[] args) {
        //se coloca como parametros puerto, DEBE SER EL MISMO QUE USARÁ EL CIENTE.
        ServidorCal server = new ServidorCal(7777);
        server.calcular();

    }
}
