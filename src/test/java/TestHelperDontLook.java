import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestHelperDontLook {

    public static void fizz_buzz_validator(final List<String> list, final int expectedSize) {
        assertEquals("List does not match expected size", expectedSize, list.size());

        int position = 1;
        for (String s : list) {
            if (position % 3 == 0 && position % 5 == 0) {
                assertEquals("Expected position " + position + " to be:", "FizzBuzz", s);
                continue;
            }

            if (position % 3 == 0) {
                assertEquals("Expected position " + position + " to be:", "Fizz", s);
                continue;
            }

            if (position % 5 == 0) {
                assertEquals("Expected position " + position + " to be:", "Buzz", s);
                continue;
            }

            assertEquals("Expected position " + position + " to be:", position, Integer.parseInt(s));

            position++;
        }
    }

    public static void fizz_buzz_cut_validator(final List<String> list, final int expectedSize) {
        assertEquals("List does not match expected size", expectedSize, list.size());

        int position = 1;
        for (String s : list) {
            if (position % 3 == 0 && position % 5 == 0 && position % 7 == 0) {
                assertEquals("Expected position " + position + " to be:", "FizzBuzzCut", s);
                continue;
            }

            if (position % 3 == 0 && position % 5 == 0) {
                assertEquals("Expected position " + position + " to be:", "FizzBuzz", s);
                continue;
            }

            if (position % 5 == 0 && position % 7 == 0) {
                assertEquals("Expected position " + position + " to be:", "BuzzCut", s);
                continue;
            }

            if (position % 3 == 0 && position % 7 == 0) {
                assertEquals("Expected position " + position + " to be:", "FizzBuzzCut", s);
                continue;
            }

            if (position % 3 == 0) {
                assertEquals("Expected position " + position + " to be:", "Fizz", s);
                continue;
            }

            if (position % 5 == 0) {
                assertEquals("Expected position " + position + " to be:", "Buzz", s);
                continue;
            }

            if (position % 7 == 0) {
                assertEquals("Expected position " + position + " to be:", "Cut", s);
                continue;
            }

            assertEquals("Expected position " + position + " to be:", position, Integer.parseInt(s));

            position++;
        }
    }
}
