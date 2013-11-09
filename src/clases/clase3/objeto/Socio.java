package clases.clase3.objeto;

public class Socio {

    private int codigo;
    private String nombre;
    private String direccion;

    public Socio(int c, String n, String d) {
        this.codigo = c;
        this.nombre = n;
        this.direccion = d;
    }

// de ha sobreescrito el metodo. 
    public String toString() {
        String cadena = "Codigo : " + this.codigo;
        cadena += "nombre: " + this.nombre;
        cadena += "direccion: " + this.direccion;
        return cadena;
    }

// de ha sobre escrito el metodo. 
    public boolean equals(Object o) {
        Socio s = (Socio) o;
        if (this.codigo == s.codigo
                && this.nombre.equals(s.nombre)
                && this.direccion.equals(s.direccion)) {
            return true;
        } else {
            return false;
        }
    }
    
}
