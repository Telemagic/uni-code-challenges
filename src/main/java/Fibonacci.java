public class Fibonacci {

    /**
     * Fibonacci sequence, in which each number is the sum of
     * the two preceding ones. The sequence commonly starts from 0 and 1
     * @param n
     * @return
     */
    public long findNthValueOfSequence(final long n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        long previous1 = 0;
        long previous2 = 1;

        long next = 0;

        for (long i = 0; i < n - 1; i++) {
            next = previous1 + previous2;
            previous1 = previous2;
            previous2 = next;
        }

        return next;
    }

}
