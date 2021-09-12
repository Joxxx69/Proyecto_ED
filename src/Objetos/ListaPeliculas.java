package Objetos;
public class ListaPeliculas {
    static int MAXIMOPELICULAS=10;
    Pelicula listapeliculas[];
    int posfinal;//Guarda la posicion del último elemento insertado
    
    //Constructor que crea un vector de películas con un máximo de 10 películas
    public ListaPeliculas() {
        this.listapeliculas= new Pelicula[MAXIMOPELICULAS];
        this.posfinal=0;
    }
    
   /*Este método inserta un película al final de la lista 
    si se puede insertar lo inserta y aumenta el valor del posfinal y retorna 0,
    caso contrario retorna 1.
   */
    public int addPelicula(Pelicula pelic){
        if(posfinal<MAXIMOPELICULAS){
            this.listapeliculas[posfinal]=pelic;
            this.posfinal++;
            return 0;
        }else{
            return 1;
        }
    }
    
    /*Método de buscar una película por su nombre que retorna el idpelicula en caso de encontralo*/
    public int buscaPelNombre(String nombBus){
        for(int i = 0; i < posfinal-1; i++){
            if (nombBus.compareToIgnoreCase(listapeliculas[i].nombre)==0){
                return listapeliculas[i].idpelicula;
            }
        }
        return -1;
    }
    
    //Metodo ordena por inserción directa vector peliculas por el nombre
    public void ordenaPeliculaNombre (){
        String menor;
        String aux;
        Pelicula auxP;
        int pos;
        for (int i = 0; i < this.posfinal-1; i++) {
            menor = (String)listapeliculas[i].nombre;
            pos = i;
            for (int j = i+1; j < this.posfinal-1; j++) {
                aux=(String)listapeliculas[j].nombre;
                if (menor.compareToIgnoreCase(aux)>0){
                    menor = (String)listapeliculas[j].nombre;
                    pos = j;
                }
            }
            if (pos != i) {
                auxP =listapeliculas[i];
                listapeliculas[i]= listapeliculas[pos];
                listapeliculas[pos]=auxP;
            }
        }
    }
    
    
    
    @Override
    public String toString() {
        String salida="";
        for(Pelicula aux: listapeliculas){
            salida+=aux.toString()+"  \n";
        }
        return salida;
    }
    
    
}
