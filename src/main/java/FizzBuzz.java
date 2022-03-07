import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    /**
     * Give a list of numbers return the same list
     * but for multiples of three print “Fizz” instead of the number
     * and for the multiples of five print “Buzz”. For numbers which
     * are multiples of both three and five print “FizzBuzz”.
     * @return
     */
    public List<String> run(final List<Integer> numbers) {
        final List<String> strings = new ArrayList<>();

        for (final Integer number : numbers) {
            boolean fizz = false;
            boolean buzz = false;

            String resultString = "";

            if (number % 3 == 0) {
                resultString = resultString + "Fizz";
                fizz = true;
            }

            if (number % 5 == 0) {
                resultString = resultString + "Buzz";
                buzz = true;
            }

            if (!fizz && !buzz) {
                resultString = "" + number;
            }

            System.out.println(resultString);
            strings.add(resultString);
        }

        return strings;
    }

    /**
     * Give a list of numbers return the same list
     * but for multiples of three print “Fizz” instead of the number,
     * for the multiples of five print “Buzz” and for the multiples of seven print "Cut".
     * For numbers which are multiples of both three, five and seven print “FizzBuzzCut”.
     * @return
     */
    public List<String> runAdvanced(final List<Integer> numbers) {
        final List<String> strings = new ArrayList<>();

        for (final Integer number : numbers) {
            boolean fizz = false;
            boolean buzz = false;
            boolean cut = false;

            String resultString = "";

            if (number % 3 == 0) {
                resultString = resultString + "Fizz";
                fizz = true;
            }

            if (number % 5 == 0) {
                resultString = resultString + "Buzz";
                buzz = true;
            }

            if (number % 7 == 0) {
                resultString = resultString + "Cut";
                cut = true;
            }

            if (!fizz && !buzz && !cut) {
                resultString = "" + number;
            }

            System.out.println(resultString);
            strings.add(resultString);
        }

        return strings;
    }

}
