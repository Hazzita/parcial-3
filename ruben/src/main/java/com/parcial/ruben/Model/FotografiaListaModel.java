package com.parcial.ruben.Model;

public class FotografiaListaModel {
    private int id;
    private String descripcion;

    public FotografiaListaModel(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
