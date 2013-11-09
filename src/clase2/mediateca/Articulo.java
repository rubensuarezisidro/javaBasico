package clase2.mediateca;

public abstract class Articulo {

    int periodo;
    String titulo;
    double precio;

    public Articulo(int periodo, String titulo, double precio) {
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
