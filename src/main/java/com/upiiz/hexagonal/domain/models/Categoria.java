package com.upiiz.hexagonal.domain.models;

public class Categoria {

    //Reglas del negocio
    private long id;
    private String descripcion;

    public Categoria(long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Categoria() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
