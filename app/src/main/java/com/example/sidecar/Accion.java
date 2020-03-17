package com.example.sidecar;

public abstract class Accion {
    private static int id=0;
    public Accion() {
        this.id++;
    }
    public static int getId() {
        return id;
    }

    public void asignarAccion()
    {

    }
}
