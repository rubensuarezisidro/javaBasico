
package clases.clase3.centros;

import java.util.Date;


public class Receta {
    private Date fecEmision;
    private Date fecVencimiento;
    private int cantidad;
    private String medidaReceta;
    private String medicoReceta;

    public Date getFecEmision() {
        return fecEmision;
    }

    public void setFecEmision(Date fecEmision) {
        this.fecEmision = fecEmision;
    }

    public Date getFecVencimiento() {
        return fecVencimiento;
    }

    public void setFecVencimiento(Date fecVencimiento) {
        this.fecVencimiento = fecVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedidaReceta() {
        return medidaReceta;
    }

    public void setMedidaReceta(String medidaReceta) {
        this.medidaReceta = medidaReceta;
    }

    public String getMedicoReceta() {
        return medicoReceta;
    }

    public void setMedicoReceta(String medicoReceta) {
        this.medicoReceta = medicoReceta;
    }
    
    
    
}
