
package clases.clase6.practica.abejas.abstractas;

import clases.clase6.practica.abejas.TipoCelda;
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

    public List<TipoCelda> getCelda() {
        return celda;
    }

    public void setCelda(List<TipoCelda> celda) {
        this.celda = celda;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    
}
