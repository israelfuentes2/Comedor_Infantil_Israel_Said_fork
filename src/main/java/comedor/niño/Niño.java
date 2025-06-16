package comedor.niño;

public class Niño {
    private int id;
    private String nombre;
    private String fechaNacimiento;
    private String acudiente;
    private boolean subsidio;

    public Niño(int id, String nombre, String fechaNacimiento, String acudiente, boolean subsidio) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.acudiente = acudiente;
        this.subsidio = subsidio;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getAcudiente() { return acudiente; }
    public void setAcudiente(String acudiente) { this.acudiente = acudiente; }

    public boolean isSubsidio() { return subsidio; }
    public void setSubsidio(boolean subsidio) { this.subsidio = subsidio; }
}
