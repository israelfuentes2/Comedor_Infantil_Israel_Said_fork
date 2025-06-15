package edu.unicartagena.Entidades;

public class EntregaAlmuerzo {
    private int id;
    private int idNino;
    private int idAlmuerzo;

    public EntregaAlmuerzo(int id, int idNino, int idAlmuerzo) {
        this.id = id;
        this.idNino = idNino;
        this.idAlmuerzo = idAlmuerzo;
    }

    public int getId() { return id; }
    public int getIdNino() { return idNino; }
    public int getIdAlmuerzo() { return idAlmuerzo; }

    public void setId(int id) { this.id = id; }
    public void setIdNino(int idNino) { this.idNino = idNino; }
    public void setIdAlmuerzo(int idAlmuerzo) { this.idAlmuerzo = idAlmuerzo; }
}
