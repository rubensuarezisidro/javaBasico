package clases.clase3.excepcion;

public class Cajero {

    public static void main(String[] args) {
        try {
            Cuenta cuentaJose = new Cuenta("JOSE ", 5000d);
            System.out.println("Saldo Actual S/.  "+cuentaJose.retirarCajero(1000));
            System.out.println("Saldo Actual S/.  "+cuentaJose.retirarCajero(2000));
            System.out.println("Saldo Actual S/.  "+cuentaJose.retirarCajero(1000));
            System.out.println("Saldo Actual S/.  "+cuentaJose.retirarCajero(3000));


        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
