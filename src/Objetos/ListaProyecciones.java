package Objetos;

public class ListaProyecciones {
    static int MAXIMOPROY=10;
    Proyecciones[] listaproy;
    int puntero;//Guarda la posicion del último elemento insertado
    public ListaProyecciones() {
        this.listaproy= new Proyecciones[MAXIMOPROY];
        this.puntero=0;
    }
    
   /*Este método inserta un película al final de la lista 
    si se puede insertar lo inserta y aumenta el valor del puntero y retorna 0,
    caso contrario retorna 1.
   */
    public int addPelicula(Proyecciones proyec){
        if(puntero<MAXIMOPROY){
            this.listaproy[puntero]=proyec;
            this.puntero++;
            return 0;
        }else{
            return 1;
        }
    }
    
    //Metodo ordena por inserción directa vector peliculas por el Nombre   
    
    @Override
    public String toString() {
        String salida="";
        for(Proyecciones aux: listaproy){
            salida+=aux.toString()+"  \n";
        }
        return salida;
    }
    
    
}
