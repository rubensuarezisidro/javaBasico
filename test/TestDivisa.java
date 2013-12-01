
import clases.clase6.test.Divisa;
import org.junit.*;
import static org.junit.Assert.*;

public class TestDivisa {

    public TestDivisa() {
    }

    @Test
    public void testSumar() throws Exception {
        System.out.println("sumar");
        //creando objetos divisa1 y divisa 2
        Divisa divisa1 = new Divisa(30, "Soles");
        Divisa divisa2 = new Divisa(20, "Soles");
        // almacena en resultado la suma entre las 2 divisas 
        Divisa resultado = divisa2.sumar(divisa1);
        //se crea un objeto del tipo Divisa, 
        //con los datos que se supone ddbe salir
        Divisa divisaEsperda = new Divisa(50, "Soles");
        
        assertEquals("veamos que sale",divisaEsperda.getImporte(), resultado.getImporte());
    }
}
