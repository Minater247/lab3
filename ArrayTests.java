import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
    @Test
    public void testReverseInPlace() {
        int[] input1 = { 1, 2, 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[] { 3, 2, 1 }, input1);

        int[] input2 = {};
        ArrayExamples.reverseInPlace(input2);
        assertArrayEquals(new int[] {}, input2);

        int[] input3 = new int[100];
        for (int i = 0; i < 100; i += 1) {
            input3[i] = i;
        }
        ArrayExamples.reverseInPlace(input3);
        for (int i = 0; i < 100; i += 1) {
            assertEquals(99 - i, input3[i]);
        }

        try {
            ArrayExamples.reverseInPlace(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // This is expected
        }
    }

    @Test
    public void testReversed() {
        int[] input1 = { 1, 2, 3 };
        assertArrayEquals(new int[] { 3, 2, 1 }, ArrayExamples.reversed(input1));

        int[] input2 = {};
        assertArrayEquals(new int[] {}, ArrayExamples.reversed(input2));

        int[] input3 = new int[100];
        for (int i = 0; i < 100; i += 1) {
            input3[i] = i;
        }
        int[] result3 = ArrayExamples.reversed(input3);
        for (int i = 0; i < 100; i += 1) {
            assertEquals(99 - i, result3[i]);
        }

        try {
            result3 = ArrayExamples.reversed(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // This is expected
        }
    }
}
