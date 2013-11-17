package clases.clase4.colecciones;

public class Estudiante implements Comparable<Estudiante> {

    private String nombres;
    private String apellidos;
    private String direccion;
    private int codMatricula;

    public Estudiante( String apellidos, String nombres) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    @Override
    public int compareTo(Estudiante o) {
        String apellidoExterno = o.getApellidos().toLowerCase();
        String apellido = this.getApellidos().toLowerCase();
        return apellido.compareTo(apellidoExterno);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void prntEstudiante() {
        System.out.println(this.apellidos + " - " + this.nombres);
    }
}
