package io.kamlesh;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    static void beforeAllInit(){
        System.out.println("This need to run before all");
    }

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }

    @Nested
    class AddTest{

        @Test
        @DisplayName("Testing Add Positive Method")
        void testAddPositive(){
            int expected = 2;
            int actual = mathUtils.add(1,1);
            assertEquals(expected,actual, "The add method should add two numbers");
        }

        @Test
        @DisplayName("Testing Add Negative Method")
        void testAddNegative(){
            int expected = -3;
            int actual = mathUtils.add(-1,-1);
            assertEquals(expected,actual, "The add method should add two numbers");
        }
    }

    @Test
    @DisplayName("Multiply Method")
    void multiply(){
        assertAll(
                () -> assertEquals(4,mathUtils.multiply(2,2)),
                () -> assertEquals(0,mathUtils.multiply(2,0)),
                () -> assertEquals(-2,mathUtils.multiply(-2,1))
        );
    }

    @Test
    @DisplayName("Testing Divide Method")
    void testDivide(){
        boolean isServerUp = true;
        assumeTrue(isServerUp);
        assertThrows( ArithmeticException.class, ()->mathUtils.divide(1,0));
    }

    @Test
    void testcomputeCircleArea(){
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
    }

    @Test
    @DisplayName("TDD Method. Should not run")
    @Disabled
    void testDisabled(){
        fail("not yet implemented");
    }

    @AfterEach
    void cleanup(){
        System.out.println("Cleaning..");
    }
}
