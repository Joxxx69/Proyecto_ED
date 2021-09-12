package Objetos;
//Esta es la lista que me dice cuantas clasificaciones hay

public class ListClasifPel {

    static int MAXIMOCLASIFICACION = 3;
    ClasifPelicu[] listaTipoPeliculas;
    int posfinal;

    //Constructor que crea un vector de películas con un máximo de 10 películas
    public ListClasifPel() {
        this.listaTipoPeliculas = new ClasifPelicu[MAXIMOCLASIFICACION];
        this.posfinal = 0;
    }
        /*Este método inserta una clasificacion al final de la lista, 
    si se puede insertar lo inserta y aumenta el valor del posfinal y retorna 0,
    caso contrario retorna 1.
         */
    
    public int addClasiPeli(ClasifPelicu clasPeli) {
        if (posfinal < MAXIMOCLASIFICACION) {
            this.listaTipoPeliculas[posfinal] = clasPeli;
            this.posfinal++;
            return 0;
        } else {
            return 1;
        }
    }
}

