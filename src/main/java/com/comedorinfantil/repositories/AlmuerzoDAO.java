package com.comedorinfantil.repositories;

import com.comedorinfantil.modelo.Almuerzo;

import java.util.ArrayList;
import java.util.List;

public class AlmuerzoDAO {
    private final List<Almuerzo> lista = new ArrayList<>();

    public void guardar(Almuerzo almuerzo) {
        lista.add(almuerzo);
    }

    public Almuerzo buscarPorId(int id) {
        for (Almuerzo a : lista) {
            if (a.getId() == id) return a;
        }
        return null;
    }

    public List<Almuerzo> listarTodos() {
        return lista;
    }

    public void actualizar(Almuerzo almuerzo) {
        Almuerzo existente = buscarPorId(almuerzo.getId());
        if (existente != null) {
            existente.setDescripcion(almuerzo.getDescripcion());
            existente.setFecha(almuerzo.getFecha());
        }
    }

    public void eliminar(int id) {
        lista.removeIf(a -> a.getId() == id);
    }
}
