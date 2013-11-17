package clases.clase3.excepcion;

public class SaldoInsuficienteException extends Exception {

    public double saldo;
    public double cuantoDesea;

    public double getCuantoDesea() {
        return cuantoDesea;
    }

    public void setCuantoDesea(double cuantoDesea) {
        this.cuantoDesea = cuantoDesea;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    public SaldoInsuficienteException(double saldo, double cuantoDesea) {
        super("En su cuenta tiene " + saldo + " soles. No puede retirar S/.  " + cuantoDesea + " soles.");
        this.saldo = saldo;
        this.cuantoDesea = cuantoDesea;
    }
}
