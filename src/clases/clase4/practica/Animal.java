package clases.clase4.practica;

import clases.clase4.practica.interfases.Dieta;
import clases.clase4.practica.abstractas.Especie;

public class Animal extends Especie{
    private int codigoAnimal;
    private Dieta dietaAimmal;
    private String nombreAnimal;
    private Alimento tipoAlimento;
    
    public void comer() {
        System.out.println("Comiendo");
    }
}
