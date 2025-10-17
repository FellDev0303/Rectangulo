/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

import Control.ControladorRectangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author Vero
 */
public class Taller2Punto2A {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ControladorRectangulo ctrl = new ControladorRectangulo();
        VistaRectangulo vista = new VistaRectangulo(ctrl);

        JOptionPane.showMessageDialog(null, "Sistema de administración de rectángulos - Ejercicio 2");
        vista.iniciar();
    }
}
