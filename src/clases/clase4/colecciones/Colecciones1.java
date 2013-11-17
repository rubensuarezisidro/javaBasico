package clases.clase4.colecciones;

import java.util.*;

public class Colecciones1 {

    public static void main(String[] args) {
        Colecciones1.ejemploLoMap();

        //Colecciones1.ejemploHashSet();
    }

    public static void ejemploLoMap() {
        Estudiante alberto = new Estudiante("Ñiquen", "Alberto");
        Estudiante benjamin = new Estudiante("Ayasta", "Benjamin");
        Estudiante carlos = new Estudiante("Lopez", "Carlos");
        Estudiante ruben = new Estudiante("Suarez", "Ruben");
        Estudiante jose = new Estudiante("Eusebio", "Jose");
        Estudiante luis = new Estudiante("Jimenez", "Luis");

        HashMap<String, Estudiante> listado = new HashMap<String, Estudiante>();

        listado.put("121", alberto);
        listado.put("122", benjamin);
        listado.put("123", carlos);
        listado.put("124", ruben);
        listado.put("125", jose);
        listado.put("126", luis);
        System.out.println(" ");
        //imprimir uno de los registros
        listado.get("122").prntEstudiante();
        System.out.println("");
        
        System.out.println("primera forma de imprimir el listado usando collections");
        Collection<Estudiante> listadoMap = listado.values();
        for (Estudiante estudiante : listadoMap) {
            estudiante.prntEstudiante();
        }
        System.out.println(" ");
        System.out.println("segunda forma de imprimir el listado usando values");
        for (Estudiante estudiante : listado.values()) {
            estudiante.prntEstudiante();
        }
        
    }

    public static void ejemploHashSet() {
        Estudiante alberto = new Estudiante("Ñiquen", "Alberto");
        Estudiante benjamin = new Estudiante("Ayasta", "Benjamin");
        Estudiante carlos = new Estudiante("Lopez", "Carlos");
        Estudiante ruben = new Estudiante("Suarez", "Ruben");
        Estudiante jose = new Estudiante("Eusebio", "Jose");
        Estudiante luis = new Estudiante("Jimenez", "Luis");
// ArrayList
        Set<Estudiante> listado = new HashSet<Estudiante>();
        listado.add(alberto);
        listado.add(benjamin);
        listado.add(carlos);
        listado.add(carlos);
        listado.add(carlos);
        listado.add(ruben);
        listado.add(ruben);
        listado.add(ruben);
        listado.add(ruben);
        listado.add(ruben);
        listado.add(luis);
        listado.add(jose);

        // estamos ordenando la lista, llamando a Colletions

        for (Estudiante estudiante : listado) {
            estudiante.prntEstudiante();
        }
        System.out.println(listado.size());
    }

    public static void ejemploEstudiante() {
        Estudiante alberto = new Estudiante("Ñiquen", "Alberto");
        Estudiante benjamin = new Estudiante("Ayasta", "Benjamin");
        Estudiante carlos = new Estudiante("Lopez", "Carlos");
        Estudiante ruben = new Estudiante("Suarez", "Ruben");
        Estudiante jose = new Estudiante("Eusebio", "Jose");
        Estudiante luis = new Estudiante("Jimenez", "Luis");
// ArrayList
        List<Estudiante> listado = new ArrayList<Estudiante>();
        listado.add(alberto);
        listado.add(benjamin);
        listado.add(carlos);
        listado.add(ruben);
        listado.add(luis);
        listado.add(jose);

        // estamos ordenando la lista, llamando a Colletions
        Collections.sort(listado);

        for (Estudiante estudiante : listado) {
            estudiante.prntEstudiante();

        }
        Estudiante nuevo = listado.get(2);
        nuevo.prntEstudiante();

    }

    public static void ejmeploLinkedList() {
        Estudiante alberto = new Estudiante("Ñiquen Fernandez", "Alberto");
        Estudiante benjamin = new Estudiante("Ayasta Rodriguez", "Benjamin");
        Estudiante carlos = new Estudiante("Lopez Mendoza", "Carlos");
        Estudiante ruben = new Estudiante("Suarez Isidro", "Ruben");
        Estudiante jose = new Estudiante("Eusebio Alderete", "Jose");
        Estudiante luis = new Estudiante("Jimenez Aburto", "Luis");

        // estamos 
        LinkedList<Estudiante> listado = new LinkedList<Estudiante>();
        listado.add(alberto);
        listado.add(benjamin);
        listado.add(carlos);
        listado.add(ruben);
        listado.add(luis);
        listado.add(jose);

        ListIterator<Estudiante> ite = listado.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) listado.poll();
            e.prntEstudiante();
        }
        System.out.println(listado.size());
    }
}
