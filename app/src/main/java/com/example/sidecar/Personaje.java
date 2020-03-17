package com.example.sidecar;

public class Personaje {
    private double momentoInv;
    private String nombre;
    private static int id=0;

    public Personaje(String nombre) {
        this.id++;
        this.nombre = nombre;
    }

    public static int getId() {
        return id;
    }

    public double getMomentoInv() {
        return momentoInv;
    }

    public void setMomentoInv(double momentoInv) {
        this.momentoInv = momentoInv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
