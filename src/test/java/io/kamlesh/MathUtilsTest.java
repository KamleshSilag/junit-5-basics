package io.kamlesh;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void testAdd(){
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual, "The add method should add two numbers");
    }

    @Test
    void testDivide(){
        assertThrows( ArithmeticException.class, ()->mathUtils.divide(1,0));
    }

    @Test
    void testcomputeCircleArea(){
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
    }

    @AfterEach
    void cleanup(){
        System.out.println("Cleaning..");
    }
}
