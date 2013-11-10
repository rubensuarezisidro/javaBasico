package clases.clase3.interfaces.capital;

public class Oracion implements Capitalizable {

    String texto;

    //constructor 
    Oracion(String texto) {
        this.texto = texto;
    }

    public String agregaPalabra(String t) {
        texto = texto.concat(" " + t);
        return texto;
    }
//metodos de Interfase

    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    public String cambiaMinuscula() {
        return texto.toLowerCase();
        
    }
}
