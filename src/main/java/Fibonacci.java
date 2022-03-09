public class Fibonacci {

    /**
     * Fibonacci sequence, in which each number is the sum of
     * the two preceding ones. The sequence commonly starts from 0 and 1
     * @param n
     * @return
     */
    public long findNthValueOfSequence(final long n) {
        // Return the sum of the two preceding numbers
        long val;
        long val2 = 0;
        if (n == 0) {
            val = 0;
        }
        else if (n == 1) {
            val = 1;
        }
        else {
            val = findNthValueOfSequence(n-2);
            val2 = findNthValueOfSequence(n-1);
        }
        return val+val2;
    }

}
