package com.example.sidecar;

public class AccionHablar extends Accion {
    //dir de donde esta el audio
    private String dialogo;

    public AccionHablar(String dialogo) {
        super();
        this.dialogo = dialogo;
    }

    public String getDialogo() {
        return dialogo;
    }

    public void setDialogo(String dialogo) {
        this.dialogo = dialogo;
    }

    @Override
    public void asignarAccion() {
        super.asignarAccion();
    }
}
