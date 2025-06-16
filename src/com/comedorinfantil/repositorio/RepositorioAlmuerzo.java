package com.comedorinfantil.repositorio;

import com.comedorinfantil.modelo.Almuerzo;
import java.util.List;

public interface RepositorioAlmuerzo {
    void guardar(Almuerzo almuerzo);
    Almuerzo buscarPorId(int id);
    List<Almuerzo> listarTodos();
    void actualizar(Almuerzo almuerzo);
    void eliminar(int id);
}
