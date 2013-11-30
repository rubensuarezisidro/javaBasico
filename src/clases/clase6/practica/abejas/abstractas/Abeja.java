
package clases.clase6.practica.abejas.abstractas;

import java.util.List;

public class Abeja extends Insecto{
    private String tipo;
    private String sexo;
    private int ciclo;
    private List<TipoCelda> celda;

    @Override
    public void volar() {
        System.out.println("volando");
    }
    

    
}
