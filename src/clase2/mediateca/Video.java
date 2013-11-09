
package clase2.mediateca;


public class Video extends Articulo {
    char director;
    char actores;
    int duracion;

    public Video(int periodo, char titulo, double precio) {
        super(periodo, titulo, precio);
    }

  

    public char getDirector() {
        return director;
    }

    public void setDirector(char director) {
        this.director = director;
    }

    public char getActores() {
        return actores;
    }

    public void setActores(char actores) {
        this.actores = actores;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
}
