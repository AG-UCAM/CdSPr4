package edu.ucam.CdSPrFinal;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    private Campeon c1;
    private Campeon c2;

    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // Initialize Campeon objects before each test
        String nombre = null;
        c1 = new Campeon(nombre, "t1", 3000, 400, 200);
		c2 = new Campeon("c2", "t2", 2500, 500, 250);
    }

    /**
     * Test if Campeon objects are initialized correctly.
     */
    public void testCampeonInitialization() {
        assertNotNull("El nombre no puede estar vacio", c1.getNombre());
        assertNotNull("La vida no puede estar vacía", c1.getPuntos_vida());

        assertNotNull("El daño no puede estar vacío", c2.getDano_ataque());
        assertNotNull("La defensa no debe estar vacía", c2.getDefensa());
    }
}
