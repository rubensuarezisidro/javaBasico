package clases.clase3.excepcion;

public class Cajero {

    public static void main(String[] args) {
        try {
            Cuenta cuentaJose = new Cuenta("JOSE ", 5000);
            System.out.println(cuentaJose.retirarCajero(3000));
            System.out.println(cuentaJose.retirarCajero(3000));


        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
