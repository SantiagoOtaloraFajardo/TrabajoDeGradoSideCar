package com.example.sidecar;

import java.util.ArrayList;

public class Obra {
    private String nombre;
    private int id;
    private ArrayList<Escena> escenas;
    public Obra(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.escenas=new ArrayList<>();
    }

    public ArrayList<Escena> getEscenas() {
        return escenas;
    }

    public void setEscenas(ArrayList<Escena> escenas) {
        this.escenas = escenas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
