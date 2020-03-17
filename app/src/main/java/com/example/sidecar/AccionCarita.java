package com.example.sidecar;

public class AccionCarita extends Accion {
    private int r,g,b;

    public AccionCarita(int r, int g, int b) {
        super();
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void asignarAccion() {
        super.asignarAccion();
    }
}
