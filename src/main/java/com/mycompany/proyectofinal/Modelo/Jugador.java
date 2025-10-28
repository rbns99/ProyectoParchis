package com.mycompany.proyectofinal.Modelo;

import java.awt.Color;

public class Jugador {

    private String nombre;
    private Color color;
    private int puntaje;
    private boolean turno;

    public Jugador(String nombre, Color color) {
        this.nombre = nombre;
        this.color = color;
        this.puntaje = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Color getColor() {
        return color;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public boolean isTurno() {
        return turno;
    }

    public String getNombreColor() {
        if (color.equals(Color.red)) {
            return "Rojo";
        }
        if (color.equals(Color.blue)) {
            return "Azul";
        }
        if (color.equals(Color.green)) {
            return "Verde";
        }
        if (color.equals(Color.yellow)) {
            return "Amarillo";
        }
        return "error";
    }
}
