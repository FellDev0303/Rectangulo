/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public abstract class Figura {

    protected double x1, y1; // vértice fijo
    protected double x2, y2; // vértice variable

    public Figura(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public double ancho() {
        return Math.abs(x2 - x1);
    }

    public double alto() {
        return Math.abs(y2 - y1);
    }

    public abstract double calcularArea();

    public void mover(double dx, double dy) {
        this.x1 += dx;
        this.x2 += dx;
        this.y1 += dy;
        this.y2 += dy;
    }

    @Override
    public String toString() {
        return "Vértice1=(" + x1 + "," + y1 + "), Vértice2=(" + x2 + "," + y2 + ")";
    }


}
