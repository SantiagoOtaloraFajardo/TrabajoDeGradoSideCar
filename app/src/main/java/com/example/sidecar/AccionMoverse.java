package com.example.sidecar;

public class AccionMoverse extends Accion {
    private int nodoInicio;
    private int nodoFin;

    public AccionMoverse(int nodoInicio, int nodoFin) {
        super();
        this.nodoInicio = nodoInicio;
        this.nodoFin = nodoFin;
    }

    public int getNodoInicio() {
        return nodoInicio;
    }

    public void setNodoInicio(int nodoInicio) {
        this.nodoInicio = nodoInicio;
    }

    public int getNodoFin() {
        return nodoFin;
    }

    public void setNodoFin(int nodoFin) {
        this.nodoFin = nodoFin;
    }
    @Override
    public void asignarAccion()
    {
        super.asignarAccion();
    }
}
