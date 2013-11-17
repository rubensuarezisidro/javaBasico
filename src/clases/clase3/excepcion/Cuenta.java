package clases.clase3.excepcion;

public class Cuenta {

    String nombre;
    double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public double retirarCajero(double montoRetiro) throws SaldoInsuficienteException {
        
        if (montoRetiro > saldo) {
            throw new SaldoInsuficienteException(saldo, montoRetiro);
        }
        this.saldo = this.saldo - montoRetiro;
        return saldo;
    }
}
