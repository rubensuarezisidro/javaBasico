package clases.clase5.serializacion;

import java.io.Serializable;

// la clase debe ser Serializable, para poder rescatar el objeto 
//desde un archivo
public class Persona implements Serializable {

    private String nombre;
    private int edad;
    private String direccion;

    public Persona(String nombre, int edad, String dire) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion=dire;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.edad+" "+this.direccion;
    }
}
