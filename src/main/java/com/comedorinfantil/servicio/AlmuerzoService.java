package com.comedorinfantil.servicio;

import com.comedorinfantil.modelo.Almuerzo;
import com.comedorinfantil.repositories.AlmuerzoDAO;

import java.util.List;

public class AlmuerzoService {
    private final AlmuerzoDAO repo;

    public AlmuerzoService(AlmuerzoDAO repo) {
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
