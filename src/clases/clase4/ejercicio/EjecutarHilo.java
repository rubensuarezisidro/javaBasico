
package clases.clase4.ejercicio;

public class EjecutarHilo {

    public static void main(String[] args) {
        EjecutarHilo.listarProcesos();
    }
        public static void listarProcesos() {
        ProcesoHilo lista =new ProcesoHilo();
        lista.run();
    }
}
