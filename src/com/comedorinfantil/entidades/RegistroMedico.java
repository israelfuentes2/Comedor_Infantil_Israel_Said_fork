package edu.unicartagena.Entidades;

public class RegistroMedico {
    private int id;
    private int idNino;
    private String observacion;
    private String fecha;

    public RegistroMedico(int id, int idNino, String observacion, String fecha) {
        this.id = id;
        this.idNino = idNino;
        this.observacion = observacion;
        this.fecha = fecha;
    }

    public int getId() { return id; }
    public int getIdNino() { return idNino; }
    public String getObservacion() { return observacion; }
    public String getFecha() { return fecha; }

    public void setId(int id) { this.id = id; }
    public void setIdNino(int idNino) { this.idNino = idNino; }
    public void setObservacion(String observacion) { this.observacion = observacion; }
    public void setFecha(String fecha) { this.fecha = fecha; }
}

