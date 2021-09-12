package Objetos;

public class ListaCliente {
    static int MAXIMOCLIENTES=10;
    Cliente[] listacliente;
    int posFinal;//Guarda la posicion del último elemento insertado
    
    //Constructor
    public ListaCliente() {
        this.listacliente= new Cliente[MAXIMOCLIENTES];
        this.posFinal=0;
    }
    
   /*Este método inserta un cliente al final de la lista 
    si se puede insertar lo inserta y aumenta el valor del posFinal y retorna 0,
    caso contrario retorna 1.
   */
    public int addCliente(Cliente cliente){
        if(posFinal<MAXIMOCLIENTES){
            this.listacliente[posFinal]=cliente;
            this.posFinal++;
            return 0;
        }else{
            return 1;
        }
    }
    
    //Metodo ordena por inserción directa vector cliente por el Nombre
    public void ordenaClienteNombre (){
        String menor;
        String aux;
        Cliente auxP;
        int pos;
        for (int i = 0; i < this.posFinal-1; i++) {
            menor = (String)listacliente[i].nombre;
            pos = i;
            for (int j = i+1; j < this.posFinal-1; j++) {
                aux=(String)listacliente[j].nombre;
                if (menor.compareToIgnoreCase(aux)>0){
                    menor = (String)listacliente[j].nombre;
                    pos = j;
                }
            }
            if (pos != i) {
                auxP =listacliente[i];
                listacliente[i]= listacliente[pos];
                listacliente[pos]=auxP;
            }
        }
    }
    
    //Método busca a un cliente por numero de cédula y retorna su id en caso de encontrarlo
    public int buscaClienCedula(int cedBuscar){
        for(int i = 0; i < posFinal-1; i++){
            if (cedBuscar==listacliente[i].cedula){
                return listacliente[i].idcliente;
            }
        }
        return -1;
    }
 
    //Método que retorna un string de la lista de clientes
    @Override
    public String toString() {
        String salida="";
        for(Cliente aux: listacliente){
            salida+=aux.toString()+"  \n";
        }
        return salida;
    }
    
}
