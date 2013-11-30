
package clases.clase6.practica.abejas;

import clases.clase6.practica.abejas.abstractas.Abeja;
import clases.clase6.practica.abejas.interfases.Reina;

public class AbejaReina extends Abeja implements Reina{

    @Override
    public void ponerHuevo() {
        System.out.println("PONIENDO HUEVOS");    
    }

    @Override
    public void reinar() {
        System.out.println("REINANDO");    
    }
    
}
