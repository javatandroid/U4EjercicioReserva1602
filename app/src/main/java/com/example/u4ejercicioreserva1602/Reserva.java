package com.example.u4ejercicioreserva1602;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DIDACT on 19/02/2018.
 */

public class Reserva implements Parcelable {

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

    public Reserva(Parcel p) {
        readFromParcel(p);
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeInt(personas);
        dest.writeString(dia);
        dest.writeString(hora);
        dest.writeString(observaciones);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Reserva> CREATOR = new Creator<Reserva>() {
        @Override
        public Reserva createFromParcel(Parcel in) {
            return new Reserva(in);
        }

        @Override
        public Reserva[] newArray(int size) {
            return new Reserva[size];
        }
    };

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

    private void readFromParcel(Parcel p){
        this.nombre=p.readString();
        this.personas=p.readInt();
        this.dia=p.readString();
        this.hora=p.readString();
        this.observaciones=p.readString();
    }

}

