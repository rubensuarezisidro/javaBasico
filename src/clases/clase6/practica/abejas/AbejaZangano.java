
package clases.clase6.practica.abejas;

import clases.clase6.practica.abejas.abstractas.Abeja;
import clases.clase6.practica.abejas.interfases.Zangano;


public class AbejaZangano extends Abeja implements Zangano{
    private int periodo=23;
    @Override
    public void domir() {
        System.out.println("DURMIENDO");
    }

    @Override
    public void procrear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
