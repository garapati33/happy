import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        mathUtils = null;
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(-1, mathUtils.add(0, -1));
        assertEquals(0, mathUtils.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
        assertEquals(0, mathUtils.subtract(3, 3));
        assertEquals(-3, mathUtils.subtract(0, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
        assertEquals(0, mathUtils.multiply(0, 3));
        assertEquals(-6, mathUtils.multiply(2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), 0.0001);
        assertEquals(0.0, mathUtils.divide(0, 3), 0.0001);
        assertEquals(-2.0, mathUtils.divide(6, -3), 0.0001);
        assertEquals(-1.0, mathUtils.divide(3, 0), 0.0001); // Division by zero should return -1.0
    }
}
