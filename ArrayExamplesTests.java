import static org.junit.Assert.*;
import org.junit.*;

public class ArrayExamplesTests {
    @Test
    public void testAverageWithoutLowest() {
        //duplicate items
        double[] input1 = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(5.5, ArrayExamples.averageWithoutLowest(input1), 0.01);
    }
}