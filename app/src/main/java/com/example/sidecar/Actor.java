package com.example.sidecar;

import java.util.ArrayList;

public class Actor {
    private static int id;
    private String ipOrganizador;
    private ArrayList<Personaje> personajes;
    public Actor(String ipOrganizador) {
        this.id++;
        this.ipOrganizador = ipOrganizador;
        this.personajes=new ArrayList<>();
    }

    public static int getId() {
        return id;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public String getIpOrganizador() {
        return ipOrganizador;
    }

    public void setIpOrganizador(String ipOrganizador) {
        this.ipOrganizador = ipOrganizador;
    }
}
