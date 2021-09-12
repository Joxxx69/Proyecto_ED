package Objetos;

public class Cliente {
    int idcliente=-1;
    int cedula;
    String apellido;
    String nombre;
    String email;

    public Cliente(int cedula, String apellido, String nombre, String email) {
        this.idcliente++;
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
    }
    
    public int getId() {
        return idcliente;
    }

    public void setId(int id) {
        this.idcliente = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente: " + "N° cédula: " + cedula + "; Apellido: " + apellido + "; Nombre: " + nombre + "; Correo: " + email;
    }

    
    
    
}
