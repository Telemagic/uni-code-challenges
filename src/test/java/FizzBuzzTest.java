import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzTest {

    final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test_run() {
        final List<String> result = fizzBuzz.run(getNumbers());

        TestHelperDontLook.fizz_buzz_validator(result, getNumbers().size());
    }

    @Test
    public void test_runAdvanced() {
        final List<String> result = fizzBuzz.runAdvanced(getNumbers());
        TestHelperDontLook.fizz_buzz_cut_validator(result, getNumbers().size());
    }


    private List<Integer> getNumbers() {
        final ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        return numbers;
    }

}
