
package clases.clase3.centros;

import clases.clase3.centros.abstractas.Centro;
import java.util.List;


public class Botica extends Centro {
        private List<String> horario; 

        
    public List<String> getHorario() {
        return horario;
    }

    public void setHorario(List<String> horario) {
        this.horario = horario;
    }
        
        
    
}
