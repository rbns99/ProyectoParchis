package com.mycompany.proyectofinal.Modelo;

import java.util.Random;

public class Dado {

    Random random;
    int valor;

    public Dado() {
        this.random = new Random();
        this.valor = 0;
    }

    public int tirar() {
        this.valor = random.nextInt(6) + 1;
        return valor;
    }

    public int getValor() {
        return valor;
    }
}
