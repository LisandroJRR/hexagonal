package com.upiiz.hexagonal.domain.ports.out;

import com.upiiz.hexagonal.domain.models.Categoria;

import java.util.List;

//Interfaz - contrato - Puerto salida - Infraestructura DB
public interface CategoriaRepository {
    Categoria save(Categoria categoria);
    Categoria findById(Long id);
    List<Categoria> findAll();
    Categoria update(Categoria categoria);
    void delete(Long id);

}
