package comedor.niño;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NiñoTest {

    @Test
    public void testAgregarYBuscar() {
        NiñoRepositorySQLite repo = new NiñoRepositorySQLite();
        repo.crearTabla();
        Niño n = new Niño(1, "Ana", "2016-04-05", "Luis", true);
        repo.agregar(n);

        boolean encontrado = repo.listar().stream().anyMatch(ni -> ni.getNombre().equals("Ana"));
        assertTrue(encontrado);
    }
}
