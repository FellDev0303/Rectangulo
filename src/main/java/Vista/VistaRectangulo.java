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
    
    private void crearRectangulo() {
        String sx1 = JOptionPane.showInputDialog("Ingrese x1 (punto fijo):");
        String sy1 = JOptionPane.showInputDialog("Ingrese y1 (punto fijo):");
        String sx2 = JOptionPane.showInputDialog("Ingrese x2 (punto variable):");
        String sy2 = JOptionPane.showInputDialog("Ingrese y2 (punto variable):");
        double x1 = Double.parseDouble(sx1);
        double y1 = Double.parseDouble(sy1);
        double x2 = Double.parseDouble(sx2);
        double y2 = Double.parseDouble(sy2);
        ctrl.crearRectangulo(x1, y1, x2, y2);
        JOptionPane.showMessageDialog(null, "Rectángulo creado: " + ctrl.getRectangulo());
    }
    
    private void calcularArea() {
        double area = ctrl.calcularArea();
        JOptionPane.showMessageDialog(null, "Área del rectángulo: " + area);
    }
    
    private void cambiarEscala() {
        String modo = JOptionPane.showInputDialog("Seleccione modo de escala:\n1 = uniforme\n2 = escala XY\n3 = modo (uniforme/horizontal/vertical)");
        if (modo == null) {
            return;
        }
        switch (modo) {
            case "1" -> {
                double f = Double.parseDouble(JOptionPane.showInputDialog("Factor uniforme:"));
                ctrl.cambiarEscalaUniforme(f);
                JOptionPane.showMessageDialog(null, "Escala aplicada. Nuevo rectángulo: " + ctrl.getRectangulo());
            }
            case "2" -> {
                double fx = Double.parseDouble(JOptionPane.showInputDialog("Factor X:"));
                double fy = Double.parseDouble(JOptionPane.showInputDialog("Factor Y:"));
                ctrl.cambiarEscalaXY(fx, fy);
                JOptionPane.showMessageDialog(null, "Escala aplicada. Nuevo rectángulo: " + ctrl.getRectangulo());
            }
            case "3" -> {
                String tipo = JOptionPane.showInputDialog("Ingrese tipo (uniforme / horizontal / vertical):");
                double f = Double.parseDouble(JOptionPane.showInputDialog("Factor:"));
                ctrl.cambiarEscalaModo(tipo, f);
                JOptionPane.showMessageDialog(null, "Escala aplicada. Nuevo rectángulo: " + ctrl.getRectangulo());
            }
            default ->
                JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }

}
