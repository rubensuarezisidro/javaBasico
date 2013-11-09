
package clase2.mediateca;


public class Libro extends Articulo{
    char autor;
    int nroPaginas;
    int nroIsbn;

    public Libro(int periodo, char titulo, double precio) {
        super(periodo, titulo, precio);
    }

  

    public char getAutor() {
        return autor;
    }

    public void setAutor(char autor) {
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
