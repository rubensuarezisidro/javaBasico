
package clase2.animales;

public class Zoologico {
    public static void main(String[] args) {
        Tigre diego = new Tigre("Diego", 20);
        
        diego.hacerRuido();
        diego.hacerRuido(false);
        
       Perro randall = new Perro("Randall", 8);
       randall.hacerRuido();
    }
    
}
