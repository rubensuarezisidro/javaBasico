package clases.clase4.practica;

public class Dieta {

    private int cantAgua;
    private int cantAlimento;
    

    public int getCantAgua() {
        return cantAgua;
    }

    public void setCantAgua(int cantAgua) {
        this.cantAgua = cantAgua;
    }

    public int getCantAlimento() {
        return cantAlimento;
    }

    public void setCantAlimento(int cantAlimento) {
        this.cantAlimento = cantAlimento;
    }
    
    
    public void combinar(){
        System.out.println("Combinando Agua y Alimento");
}

}
