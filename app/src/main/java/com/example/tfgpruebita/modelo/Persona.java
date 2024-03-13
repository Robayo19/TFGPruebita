package com.example.tfgpruebita.modelo;

public class Persona {

    private String id;
    private String nombre;
    private String correo;
    private String contrasena;

    public Persona() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Id:" + id +
                ". Nombre: " + nombre +
                ", Correo: " + correo +
                ", Contraseña: " + contrasena;
    }
}
