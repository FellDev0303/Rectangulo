/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Control;

import Control.ControladorRectangulo;
import Modelo.Punto;
import Modelo.Rectangulo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Vero
 */
public class ControladorRectanguloTest {

    @Test
    public void testCrearYOperarRectangulo() {
        ControladorRectangulo ctrl = new ControladorRectangulo();
        ctrl.crearRectangulo(0, 0, 3, 2);

        assertTrue(ctrl.existeRectangulo());
        assertEquals(6.0, ctrl.calcularArea(), 1e-9);

        ctrl.cambiarEscalaUniforme(2.0);
        assertEquals(12.0, ctrl.calcularArea(), 1e-9);

        boolean dentro = ctrl.contienePunto(new Punto(1, 1));
        assertTrue(dentro);

        ctrl.moverHorizontal(5.0);
        Rectangulo r = ctrl.getRectangulo();
        assertEquals(5.0, r.getX1(), 1e-9);
    }

}
