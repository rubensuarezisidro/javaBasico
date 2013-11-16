
package clases.clase3.centros;

import clases.clase3.centros.abstractas.Producto;


public class Medicamento  extends Producto{
    String posologia;
    String contraindicaciones;

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }
    
    
    
}
