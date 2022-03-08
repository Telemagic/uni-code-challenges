import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    /**
     * Fibonacci sequence, in which each number is the sum of
     * the two preceding ones. The sequence commonly starts from 0 and 1
     * @param n
     * @return
     */
    public long findNthValueOfSequence(final long n) {
        final List<Long> numbs = new ArrayList<>();
        for (int i= 0; i <= n; i++){
            if (numbs.size() < 2){
                numbs.add(Long.parseLong(String.valueOf(i)));
                continue;
            }
            long numb1 = numbs.get(i-2);
            long numb2 = numbs.get(i-1);
            long numb3 = numb1 + numb2;
            numbs.add(numb3);
        }
        return numbs.get(numbs.size()-1);
    }

}
