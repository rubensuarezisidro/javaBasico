package clases.clase4.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecciones1 {

    public static void main(String[] args) {
        Colecciones1.ejemploEstudiante();
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

        // estamos ordenando la lista
        Collections.sort(listado);

        for (Estudiante estudiante : listado) {
            estudiante.prntEstudiante();

        }

    }
}
