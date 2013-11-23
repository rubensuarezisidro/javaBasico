package clases.clase4.hilos;

import clases.clase4.ejercicio.ProcesoHilo;
import sun.awt.windows.ThemeReader;

public class Hilo {

    public static void main(String[] args) {
        //Hilo.testHiloInterface();
        //Hilo.testSimple2DelayHilo();
        Hilo.testPriodidad();
        
        
    }

    public static void testPriodidad() {
        Simple2DelayThread delayDario = new Simple2DelayThread("Dario ", 0);
        Simple2DelayThread delayRuben = new Simple2DelayThread("Ruben ", 0);
        
        delayDario.setPriority(Thread.MIN_PRIORITY);
        delayRuben.setPriority(Thread.MAX_PRIORITY);
        
        delayDario.start();
        delayRuben.start();
        
        
        
    }
    
    public static void testSimple2DelayHilo() {
        //Tipo SimpleDelayThread nom_variable = new Clase SimpleDelayThread();
        long delay1 = (long)(Math.random()*150);
        Simple2DelayThread delay2 = new Simple2DelayThread("Ruben",delay1);
        delay2.start();
        
    }

    public static void testSimpleDelayHilo() {
        //Tipo SimpleDelayThread nom_variable = new Clase SimpleDelayThread();
        SimpleDelayThread delay = new SimpleDelayThread();
        // variable.metodo start();
        delay.start();
    }

    public static void testHiloHerencia() {
        // TipoHiloxHerencia nom_variable = new ClaseHilo x Herencia
        HiloHerencia h1 = new HiloHerencia();
        //se invoca a metodo de la variable HiloHerencia==> "start"
        h1.start();
    }

    public static void testHiloInterface() {
        // tipo de imple nom_variable = new clase impl
        HiloImplementacion imple1 = new HiloImplementacion();

        // tipo Hilo (Thread) = new Clase Thread (parametro tipo hilo)
        Thread th = new Thread(imple1);
        th.start();
    }
}
