
package clases.clase3.interfaces.posicion;


public class Teodolito {
    
    public static void main(String[] args) {
        //instanciamos el objeto 

    }
    public void getDistancia(Posicion p1, Posicion p2){
        
    double resultado = p2.getLongitud() - p1.getLongitud();
    
        System.out.println(resultado);
    }
    
}
