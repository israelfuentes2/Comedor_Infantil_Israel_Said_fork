package edu.unicartagena.Entidades;

public class Encargado {
    private int idEncargado;
    private String nombre;
    private String telefono;

    public Encargado() {}

    public Encargado(int idEncargado, String nombre, String telefono) {
        this.idEncargado = idEncargado;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(int idEncargado) {
        this.idEncargado = idEncargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
