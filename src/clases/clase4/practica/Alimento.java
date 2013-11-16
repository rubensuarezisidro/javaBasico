package clases.clase4.practica;

public class Alimento implements Dieta {

    private String nomAlimento;
    private String tipoAlimento;
    private String unidadMedida;
    private int valorNutri;
    private int cantNutricional;
    private Nutriente tipoNutriente;
    private int cantAgua;
    private int cantAlimento;

    @Override
    public void mezclar() {
        System.out.println("Mezclando");;
    }
}
