package datos;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConjuntoTest {

    @Test
    public void ConjuntoTest() {
        Conjunto c1 = new Conjunto();
        Conjunto c2 = new Conjunto();
        Conjunto c3 = new Conjunto();
        c3.insertar(1);
        Conjunto c4 = new Conjunto();
        c4.insertar(1);
        Conjunto c5 = new Conjunto();
        c5.insertar(2);
        Conjunto c6 = new Conjunto();
        c6.insertar(1);
        c6.insertar(2);
        Conjunto c7 = new Conjunto();
        c7.insertar(1);
        c7.insertar(3);

        assertFalse(c1.insertar(c2));
        assertTrue(c1.insertar(c3));
        assertFalse(c3.insertar(c4));
        assertTrue(c3.insertar(c5));
        assertFalse(c3.insertar(c4));
        assertFalse(c6.insertar(c5));
        assertTrue(c6.insertar(c7));
    }

    @Test
    public void ConjuntoEliminarSimple() {

        Conjunto conjunto1 = new Conjunto();

        conjunto1.insertar(6);
        conjunto1.insertar(7);
        conjunto1.insertar(9);

        assertFalse(conjunto1.eliminar(8));
        assertTrue(conjunto1.eliminar(7));
        assertFalse(conjunto1.eliminar(7));
    }

    @Test
    public void ConjuntoDelConjunto() {

        Conjunto conjunto1 = new Conjunto();
        Conjunto conjunto2 = new Conjunto();
        Conjunto conjunto3 = new Conjunto();
        Conjunto conjunto4 = new Conjunto();
        Conjunto conjunto5 = new Conjunto();
        Conjunto conjunto6 = new Conjunto();

        conjunto1.insertar(6);
        conjunto1.insertar(7);
        conjunto1.insertar(9);
        conjunto1.insertar(10);

        conjunto2.insertar(8);

        conjunto3.insertar(8);
        conjunto3.insertar(5);

        conjunto4.insertar(8);
        conjunto4.insertar(5);
        conjunto4.insertar(7);

        conjunto6.insertar(8);
        conjunto6.insertar(5);
        conjunto6.insertar(7);
        conjunto6.insertar(6);

        assertFalse(conjunto1.eliminar(conjunto5));
        assertFalse(conjunto1.eliminar(conjunto2));
        assertFalse(conjunto1.eliminar(conjunto3));
        assertTrue(conjunto1.eliminar(conjunto4));
        assertTrue(conjunto1.eliminar(conjunto6));
        assertFalse(conjunto5.eliminar(conjunto4));

    }

}
