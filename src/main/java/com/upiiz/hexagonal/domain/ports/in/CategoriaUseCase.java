package com.upiiz.hexagonal.domain.ports.in;

import com.upiiz.hexagonal.domain.models.Categoria;

import java.util.List;

//Interfaz - Contratos - Puerto de entrada
public interface CategoriaUseCase {
    Categoria registrar(Categoria categoria);
    List<Categoria> listar();
    Categoria actualizar(Categoria categoria);
    Categoria buscarPorId(Long id);
    void eliminar(Long id);

}
