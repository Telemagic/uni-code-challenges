public class Fibonacci {

    /**
     * Fibonacci sequence, in which each number is the sum of
     * the two preceding ones. The sequence commonly starts from 0 and 1
     * @param n
     * @return
     */
    public long findNthValueOfSequence(final long n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return (findNthValueOfSequence(n-2)+findNthValueOfSequence(n-1));
    }

}
