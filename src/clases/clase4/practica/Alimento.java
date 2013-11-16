package clases.clase4.practica;

import java.util.List;

public class Alimento {

    private String nomAlimento;
    private List<String> tipoAlimento;
    private String unidadMedida;
    private int valorNutri;
    private int cantDieta;
    private int cantNutricional;
    private Nutriente tipoNutriente;

    public int getCantDieta() {
        return cantDieta;
    }

    public void setCantDieta(int cantDieta) {
        this.cantDieta = cantDieta;
    }

   
    public int getCantNutricional() {
        return cantNutricional;
    }

    public void setCantNutricional(int cantNutricional) {
        this.cantNutricional = cantNutricional;
    }

    public String getNomAlimento() {
        return nomAlimento;
    }

    public void setNomAlimento(String nomAlimento) {
        this.nomAlimento = nomAlimento;
    }

    public List<String> getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(List<String> tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public Nutriente getTipoNutriente() {
        return tipoNutriente;
    }

    public void setTipoNutriente(Nutriente tipoNutriente) {
        this.tipoNutriente = tipoNutriente;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getValorNutri() {
        return valorNutri;
    }

    public void setValorNutri(int valorNutri) {
        this.valorNutri = valorNutri;
    }

    
}
