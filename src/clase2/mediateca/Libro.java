
package clase2.mediateca;


public class Libro extends Articulo{
    String autor;
    int nroPaginas;
    int nroIsbn;

    public Libro(int periodo, String titulo, double precio) {
        super(periodo, titulo, precio);
    }

   

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public int getNroIsbn() {
        return nroIsbn;
    }

    public void setNroIsbn(int nroIsbn) {
        this.nroIsbn = nroIsbn;
    }
    
    
}
