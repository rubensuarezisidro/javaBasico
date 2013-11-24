package clases.clase5.streams;

import java.io.*;

public class LecturaEscritura {

    public static void main(String[] args) {
        LecturaEscritura.escribirArchivo();
        LecturaEscritura.leerArchivo();
    }

    public static void escribirArchivo() {
        try {
            FileWriter ubicacion = new FileWriter("C:\\javaTecsup\\ejemplo.txt");
            BufferedWriter archivo = new BufferedWriter(ubicacion);;
            archivo.write("Primera Linea");
            archivo.newLine();
            archivo.write(" Es otra linea");
            archivo.write(" Es otra linea");
            archivo.write(" Es otra linea");
            archivo.newLine();
            archivo.write("C:\\javaTecsup\\ejemplo");
            archivo.newLine();
            archivo.write("FileWriter archivo = new FileWriter");
            archivo.newLine();
            archivo.write("escribo.newLine();");
            // cerramos puntero
            archivo.close();
            //cerramos archivo
            ubicacion.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void leerArchivo() {
        String sInput = null;
        try {
            FileReader ubicacion = new FileReader("C:\\javaTecsup\\ejemplo.txt");
            BufferedReader archivo = new BufferedReader(ubicacion);

            while ((sInput = archivo.readLine()) != null) {
                System.out.println(sInput);
            }
            archivo.close();
            ubicacion.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
