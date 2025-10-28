package com.mycompany.proyectofinal.Modelo;

public class Casilla {

    private int numero;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private boolean esEspecial;
    private String tipo;

    public Casilla(int numero, int x, int y, boolean esEspecial, String tipo) {
        this.numero = numero;
        this.x = x;
        this.y = y;
        this.esEspecial = esEspecial;
        this.tipo = tipo;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public boolean isEsEspecial() {
        return esEspecial;
    }

    public void setEsEspecial(boolean esEspecial) {
        this.esEspecial = esEspecial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
