package Objetos;
//Esta clase me dice si es de Terror, Ficcion, Romance etc;
public class TipoPelicula {
    int idclasifPel=-1;
    String tipo;

    public TipoPelicula(String tipo) {
        this.tipo = tipo;
    }

    public int getIdclasifPel() {
        return idclasifPel;
    }

    public void setIdclasifPel(int idclasifPel) {
        this.idclasifPel = idclasifPel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

}
