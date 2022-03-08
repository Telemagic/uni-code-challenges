import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    /**
     * Given a list of numbers return the same list
     * but for multiples of three print “Fizz” instead of the number
     * and for the multiples of five print “Buzz”. For numbers which
     * are multiples of both three and five print “FizzBuzz”.
     * @return
     */
    public List<String> run(final List<Integer> numbers) {
        List<String> newList = new ArrayList<>();

     numbers.forEach(number -> {
         if (number %3 == 0 && number %5 == 0) {
             newList.add("FizzBuzz");
         }
        else if (number %3 == 0) {
             newList.add("Fizz");
         }
        else if (number %5 == 0) {
             newList.add("Buzz");
         }
         else {
             newList.add(number.toString());
         }

     });
        return newList;
    }

    /**
     * Given a list of numbers return the same list
     * but for multiples of three print “Fizz” instead of the number,
     * for the multiples of five print “Buzz” and for the multiples of seven print "Cut".
     * For numbers which are multiples of both three, five and seven print “FizzBuzzCut”.
     * @return
     */
    public List<String> runAdvanced(final List<Integer> numbers) {
        List<String> newList = new ArrayList<>();

        numbers.forEach(number -> {
            if (number %3 == 0 && number %5 == 0 && number %7 == 0) {
                newList.add("FizzBuzzCut");
            }
            else if (number %3 == 0 && number %5 == 0) {
                newList.add("FizzBuzz");
            }
            else if (number %3 == 0 && number %7 == 0) {
                newList.add("FizzCut");
            }
            else if (number %5 == 0 && number %7 == 0) {
                newList.add("BuzzCut");
            }
            else if (number %3 == 0) {
                newList.add("Fizz");
            }
            else if (number %5 == 0) {
                newList.add("Buzz");
            }
            else if (number %7 == 0) {
                newList.add("Cut");
            }
            else {
                newList.add(number.toString());
            }

        });
        return newList;




    }

}
