package clase2.mediateca;

public abstract class Articulo {

    int periodo;
    char titulo;
    double precio;

    public Articulo(int periodo, char titulo, double precio) {
        this.periodo = periodo;
        this.titulo = titulo;
        this.precio = precio;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public char getTitulo() {
        return titulo;
    }

    public void setTitulo(char titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
