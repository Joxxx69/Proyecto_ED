package Objetos;

public class Asiento {
   int idAsiento=-1;
   int idSala;
   int fila;
   int columna;
   MatrizAsientos asientosSala;
    public Asiento(int idSala, int fila, int columna) {
        this.idAsiento++;
        this.idSala = idSala;
        this.fila = fila;
        this.columna = columna;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }   
}
