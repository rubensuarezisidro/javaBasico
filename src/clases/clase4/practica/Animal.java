package clases.clase4.practica;

import clases.clase4.practica.abstractas.Especie;

public class Animal extends Especie{
    private int codigoAnimal;
    private Dieta dietaAimmal;
    private String nombreAnimal;
    private Alimento tipoAlimento;

    public int getCodigoAnimal() {
        return codigoAnimal;
    }

    public void setCodigoAnimal(int codigoAnimal) {
        this.codigoAnimal = codigoAnimal;
    }

    public Dieta getDietaAimmal() {
        return dietaAimmal;
    }

    public void setDietaAimmal(Dieta dietaAimmal) {
        this.dietaAimmal = dietaAimmal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public Alimento getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(Alimento tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
    
    
    public void comer() {
    
        System.out.println("Comiendo");
    }
}
