/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aritmetica;

/**
 *
 * @author alumno
 */
public class AppAritmetica {
    public static void main(String[] args) {
        OperacionesAritmeticas operacion = new OperacionesAritmeticas();
        
        double suma = operacion.suma(10d, 20d);
        System.out.println("la suma es "+suma);
        
        int mayor = operacion.getmax(15, 20);
        System.out.println("Mayor "+mayor);
        
        float mayorF = operacion.getmax(20f, 30f);
        System.out.println("mafor Flotante "+mayorF);
    }
    
}
