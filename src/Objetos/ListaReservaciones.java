package Objetos;

public class ListaReservaciones {
    static int MAXIMORESERVACION=25;
    Reservacion[] listareservaciones;
    int puntero;//Guarda la posicion del último elemento insertado
    
    //Constructor
    public ListaReservaciones() {
        this.listareservaciones= new Reservacion[MAXIMORESERVACION];
        this.puntero=0;
    }
    
   /*Este método inserta un cliente al final de la lista 
    si se puede insertar lo inserta y aumenta el valor del puntero y retorna 0,
    caso contrario retorna 1.
   */
    public int addReservacion(Reservacion reserva){
        if(puntero<MAXIMORESERVACION){
            this.listareservaciones[puntero]=reserva;
            this.puntero++;
            return 0;
        }else{
            return 1;
        }
    }
    
    
    //Método que retorna un string de la lista de clientes
    @Override
    public String toString() {
        String salida="";
        for(Reservacion aux: listareservaciones){
            salida+=aux.toString()+"  \n";
        }
        return salida;
    }
    
    
}
