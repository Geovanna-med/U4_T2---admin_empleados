package models;

public class Cliente {

    private int numCliente;
    private String nombre;
    private String apellido;

    public Cliente(int numCliente, String nombre, String apellido) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
