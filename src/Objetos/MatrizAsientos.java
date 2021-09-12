
package Objetos;

public class MatrizAsientos {
    static int MAXFILCOL=5;
    Boolean matrizAsint[][];

    public MatrizAsientos() {
        this.matrizAsint = new Boolean[MAXFILCOL][MAXFILCOL];
    }
    //Crea un método que pone a todos los asientos disponibles
    public void insertarAsientos(){
        for(int i =0; i<MAXFILCOL; i++){
            for(int j=0; j<MAXFILCOL ; j++){
                this.matrizAsint[i][j]=true; //true significa que está disponible
            }
        }
    }

}
