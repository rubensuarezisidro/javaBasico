/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.clase3.interfaces.universo;

import clases.clase3.interfaces.universo.abstractas.Alienigena;

/**
 *
 * @author alumno
 */
public class Melmakiano extends Alienigena{

    @Override
    public void comer() {
        System.out.println("Comiendo gato");
    }

    @Override
    public void comnicarse() {
        System.out.println("gritando");
    }

    @Override
    public void sentir() {
        System.out.println("amando");
    }
    
}
