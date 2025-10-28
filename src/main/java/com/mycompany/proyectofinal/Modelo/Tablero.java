package com.mycompany.proyectofinal.Modelo;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Casilla> casillas;
    private GeneradorTablero generador;

    public Tablero() {
        this.generador = new GeneradorTablero();
        this.casillas = generador.getCasillas();
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public Casilla getCasilla(int numeroCasilla) {
        if (numeroCasilla >= 1 && numeroCasilla <= casillas.size()) {
            return casillas.get(numeroCasilla - 1);
        }
        return null;
    }
}
