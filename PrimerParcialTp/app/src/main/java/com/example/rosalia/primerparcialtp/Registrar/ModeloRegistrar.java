package com.example.rosalia.primerparcialtp.Registrar;

/**
 * Created by Jona on 05/10/2016.
 */
public class ModeloRegistrar {
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
