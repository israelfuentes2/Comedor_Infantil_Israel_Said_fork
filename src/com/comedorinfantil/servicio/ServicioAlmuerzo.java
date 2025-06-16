package com.comedorinfantil.servicio;

import com.comedorinfantil.modelo.Almuerzo;
import com.comedorinfantil.repositorio.RepositorioAlmuerzo;

import java.util.List;

public class ServicioAlmuerzo {
    private final RepositorioAlmuerzo repo;

    public ServicioAlmuerzo(RepositorioAlmuerzo repo) {
        this.repo = repo;
    }

    public void registrar(Almuerzo almuerzo) {
        repo.guardar(almuerzo);
    }

    public Almuerzo obtener(int id) {
        return repo.buscarPorId(id);
    }

    public List<Almuerzo> listar() {
        return repo.listarTodos();
    }

    public void modificar(Almuerzo almuerzo) {
        repo.actualizar(almuerzo);
    }

    public void eliminar(int id) {
        repo.eliminar(id);
    }
}
