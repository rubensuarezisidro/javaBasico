package clases.clase4.practica;

public class Animal extends Especie{
    private int codigoAnimal;
    private Dieta dietaAimmal;
    private String nombreAnimal;
    
    public void comer() {
        System.out.println("Comiendo");
    }
}
