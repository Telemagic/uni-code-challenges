import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    final Fibonacci fibonacci = new Fibonacci();

    @Test
    public void test_n_0() {
        assertEquals(0, fibonacci.findNthValueOfSequence(0));
    }

    @Test
    public void test_n_1() {
        assertEquals(1, fibonacci.findNthValueOfSequence(1));

    }

    @Test
    public void test_n_8() {
        assertEquals(21, fibonacci.findNthValueOfSequence(8));

    }

    @Test
    public void test_n_25() {
        assertEquals(75025L, fibonacci.findNthValueOfSequence(25));

    }

    @Test
    public void test_n_50() {
        assertEquals(12586269025L, fibonacci.findNthValueOfSequence(50));
    }
}
