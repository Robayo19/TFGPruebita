package com.example.tfgpruebita.modelo;

public class Jugador {

    private int id;
    private String nombre;
    private String equipo;
    private int goles;
    private int asistencias;
    private String estadoSalud;
    private boolean mvp;
    private String posicion;
    private String valor;
    private int puntosJornada;
    private int puntosTotales;

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public boolean isMvp() {
        return mvp;
    }

    public void setMvp(boolean mvp) {
        this.mvp = mvp;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getPuntosJornada() {
        return puntosJornada;
    }

    public void setPuntosJornada(int puntosJornada) {
        this.puntosJornada = puntosJornada;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", goles=" + goles +
                ", asistencias=" + asistencias +
                ", estadoSalud='" + estadoSalud + '\'' +
                ", mvp=" + mvp +
                ", posicion='" + posicion + '\'' +
                ", valor='" + valor + '\'' +
                ", puntosJornada=" + puntosJornada +
                ", puntosTotales=" + puntosTotales +
                '}';
    }
}
