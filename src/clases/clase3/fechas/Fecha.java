package clases.clase3.fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    public static void main(String[] args) {
        Fecha.gregorianCalendar();
    }

    public static void gregorianCalendar() {
        GregorianCalendar ahora = new GregorianCalendar();
        // Crear una fecha
        //Calendar ahora = new GregorianCalendar(2007,2,2);
        //traemos la fecha de hoy 
        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: "
                + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: "
                + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));
    }
}
