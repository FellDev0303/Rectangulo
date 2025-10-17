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
        // Determina si un punto está dentro del rectángulo (incluye borde)
    public boolean contienePunto(double x, double y) {
        double minX = Math.min(x1, x2), maxX = Math.max(x1, x2);
        double minY = Math.min(y1, y2), maxY = Math.max(y1, y2);
        return (x >= minX && x <= maxX) && (y >= minY && y <= maxY);
    }

    //acepta un objeto Punto
    public boolean contienePunto(Punto p) {
        return contienePunto(p.getX(), p.getY());
    }
    
    // Mover horizontalmente (solo dx)
    public void moverHorizontal(double dx) {
        this.x1 += dx;
        this.x2 += dx;
    }

    // Mover verticalmente (solo dy)
    public void moverVertical(double dy) {
        this.y1 += dy;
        this.y2 += dy;
    }


}
