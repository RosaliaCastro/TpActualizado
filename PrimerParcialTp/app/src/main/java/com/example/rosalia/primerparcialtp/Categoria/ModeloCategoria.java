package com.example.rosalia.primerparcialtp.Categoria;

/**
 * Created by Jona on 28/09/2016.
 */
public class ModeloCategoria {

    private String nombreCategoria;
    private String descripcionCategoria;

    public ModeloCategoria(String cat, String des) {
        nombreCategoria=cat;
        descripcionCategoria= des;
    }
    public ModeloCategoria(){}

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
