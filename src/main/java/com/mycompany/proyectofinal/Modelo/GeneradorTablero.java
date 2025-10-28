package com.mycompany.proyectofinal.Modelo;

import java.util.ArrayList;

public class GeneradorTablero {

    private ArrayList<Casilla> casillas;

    private final int ANCHO_VERTICAL = 64;
    private final int ALTO_VERTICAL = 32;

    private final int ANCHO_HORIZONTAL = 32;
    private final int ALTO_HORIZONTAL = 64;

    private final int ESPACIO_ENTRE_CASILLAS = 33;

    private final int[] CASILLAS_ESPECIALES = {12, 17, 29, 34, 46, 51, 63, 68};

    public GeneradorTablero() {
        casillas = new ArrayList<>();
        generarCasillas();
    }

    private void generarCasillas() {
        int numeroCasilla = 1;
        int posX, posY;

        // Casillas 1-8
        posX = 418;
        posY = 714;
        for (int i = 0; i < 8; i++) {
            agregarCasillaVertical(numeroCasilla, posX, posY - (i * ESPACIO_ENTRE_CASILLAS));
            numeroCasilla++;
        }

        // Casillas 9-16
        posX = 484;
        posY = 416;
        for (int i = 0; i < 8; i++) {
            agregarCasillaHorizontal(numeroCasilla, posX + (i * ESPACIO_ENTRE_CASILLAS), posY);
            numeroCasilla++;
        }

        // Casillas 17-18
        posX = 714;
        posY = 352;
        agregarCasillaHorizontal(numeroCasilla++, posX, posY);
        agregarCasillaHorizontal(numeroCasilla++, posX, posY - ALTO_HORIZONTAL);

        // Casillas 19-25
        posX = posX - ESPACIO_ENTRE_CASILLAS;
        posY = posY - ALTO_HORIZONTAL;
        for (int i = 0; i < 7; i++) {
            agregarCasillaHorizontal(numeroCasilla, posX - (i * ESPACIO_ENTRE_CASILLAS), posY);
            numeroCasilla++;
        }

        // Casillas 26-32
        posX = 418;
        posY = 255;
        for (int i = 0; i < 7; i++) {
            agregarCasillaVertical(numeroCasilla, posX, posY - (i * ESPACIO_ENTRE_CASILLAS));
            numeroCasilla++;
        }

        // Casillas 33-35
        posX = 418;
        posY = 22;
        agregarCasillaVertical(numeroCasilla++, posX, posY);
        agregarCasillaVertical(numeroCasilla++, posX - 64, posY);
        agregarCasillaVertical(numeroCasilla++, posX - 128, posY);

        // Casillas 36-42
        posX = 286;
        posY = 249;

        for (int i = 6; i >= 0; i--) {
            agregarCasillaVertical(42 - i, posX, posY - (i * ESPACIO_ENTRE_CASILLAS));
        }
        numeroCasilla = 43;

        // Casillas 43-50
        posX = 253;
        posY = 289;
        for (int i = 0; i < 8; i++) {
            agregarCasillaHorizontal(numeroCasilla, posX - (i * ESPACIO_ENTRE_CASILLAS), posY);
            numeroCasilla++;
        }

        // Casillas 51-52
        posX = 22;
        posY = 353;
        agregarCasillaHorizontal(numeroCasilla++, posX, posY);
        agregarCasillaHorizontal(numeroCasilla++, posX, posY + ALTO_HORIZONTAL);

        // Casillas 53-59
        posX = posX + ESPACIO_ENTRE_CASILLAS;
        posY = posY + ALTO_HORIZONTAL;
        for (int i = 0; i < 7; i++) {
            agregarCasillaHorizontal(numeroCasilla, posX + (i * ESPACIO_ENTRE_CASILLAS), posY);
            numeroCasilla++;
        }

        // Casillas 60-67
        posX = 289;
        posY = 481;
        for (int i = 0; i < 8; i++) {
            agregarCasillaVertical(numeroCasilla, posX, posY + (i * ESPACIO_ENTRE_CASILLAS));
            numeroCasilla++;
        }

        // Casilla 68
        posX = 349;
        posY = 713;
        agregarCasillaVertical(numeroCasilla, posX, posY);

        System.out.println("Generadooooo");
    }

    private void agregarCasillaVertical(int numero, int x, int y) {
        Casilla casilla = new Casilla(numero, x, y, esCasillaEspecial(numero), obtenerTipo(numero));
        casilla.setAncho(ANCHO_VERTICAL);
        casilla.setAlto(ALTO_VERTICAL);
        casillas.add(casilla);
    }

    private void agregarCasillaHorizontal(int numero, int x, int y) {
        Casilla casilla = new Casilla(numero, x, y, esCasillaEspecial(numero), obtenerTipo(numero));
        casilla.setAncho(ANCHO_HORIZONTAL);
        casilla.setAlto(ALTO_HORIZONTAL);
        casillas.add(casilla);
    }

    /**
     * Verifica si una casilla es especial
     */
    private boolean esCasillaEspecial(int numero) {
        int casillaEspecial;
        for (int i = 0; i < CASILLAS_ESPECIALES.length; i++) {
            casillaEspecial = CASILLAS_ESPECIALES[i];
            if (numero == casillaEspecial) {
                return true;
            }
        }

        return false;

    }

    private String obtenerTipo(int numero) {

        if (numero == 5) {
            return "salida_amarillo";
        }
        if (numero == 22) {
            return "salida_azul";
        }
        if (numero == 39) {
            return "salida_rojo";
        }
        if (numero == 56) {
            return "salida_verde";
        }

        boolean especial = esCasillaEspecial(numero);
        if (especial) {
            return "especial";
        }

        return "normal";
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }
}
