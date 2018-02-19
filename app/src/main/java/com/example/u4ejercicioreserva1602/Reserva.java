package com.example.u4ejercicioreserva1602;

/**
 * Created by DIDACT on 19/02/2018.
 */

public class Reserva {

    String nombre;
    int personas;
    String dia;
    String hora;
    String observaciones;

    public Reserva(String nombre, int personas, String dia, String hora, String observaciones) {
        this.nombre = nombre;
        this.personas = personas;
        this.dia = dia;
        this.hora = hora;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}

