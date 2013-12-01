
package clases.clase6.practica.abejas;

import clases.clase6.practica.abejas.abstractas.Abeja;
import clases.clase6.practica.abejas.interfases.Obrera;


public class AbejaObrera extends Abeja implements Obrera{
    private String  sexo="m";
    private int periodo=21;
    
    @Override
    public void trabajar() {
        System.out.println("TRABAJANDO");
    }


    
}
