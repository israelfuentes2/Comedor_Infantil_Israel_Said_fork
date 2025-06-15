package edu.unicartagena.Entidades;

public class Sucursal {
    private int id;
    private String direccion;
    private String ciudad;

    public Sucursal(int id, String direccion, String ciudad) {
        this.id = id;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getId() { return id; }
    public String getDireccion() { return direccion; }
    public String getCiudad() { return ciudad; }

    public void setId(int id) { this.id = id; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
}

