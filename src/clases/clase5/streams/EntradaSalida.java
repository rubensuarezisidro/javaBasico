package clases.clase5.streams;

import java.io.File;

public class EntradaSalida {
    
    public static void main(String[] args) {
        EntradaSalida.crearDirectorio();
        
    }
    
    public static void verificaArchivo() {
        // Tipo Archivo nom_variable = new Clase(colocar ruta absoluta)
        File f = new File("C:\\temario.txt");
        
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta : " + f.getPath());
        System.out.println("Ruta Absoluta: " + f.getAbsolutePath());
        
        if (f.exists()) {
            System.out.println("Archivo sí existe!");
            System.out.println((f.canRead()) ? "Sí se puede leer" : "");
            System.out.println((f.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + f.length() + " bytes");
        } else {
            System.out.println("El archivo no existe");
        }
        
    }
    
    public static void listarDirectorio() {
        File f = new File("C:\\");
        if (f.isDirectory() && f.exists()) {
            for (String listDir : f.list()) {;
                System.out.println(listDir);
            }
        }
    }
    
    public static void crearDirectorio() {
        File f = new File("C:\\javaTecsup");
        //negacions ara la consulta
        if (!f.isDirectory() && !f.exists()) {
            f.mkdir();
        }
    }
}
