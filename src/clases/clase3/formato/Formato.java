package clases.clase3.formato;

import java.text.NumberFormat;
import java.util.Locale;

public class Formato {

    public static void main(String[] args) {
        //Formato.numberFormat();
        Formato.monedaFormart();
    }

    public static void monedaFormart() {
        // Formato de moneda
        NumberFormat formatoAleman = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        formatoAleman.setGroupingUsed(false); // quitando el agrupamiento
        NumberFormat formatoAmericano = NumberFormat.getCurrencyInstance(Locale.US);
        formatoAmericano.setGroupingUsed(false); // quitando el agrupamiento
        //ceramos un nuevo locate para PERU PE
        Locale lp = new Locale("es", "PE");
        NumberFormat formatoPeru = NumberFormat.getCurrencyInstance(lp);
        formatoPeru.setGroupingUsed(false); // quitando el agrupamiento
        System.out.println("Moneda Euro :" + formatoAleman.format(150));
        System.out.println("Moneda Dolar :" + formatoAmericano.format(150));
        System.out.println("Moneda Soles :" + formatoPeru.format(150));
    }

    public static void numberFormat() {
        // Establecer el Locale como US para usar el punto como 
        // separador decimal.
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        // Agrupar  si es true
        nf.setGroupingUsed(true);
        System.out.println(nf.format(10000000.0045451));
        // No agrupar, ya que es false 
        nf.setGroupingUsed(false);
        System.out.println(nf.format(10000000.0045451));
                
        System.out.println("Con 3 enteros mínimo");
        nf.setMinimumIntegerDigits(3);
        System.out.println(nf.format(12));
                
        System.out.println("Con 5 enteros máximo");
        nf.setMaximumIntegerDigits(5);
        System.out.println(nf.format(123456));
        
        System.out.println("Con 4 enteros máximo en los decimales");
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(123.981454));
        
        System.out.println("Con 2 enteros mínimo en los decimales");
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(45.2));
    }
}
