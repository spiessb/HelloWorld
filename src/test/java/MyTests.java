import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTests {

    @Test
    public void multiplicationOfZeroIntegerShouldReturnZero() {

        ForJUnit tester = new ForJUnit();

        assertEquals("10 x 0 must be 0", 0.0, tester.multiply(10., 0.), 1.E-6);

    }

}
