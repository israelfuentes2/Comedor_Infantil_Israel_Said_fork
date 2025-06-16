package com.comedorinfantil.repositorio;

import com.comedorinfantil.modelo.Almuerzo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAlmuerzoEnMemoria implements RepositorioAlmuerzo {
    private final List<Almuerzo> lista = new ArrayList<>();

    @Override
    public void guardar(Almuerzo almuerzo) {
        lista.add(almuerzo);
    }

    @Override
    public Almuerzo buscarPorId(int id) {
        for (Almuerzo a : lista) {
            if (a.getId() == id) return a;
        }
        return null;
    }

    @Override
    public List<Almuerzo> listarTodos() {
        return lista;
    }

    @Override
    public void actualizar(Almuerzo almuerzo) {
        Almuerzo existente = buscarPorId(almuerzo.getId());
        if (existente != null) {
            existente.setDescripcion(almuerzo.getDescripcion());
            existente.setFecha(almuerzo.getFecha());
        }
    }

    @Override
    public void eliminar(int id) {
        lista.removeIf(a -> a.getId() == id);
    }
}
