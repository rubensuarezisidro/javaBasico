package clases.clase3.fechas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Fecha {

    public static void main(String[] args) {
        //Fecha.gregorianCalendar();
        //Fecha.dateFormat();
        //Fecha.simpleDateFormat();
        Fecha.compararFechas();
    }

    public static void compararFechas() {
        Calendar c1 = new GregorianCalendar(2013, 9, 1);
        Date fecha1 = c1.getTime();
        Calendar c2 = new GregorianCalendar(2011, 9, 3);
        Date fecha2 = c2.getTime();

        if (fecha1.after(fecha2)) {
            System.out.println("fecha1 es después que fecha2");
        }

        if (fecha1.before(fecha2)) {
            System.out.println("fecha1 es antes que fecha2");
        }
    }

    public static void simpleDateFormat() {
        //http://docs.oracle.com/javase/1.4.2/docs/api/java/text/SimpleDateFormat.html
        DateFormat formato = new SimpleDateFormat("EEEE MMMM YYYY");
        Date hoy = new Date();
        System.out.println(formato.format(hoy));
    }

    public static void dateFormat() {
        Date now = new Date();
        System.out.println(now.getTime());
        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        SimpleDateFormat df5 = new SimpleDateFormat(
                "EEE, d MMM yyyy HH:mm:ssZ");
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat df7 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        // asignamos los valores a una variable
        String s = df.format(now);
        String s1 = df1.format(now);
        String s2 = df2.format(now);
        String s3 = df3.format(now);
        String s4 = df4.format(now);
        String s5 = df5.format(now);
        String s6 = df6.format(now);
        String s7 = df7.format(now);

        //mostramos los valores en consola de las variables 
        System.out.println("(Default) Hoy es " + s);
        System.out.println("(SHORT) Hoy es " + s1);
        System.out.println("(MEDIUM) Hoy es " + s2);
        System.out.println("(LONG) Hoy es " + s3);
        System.out.println("(FULL) Hoy es " + s4);
        System.out.println("(CUSTOM) Hoy es " + s5);
        System.out.println("(FULL - US) Hoy es " + s6);
        System.out.println("(SHORT - US) Hoy es " + s7);
    }

    public static void gregorianCalendar() {
        GregorianCalendar ahora = new GregorianCalendar(1975, 4, 31);
        //GregorianCalendar ahora = new GregorianCalendar(1975,4,31);
        //estamos asignando valors si está sin parametro es a fecha de hoy
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
