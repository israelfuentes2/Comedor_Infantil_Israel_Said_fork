package edu.unicartagena.Entidades;

public class Nino {
    private int idNiño;
    private String nombre;
    private int edad;
    private String genero;
    private int idEncargado;

    public Nino() {}

    public Nino(int idNiño, String nombre, int edad, String genero, int idEncargado) {
        this.idNiño = idNiño;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.idEncargado = idEncargado;
    }

    public int getIdNiño() {
        return idNiño;
    }

    public void setIdNiño(int idNiño) {
        this.idNiño = idNiño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(int idEncargado) {
        this.idEncargado = idEncargado;
    }
}
