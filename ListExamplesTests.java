import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

class LongStringChecker implements StringChecker {
    private int length;
    public LongStringChecker(int length) {
        this.length = length;
    }
    public boolean checkString(String s) {
        return s.length() > this.length;
    }
}

public class ListExamplesTests {
    @Test
    public void testFilter() {
        List<String> input = new ArrayList<>();
        input.add("a");
        input.add("ab");
        input.add("abc");
        input.add("abcd");
        input.add("abcde");
        input.add("abcdef");
        input.add("abcdefg");
        input.add("abcdefgh");
        input.add("abcdefghi");
        input.add("abcdefghij");
        input.add("abcdefghijk");
        input.add("abcdefghijkl");
        input.add("abcdefghijklm");
        input.add("abcdefghijklmn");
        input.add("abcdefghijklmno");
        input.add("abcdefghijklmnop");
        input.add("abcdefghijklmnopq");
        input.add("abcdefghijklmnopqr");
        input.add("abcdefghijklmnopqrs");
        input.add("abcdefghijklmnopqrst");
        input.add("abcdefghijklmnopqrstu");
        input.add("abcdefghijklmnopqrstuv");
        input.add("abcdefghijklmnopqrstuvw");
        input.add("abcdefghijklmnopqrstuvwx");
        input.add("abcdefghijklmnopqrstuvwxy");
        input.add("abcdefghijklmnopqrstuvwxyz");
        List<String> result = ListExamples.filter(input, new LongStringChecker(5));
        assertEquals(21, result.size());
        for (int i = 0; i < 21; i++) {
            String checkAgainst = "abcdef";
            char toAdd = 'g';
            for (int j = 0; j < i; j++) {
                checkAgainst += toAdd;
                toAdd++;
            }
            assertEquals(checkAgainst, result.get(i));
        }

        /*
         * Array input will be:
         "a" -> "ab" -> "abc" -> "abcd" -> "abcde" -> "abcdef" -> "abcdefg" -> "abcdefgh" -> "abcdefghi" -> "abcdefghij" -> "abcdefghijk" -> "abcdefghijkl" -> "abcdefghijklm" -> "abcdefghijklmn" -> "abcdefghijklmno" -> "abcdefghijklmnop" -> "abcdefghijklmnopq" -> "abcdefghijklmnopqr" -> "abcdefghijklmnopqrs" -> "abcdefghijklmnopqrst" -> "abcdefghijklmnopqrstu" -> "abcdefghijklmnopqrstuv" -> "abcdefghijklmnopqrstuvw" -> "abcdefghijklmnopqrstuvwx" -> "abcdefghijklmnopqrstuvwxy" -> "abcdefghijklmnopqrstuvwxyz"
         */
    }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("c");
        input1.add("e");
        input1.add("g");
        input1.add("i");
        List<String> input2 = new ArrayList<>();
        input2.add("b");
        input2.add("d");
        input2.add("f");
        input2.add("h");
        input2.add("j");
        List<String> result = ListExamples.merge(input1, input2);
        assertEquals(10, result.size());
        for (int i = 0; i < 10; i++) {
            assertEquals((char)('a' + i), result.get(i).charAt(0));
        }
    }
}