package Objetos;

//Esta clase me dice si la pelicula es para mayoresde 15 años, mayores de 12 años o todo público
public class ClasifPelicu {
    int idClasifiPeli=-1;
    String descripcion;

    public ClasifPelicu(String descripcion) {
        this.idClasifiPeli++;
        this.descripcion = descripcion;
    }

    public int getIdClasifiPeli() {
        return idClasifiPeli;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    
    
}
