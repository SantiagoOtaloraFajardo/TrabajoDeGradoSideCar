package com.example.sidecar;

import java.util.ArrayList;

public class Escena {
    private String nombre;
    private static int id=0;
    private ArrayList<Personaje> personajes;
    private ArrayList<Fragmento> fragmentos;
    private Escenario escenario;
    //Kreator
    public Escena(String nombre) {
        this.nombre = nombre;
        this.personajes=new ArrayList<>();
        this.fragmentos=new ArrayList<>();
        this.id++;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    public static int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
