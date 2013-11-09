
package clase2.mediateca;


public class Video extends Articulo {
    char director;
    char actores;
    int duracion;

    public Video(char director, char actores, int duracion, int periodo, String titulo, double precio) {
        super(periodo, titulo, precio);
        this.director = director;
        this.actores = actores;
        this.duracion = duracion;
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
