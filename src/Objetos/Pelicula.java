package Objetos;

public class Pelicula {
    int idpelicula=-1;
    String nombre;
    int duracion;
    int idtipoPel;
    int idclasificacion;
    String descripcion;

    public Pelicula(String nombre, int duracion, int idtipoPel, int idclasificacion, String descripcion) {
        this.idpelicula++;
        this.nombre = nombre;
        this.duracion = duracion;
        this.idtipoPel = idtipoPel;
        this.idclasificacion = idclasificacion;
        this.descripcion = descripcion;
    }

    

    public int getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(int idpelicula) {
        this.idpelicula = idpelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getIdclasificacion() {
        return idclasificacion;
    }

    public void setIdclasificacion(int idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idpelicula=" + idpelicula + ", nombre=" + nombre + ", duracion=" + duracion + ", idtipoPel=" + idtipoPel + ", idclasificacion=" + idclasificacion + ", descripcion=" + descripcion + '}';
    }


    
    
    
    
    
}
