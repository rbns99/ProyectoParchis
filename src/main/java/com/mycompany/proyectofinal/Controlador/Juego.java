package com.mycompany.proyectofinal.Controlador;

import com.mycompany.proyectofinal.Vista.GUInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Juego implements ActionListener {

    GUInicio guiInicio;

    public Juego() {
        this.guiInicio = new GUInicio(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guiInicio.getBtnPlay()) {
            System.out.println("getBtnPlay");
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
    }

}
