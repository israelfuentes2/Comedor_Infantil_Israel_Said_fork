package comedor.niño;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NiñoRepositorySQLite {

    private Connection conectar() {
        String url = "jdbc:sqlite:comedor.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS nino (" +
                     "id INTEGER PRIMARY KEY," +
                     "nombre TEXT NOT NULL," +
                     "fechaNacimiento TEXT," +
                     "acudiente TEXT," +
                     "subsidio INTEGER)";
        try (Connection conn = conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void agregar(Niño n) {
        String sql = "INSERT INTO nino(id, nombre, fechaNacimiento, acudiente, subsidio) VALUES(?,?,?,?,?)";
        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, n.getId());
            pstmt.setString(2, n.getNombre());
            pstmt.setString(3, n.getFechaNacimiento());
            pstmt.setString(4, n.getAcudiente());
            pstmt.setBoolean(5, n.isSubsidio());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Niño> listar() {
        List<Niño> lista = new ArrayList<>();
        String sql = "SELECT * FROM nino";
        try (Connection conn = conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Niño(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("fechaNacimiento"),
                    rs.getString("acudiente"),
                    rs.getInt("subsidio") == 1
                ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public void actualizar(Niño n) {
        String sql = "UPDATE nino SET nombre = ?, fechaNacimiento = ?, acudiente = ?, subsidio = ? WHERE id = ?";
        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, n.getNombre());
            pstmt.setString(2, n.getFechaNacimiento());
            pstmt.setString(3, n.getAcudiente());
            pstmt.setBoolean(4, n.isSubsidio());
            pstmt.setInt(5, n.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM nino WHERE id = ?";
        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
