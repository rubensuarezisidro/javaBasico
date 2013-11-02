/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.persona;

/**
 *
 * @author alumno
 */
public class AppPersona {

    public static void main(String[] args) {

        Persona alumno = new Persona("Ruben Dario", "Suarez Isidro", 38);
        System.out.println("Atributos del Objeto ");
        System.out.println("********************");
        System.out.println("El nombre   es " + alumno.getNombre());
        System.out.println("El apellido es " + alumno.getApellidos());
        System.out.println("La Edad     es " + alumno.getEdad());
        
    }
}
