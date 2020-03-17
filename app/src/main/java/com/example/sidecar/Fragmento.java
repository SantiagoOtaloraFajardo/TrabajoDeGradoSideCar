package com.example.sidecar;

import java.util.ArrayList;

public class Fragmento {
    private static int id=0;
    private ArrayList<Accion> acciones;

    public Fragmento(ArrayList<Accion> acciones) {
        this.id++;
        this.acciones = acciones;
    }

    public static int getId() {
        return id;
    }

    public ArrayList<Accion> getAcciones() {
        return acciones;
    }

    public void setAcciones(ArrayList<Accion> acciones) {
        this.acciones = acciones;
    }
}
