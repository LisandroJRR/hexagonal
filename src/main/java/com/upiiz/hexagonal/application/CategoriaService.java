package com.upiiz.hexagonal.application;

import com.upiiz.hexagonal.domain.models.Categoria;
import com.upiiz.hexagonal.domain.ports.in.CategoriaUseCase;
import com.upiiz.hexagonal.domain.ports.out.CategoriaRepository;

import java.util.List;

public class CategoriaService implements CategoriaUseCase {
    //Reglas de negocio

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria registrar(Categoria categoria) {
        //Validar que los datos esten correctos
        return categoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoriaRepository.update(categoria);
    }

    @Override
    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public void eliminar(Long id) {
        categoriaRepository.delete(id);
    }
}
