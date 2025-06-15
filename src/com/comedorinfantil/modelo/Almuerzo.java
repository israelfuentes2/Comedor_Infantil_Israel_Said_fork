package com.comedorinfantil.modelo;

public class Almuerzo {
    private int id;
    private String descripcion;
    private String fecha;

    public Almuerzo(int id, String descripcion, String fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public String getFecha() { return fecha; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    @Override
    public String toString() {
        return "Almuerzo{id=" + id + ", descripcion='" + descripcion + "', fecha='" + fecha + "'}";
    }
}
