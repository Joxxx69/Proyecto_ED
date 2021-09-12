package Objetos;

public class Proyecciones {
    int idproyecc=-1;
    int idsala;
    HoraFecha horaproy;

    public Proyecciones( int idsala, HoraFecha hora) {
        this.idproyecc++;
        this.idsala = idsala;
        this.horaproy = hora;
    }

    public int getIdproyecc() {
        return idproyecc;
    }

    public void setIdproyecc(int idproyecc) {
        this.idproyecc = idproyecc;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public HoraFecha getHora() {
        return horaproy;
    }

    public void setHora(HoraFecha hora) {
        this.horaproy = hora;
    }
    
    
    
}
