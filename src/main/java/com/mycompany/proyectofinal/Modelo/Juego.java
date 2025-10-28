package com.mycompany.proyectofinal.Modelo;

public class Juego {

    private int turno;
    private Dado dado;

    public Juego() {
        this.dado = new Dado();
        this.turno = 0;
    }

    public int lanzarDado() {
        return dado.tirar();
    }

    public void cambiarTurno() {

        if (this.turno == 0) {
            this.turno = 1;
        } else {
            this.turno = 0;
        }
    }

    public int getTurno() {
        return this.turno;
    }
}
