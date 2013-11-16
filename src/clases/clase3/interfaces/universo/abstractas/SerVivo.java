
package clases.clase3.interfaces.universo.abstractas;

public abstract class SerVivo {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void comer();

    public abstract void comnicarse();

    public abstract void sentir();
}
