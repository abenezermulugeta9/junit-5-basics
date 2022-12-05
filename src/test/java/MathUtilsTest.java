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

    // This lifecycle hook method needs to be static
    @AfterAll
    static void cleanUp() {
        System.out.println("Cleaning up....");
    }

    @Nested
    class AddTest {
        @Test
        @DisplayName("Testing add method with positive numbers") // a display name on the test console
        void testAddPositive() {
            int expectedResult = 3;
            int actualResult = mathUtils.add(1, 2);
            assertEquals(expectedResult, actualResult, "The add() method should return the addition of the two arguments.");
        }

        @Test
        @DisplayName("Testing add method with negative numbers")
        void testAddNegative() {
            int expected = -2;
            int actualResult = mathUtils.add(-1, -1);
            assertEquals(expected, actualResult, "The add() method should return the addition of the two arguments.");
        }
    }



    @Test
    @DisplayName("Testing multiply method with multiple assertions")
    void testMultiply() {
        // tests the method with multiple assertions
        assertAll(
                () -> assertEquals(4, mathUtils.multiply(2, 2), "The multipy() method should return the product of the two arguments."),
                () -> assertEquals(6, mathUtils.multiply(3, 2), "The multipy() method should return the product of the two arguments."),
                () -> assertEquals(8, mathUtils.multiply(4, 2), "The multipy() method should return the product of the two arguments.")
        );
    }

    @Test
    @DisplayName("Testing divide exception method") // a display name on the test console
    @Disabled // won't run failing tests because they avoid the application to run
    void testDivideException() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(2, 1), "Division by 0 should return ArithmeticException.");
    }

    @Test
    @DisplayName("Testing computeCircleArea method") // a display name on the test console
    void testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "The computeCircleArea() method should calculate and return the right area.");
    }
}
