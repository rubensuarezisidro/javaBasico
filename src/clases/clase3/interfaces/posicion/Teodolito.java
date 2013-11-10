package clases.clase3.interfaces.posicion;

public class Teodolito {
    
    public static void main(String[] args) {
        //instanciamos el objeto 
        Posicion carro = new Auto(20d, 30d);
        Posicion ruben = new Persona(50d, 20d);
        
        Teodolito.getDistancia(carro, ruben);
    }
    
    public static void getDistancia(Posicion p1, Posicion p2) {
        //estamos trayendo los valores de la clase
        double dis1 = p1.getLatitud() - p2.getLatitud();
        double dis2 = p1.getLongitud() - p2.getLongitud();
        
        System.out.println(Math.sqrt(dis2 * dis1 + dis2 * dis1));
    }
}
