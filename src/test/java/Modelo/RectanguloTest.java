/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class RectanguloTest {

    @Test
    public void testCalcularArea() {
        Rectangulo r = new Rectangulo(0, 0, 4, 3);
        assertEquals(12.0, r.calcularArea(), 1e-9);
    }

    @Test
    public void testContienePunto() {
        Rectangulo r = new Rectangulo(1, 1, 4, 4);
        assertTrue(r.contienePunto(2, 2));
        assertTrue(r.contienePunto(1, 1)); // borde incluido
        assertFalse(r.contienePunto(0.9, 2));
    }

    @Test
    public void testCambiarEscalaUniforme() {
        Rectangulo r = new Rectangulo(0, 0, 2, 1);
        r.cambiarEscala(2.0); // ancho 2->4, alto 1->2
        assertEquals(4.0, r.ancho(), 1e-9);
        assertEquals(2.0, r.alto(), 1e-9);
    }

    @Test
    public void testCambiarEscalaModoAnidado() {
        Rectangulo r = new Rectangulo(0, 0, 2, 1);
        r.cambiarEscala("horizontal", 3.0);
        assertEquals(6.0, r.ancho(), 1e-9);
        assertEquals(1.0, r.alto(), 1e-9);
    }

    @Test
    public void testMoverHorizontalVerticalAndException() {
        Rectangulo r = new Rectangulo(0, 0, 2, 1);
        r.moverHorizontal(3.0);
        assertEquals(3.0, r.getX1(), 1e-9);
        assertEquals(5.0, r.getX2(), 1e-9);

        r.moverVertical(-2.0);
        assertEquals(-2.0, r.getY1(), 1e-9);
        assertEquals(-1.0, r.getY2(), 1e-9);

        // mover con ambos dx y dy debe lanzar excepción
        assertThrows(IllegalArgumentException.class, () -> r.mover(1.0, 1.0));
    }

}
