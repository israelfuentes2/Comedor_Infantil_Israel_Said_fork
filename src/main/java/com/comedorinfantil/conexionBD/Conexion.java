package com.comedorinfantil.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection ConectarBD(String db, String user, String password) {
        Connection conexion;
        String host = "jdbc:postgresql://localhost:5432";

        // jdbc:postgresql://<host>:<puerto>/<nombre_bd> //
        String conexionUrl = host + "/" + db;

        System.out.println("Conectando...");

        try {
            conexion = DriverManager.getConnection(conexionUrl, user, password);
            System.out.println("Conectado");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return conexion;
    }
}
