package Objetos;

public class Sala {
    int idsala=-1;
    String nombre;
    static int numButacas =25;
    MatrizAsientos asientos;

    public Sala(String nombre) {
        this.nombre=nombre;
        this.idsala++;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

 
    @Override
    public String toString() {
        return "Sala{" + "idsala=" + idsala + ", asientos=" + asientos + '}';
    }

    
    
    
    
}
