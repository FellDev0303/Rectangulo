/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Control.ControladorRectangulo;
import Modelo.Punto;
import Modelo.Rectangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class VistaRectangulo {

    private final ControladorRectangulo ctrl;

    public VistaRectangulo(ControladorRectangulo ctrl) {
        this.ctrl = ctrl;
    }

    public void iniciar() {
        String s;
        int opcion;
        do {
            s = JOptionPane.showInputDialog(
                    "=== MENÚ RECTÁNGULO ===\n"
                    + "1. Crear rectángulo\n"
                    + "2. Calcular área\n"
                    + "3. Cambiar escala\n"
                    + "4. Comprobar si un punto está dentro\n"
                    + "5. Mover (horizontal o vertical)\n"
                    + "6. Mostrar rectángulo actual\n"
                    + "0. Salir\n"
                    + "Elija una opción:"
            );
            if (s == null) {
                break;
            }
            try {
                opcion = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción inválida.");
                continue;
            }

            try {
                switch (opcion) {
                    case 1 ->
                        crearRectangulo();
                    case 2 ->
                        calcularArea();
                    case 3 ->
                        cambiarEscala();
                    case 4 ->
                        comprobarPunto();
                    case 5 ->
                        moverRectangulo();
                    case 6 ->
                        mostrarRect();
                    case 0 ->{
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        System.exit(0);
                    }
                    default ->
                        JOptionPane.showMessageDialog(null, "Opción inválida.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        } while (true);
    }

}
