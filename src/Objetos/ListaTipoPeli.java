package Objetos;

public class ListaTipoPeli {
    static int MAXIMOPELICULAS=10;
    TipoPelicula[] listaTipoPeliculas;
    int posfinal;//Guarda la posicion del último elemento insertado
    
    //Constructor que crea un vector de películas con un máximo de 10 películas
    public ListaTipoPeli() {
        this.listaTipoPeliculas= new TipoPelicula[MAXIMOPELICULAS];
        this.posfinal=0;
    }
    
   /*Este método inserta un película al final de la lista 
    si se puede insertar lo inserta y aumenta el valor del posfinal y retorna 0,
    caso contrario retorna 1.
   */
    public int addPelicula(TipoPelicula tipoPeli){
        if(posfinal<MAXIMOPELICULAS){
            this.listaTipoPeliculas[posfinal]=tipoPeli;
            this.posfinal++;
            return 0;
        }else{
            return 1;
        }
    }
       
    
}
