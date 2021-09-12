
package Objetos;

public class ListaSalas {
    static int MAXIMOSALAS=4;
    Sala[] listasala;
    int puntero;//Guarda la posicion del último elemento insertado
    public ListaSalas() {
        this.listasala= new Sala[MAXIMOSALAS];
        this.puntero=0;
    }
    
   /*Este método inserta un película al final de la lista 
    si se puede insertar lo inserta y aumenta el valor del puntero y retorna 0,
    caso contrario retorna 1.
   */
    public int addPelicula(Sala sala){
        if(puntero<MAXIMOSALAS){
            this.listasala[puntero]=sala;
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
        for(Sala aux: listasala){
            salida+=aux.toString()+"  \n";
        }
        return salida;
    }
   
    
}
