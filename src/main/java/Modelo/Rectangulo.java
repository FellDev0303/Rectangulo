/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Rectangulo extends Figura {

    public Rectangulo(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    //construir a partir de dos puntos
    public Rectangulo(Punto p1, Punto p2) {
        this(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    //construir con primer vértice y ancho/alto
    public Rectangulo(double x1, double y1, double ancho, double alto, boolean desdeTamanio) {
        super(x1, y1, x1 + ancho, y1 + alto);
    }
     @Override
    public double calcularArea() {
        return ancho() * alto();
    }
    
    // Cambiar escala manteniendo (x1,y1) fijo
    public void cambiarEscala(double factor) {
        double dx = (x2 - x1) * factor;
        double dy = (y2 - y1) * factor;
        this.x2 = x1 + dx;
        this.y2 = y1 + dy;
    }

    //cambiar escala con factores independientes
    public void cambiarEscala(double factorX, double factorY) {
        double dx = (x2 - x1) * factorX;
        double dy = (y2 - y1) * factorY;
        this.x2 = x1 + dx;
        this.y2 = y1 + dy;
    }
        // modo: "uniforme", "horizontal", "vertical"
    public void cambiarEscala(String modo, double factor) {
        // estructura anidada
        if (modo != null) {
            if (modo.equalsIgnoreCase("uniforme")) {
                cambiarEscala(factor);
            } else {
                if (modo.equalsIgnoreCase("horizontal")) {
                    cambiarEscala(factor, 1.0);
                } else {
                    if (modo.equalsIgnoreCase("vertical")) {
                        cambiarEscala(1.0, factor);
                    } else {
                        // modo desconocido: no cambia
                    }
                }
            }
        }
    }
}
