/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Punto;
import Modelo.Rectangulo;

/**
 *
 * @author LENOVO
 */
public class ControladorRectangulo {

    private Rectangulo rect;

    public ControladorRectangulo() {
        this.rect = null;
    }

    public void crearRectangulo(double x1, double y1, double x2, double y2) {
        this.rect = new Rectangulo(x1, y1, x2, y2);
    }

    public Rectangulo getRectangulo() {
        return rect;
    }
}
