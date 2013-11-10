package clases.clase3.interfaces.capital;

public class Palabra  implements Capitalizable{

    String texto;

    Palabra(String txt) {
        this.texto = txt;
    }
//metodos de Interfase, ojo debe retornar la variable, no un metodo.
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
}
