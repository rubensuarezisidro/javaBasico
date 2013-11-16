/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.clase3.centros;

import java.util.List;

/**
 *
 * @author RUBEN
 */
public abstract class  Centro {
private int codigo;
private int ruc;
private String razonSocial;
private String direccion;
private List<String> telefono;
private String ditrito;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<String> getTelefono() {
        return telefono;
    }

    public void setTelefono(List<String> telefono) {
        this.telefono = telefono;
    }


    
}
