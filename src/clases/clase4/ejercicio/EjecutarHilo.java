package clases.clase4.ejercicio;

public class EjecutarHilo {

    public static void main(String[] args) {
        //EjecutarHilo.listarProcesos();
        EjecutarHilo.listarRam();
    }

    public static void listarProcesos() {
        ProcesoHilo lista = new ProcesoHilo();
        lista.run();
    }

    public static void listarRam() {
        RamDisponible lista = new RamDisponible();
        lista.run();
    }
}
