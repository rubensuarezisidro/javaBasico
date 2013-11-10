package clases.clase3.interfaces.universo;

import clases.clase3.interfaces.universo.abstractas.Humano;

public class Terricola extends Humano{

    @Override
    public void comer() {
        System.out.println("Comiendo");
    }

    @Override
    public void comnicarse() {
        System.out.println("Comunicandose en Ingles");
    }

    @Override
    public void sentir() {
        System.out.println("Confundido");
    }
}
