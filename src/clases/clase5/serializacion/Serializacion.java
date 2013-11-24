package clases.clase5.serializacion;

import java.io.*;

public class Serializacion {

    public static void main(String[] args) {
        Serializacion.serializarPersona();
        Serializacion.deSerializarPersona();
    }

    public static void serializarPersona() {
        ObjectOutputStream archivo = null;
        Persona persona = new Persona("Alex Rolando Mosquera Suarez", 18,"Avenida Jose Galvez N° 1338");
        try {
            FileOutputStream ubicacion = new FileOutputStream("C:\\javaTecsup\\ejemplo1.txt");
            archivo = new ObjectOutputStream(ubicacion);
            archivo.writeObject(persona);
            archivo.flush();
        } catch (IOException e) {
            System.out.println("Imposible crear el archivo o escribir en él");
        } finally {
            try {
                archivo.close();
            } catch (IOException e) {
                System.out.println("No pudo cerrarse el canal");
            }
        }


    }

    public static void deSerializarPersona() {
        File ubicacion = new File("C:\\javaTecsup\\ejemplo1.txt");
        try {
            FileInputStream archivo = new FileInputStream(ubicacion);
            ObjectInputStream ois = new ObjectInputStream(archivo);
            Persona p1 = (Persona) ois.readObject();
            ois.close();
            archivo.close();
            System.out.println("Persona recuperada: " + p1.toString());
        } catch (IOException e) {
            System.err.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.err.println(e.toString());
        }
    }
}
