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

    public boolean existeRectangulo() {
        return rect != null;
    }

    public double calcularArea() {
        validarRect();
        return rect.calcularArea();
    }

    public void cambiarEscalaUniforme(double factor) {
        validarRect();
        rect.cambiarEscala(factor);
    }

    public void cambiarEscalaXY(double fx, double fy) {
        validarRect();
        rect.cambiarEscala(fx, fy);
    }

    public void cambiarEscalaModo(String modo, double factor) {
        validarRect();
        rect.cambiarEscala(modo, factor);
    }

    public boolean contienePunto(double x, double y) {
        validarRect();
        return rect.contienePunto(x, y);
    }

    public boolean contienePunto(Punto p) {
        validarRect();
        return rect.contienePunto(p);
    }

    public void moverHorizontal(double dx) {
        validarRect();
        rect.moverHorizontal(dx);
    }

    public void moverVertical(double dy) {
        validarRect();
        rect.moverVertical(dy);
    }

    public void mover(double dx, double dy) {
        validarRect();
        rect.mover(dx, dy);
    }

    private void validarRect() {
        if (rect == null) {
            throw new IllegalStateException("No hay rectángulo creado.");
        }
    }
}
