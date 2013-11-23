/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.clase4.hilos;

/**
 *
 * @author alumno
 */
public class HiloImplementacion implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("otro " + i);

        }
    }
}
