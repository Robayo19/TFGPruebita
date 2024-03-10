package com.example.tfgpruebita.modelo;

public class Persona {

    private String id;
    private String nombre;
    private int edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
                ", Edad: " + edad +
                ", Correo: " + correo +
                ", Contraseña: " + contrasena;
    }
}
