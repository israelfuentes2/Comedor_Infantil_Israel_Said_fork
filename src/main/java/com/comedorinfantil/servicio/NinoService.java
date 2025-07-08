package com.comedorinfantil.servicio;

import com.comedorinfantil.modelo.Nino;
import com.comedorinfantil.repositories.NinoDAO;

import java.sql.Connection;
import java.util.List;

public class NinoService {
    public static List<Nino> obtenerTodosLosNinos(Connection conexion){
        return NinoDAO.listarNinosYEstado(conexion);
    }
    public static List<Nino> obtenerNinosDadosDeBaja(Connection conexion){
        return NinoDAO.listarNinosDadosDeBaja(conexion);
    }
}

