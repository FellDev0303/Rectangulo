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
   
}
