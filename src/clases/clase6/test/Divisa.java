package clases.clase6.test;

public class Divisa {

    private int importe;
    private String denominación;

    public Divisa(int imp, String den) {
        this.importe = imp;
        this.denominación = den;
    }

    public int getImporte() {
        return importe;
    }

    public String getDenominación() {
        return denominación;
    }

    public Divisa sumar(Divisa d) throws Exception {
        Divisa resultado;
        if (d.denominación.equals(denominación)) {
            resultado = new Divisa(d.importe + this.importe, denominación);
            return resultado;
        } else {
            throw new Exception("Denominación diferente: no se pueden sumar");
        }
    }
}
