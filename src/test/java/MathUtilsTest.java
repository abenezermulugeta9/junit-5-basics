import io.abenezermulugeta.MathUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    MathUtils mathUtils;

    // Lifecycle hooks
    /*
    * These two methods need to be static methods, because they have to be executed after the test class is constructed
    * @BeforeAll
    * @AfterAll
    *
     * @BeforeEach
    * @AfterEach
    * */
    @BeforeEach
    void init() {
        this.mathUtils = new MathUtils();
    }

    @AfterAll
    static void cleanUp() {
        System.out.println("Cleaning up....");
    }

    @Test
    void testAdd() {
        int expectedResult = 3;
        int actualResult = mathUtils.add(1, 2);
        assertEquals(expectedResult, actualResult, "The add() method should return the addition of the two arguments.");
    }

    @Test
    void testDivideException() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(2, 1), "Division by 0 should return ArithmeticException.");
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "The computeCircleArea() method should calculate and return the right area.");
    }
}
