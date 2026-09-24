package com.upiiz.hexagonal.infraestructure.in.web;

import com.upiiz.hexagonal.domain.models.Categoria;
import com.upiiz.hexagonal.domain.ports.in.CategoriaUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriaController {
    // aquí es traer los casos de uso implementados en application

    private final CategoriaUseCase categoriaUseCase;

    public CategoriaController(CategoriaUseCase categoriaUseCase) {
        this.categoriaUseCase = categoriaUseCase;
    }


    @GetMapping
    public List<Categoria> getCategorias() {
        return categoriaUseCase.listar();
    }

    @GetMapping("/{id}")
    public Categoria getCategoria(@PathVariable Long id){
        return categoriaUseCase.buscarPorId(id);
    }

    @PostMapping
    public Categoria create(@RequestBody final Categoria categoria) {
        return categoriaUseCase.registrar(categoria);
    }
    @PutMapping("/{id}")
    public Categoria update(@RequestBody final Categoria categoria){
        return categoriaUseCase.actualizar(categoria);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable final Long id){
        categoriaUseCase.eliminar(id);
    }

}