package clases.clase5.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EjercicioLecturaEscritura {

    private List<String> lineas;
    private String fileName;

    public static void main(String[] args) {
        // tipo    nom_variable = new clase(parametros para el constructor)
        EjercicioLecturaEscritura b = new EjercicioLecturaEscritura("C:\\javaTecsup\\ejemplo.txt");

        b.actualizarDatos();
    }

    // se crea el contructor para recbir el nombre del archivo
    public EjercicioLecturaEscritura(String file) {
        this.lineas = new ArrayList<String>();
        this.fileName = file;
    }

    //son metodos no estaticos, deben ser instanciados para poder usarlos
    public void actualizarDatos() {
        leerArchivo();
        escribirArchivo();
    }

    //son metodos no estaticos, deben ser instanciados para poder usarlos
    public void leerArchivo() {
        try {
            String linea;
            FileReader ubicacion = new FileReader(this.fileName);
            BufferedReader archivo = new BufferedReader(ubicacion);
            while ((linea = archivo.readLine()) != null) {
                this.lineas.add(linea);
            }
            archivo.close();
            ubicacion.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //son metodos no estaticos, deben ser instanciados para poder usarlos
    public void escribirArchivo() {
        try {
            FileWriter ubicacion = new FileWriter(this.fileName);
            BufferedWriter archivo = new BufferedWriter(ubicacion);
            //recorrido de la Lista para la lectura
            for (String linea : this.lineas) {
                archivo.write(linea);
                archivo.newLine();

            }
            archivo.write("Primera Linea");
            archivo.newLine();
            archivo.write(" Es otra linea");
            archivo.write(" Es otra linea");
            archivo.write(" Es otra linea");
            archivo.newLine();
            archivo.write("C:\\javaTecsup\\ejemplo");
            // cerramos archivo
            archivo.close();
            //cerramos ubicacion
            ubicacion.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
