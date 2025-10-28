package com.mycompany.proyectofinal.Controlador;

import com.mycompany.proyectofinal.Modelo.Juego;
import com.mycompany.proyectofinal.Modelo.Jugador;
import com.mycompany.proyectofinal.Vista.GUITablero;
import com.mycompany.proyectofinal.Vista.GUInicio;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControladorJuego implements ActionListener {

    private GUInicio guiInicio;

    private GUITablero guiTablero;

    private Juego juego;

    private Jugador j1;
    private Jugador j2;

    public ControladorJuego() throws IOException {
        juego = new Juego();
        guiInicio = new GUInicio(this);
        guiTablero = new GUITablero(this);
        guiInicio.setVisible(true);

        this.j1 = new Jugador("Pedro", Color.blue);

        this.j2 = new Jugador("Mario", Color.green);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //GUIInicio
        if (e.getSource() == guiInicio.getBtnPlay()) {
            guiInicio.dispose();
            this.guiTablero.setVisible(true);

        }
        if (e.getSource() == guiInicio.getBtnCreditos()) {
            System.out.println("getBtnCreditos");
        }
        if (e.getSource() == guiInicio.getBtnSalir()) {
            System.exit(0);
        }
        if (e.getSource() == guiInicio.getBtnInstrucciones()) {
            System.out.println("getBtnInstrucciones");
        }
        if (e.getSource() == guiInicio.getBtnHistoria()) {
            System.out.println("getBtnHistoria");
        }

        if (e.getSource() == guiInicio.getBtnAzul()) {
            System.out.println("getBtnAzul");
        }
        if (e.getSource() == guiInicio.getBtnAmarillo()) {
            System.out.println("getBtnAmarillo");
        }
        if (e.getSource() == guiInicio.getBtnRojo()) {
            System.out.println("getBtnRojo");
        }
        if (e.getSource() == guiInicio.getBtnVerde()) {
            System.out.println("getBtnVerde");
        }

        //PanelControles
        if (e.getActionCommand().equals("TIRAR")) {

            Jugador jugadorActual;

            if (juego.getTurno() == 0) {
                jugadorActual = j1;
            } else {
                jugadorActual = j2;
            }

            this.guiTablero.getBotonesPanel().actualizarDado(jugadorActual.getColor(), jugadorActual.getNombreColor(), juego.lanzarDado());
            this.juego.cambiarTurno();

        }

    }

}
