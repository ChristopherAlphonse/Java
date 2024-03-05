package misc;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fib {

    private static final Logger logger = Logger.getLogger(Fib.class.getName());

    public static long fib(long n) {
        if (n <= 1) {
            return n;
        }
        long low = 0;
        long high = 1;

        for (long i = 2; i <= n; i++) {
            long next = low + high;
            low = high;
            high = next;
        }
        return high;

    }

    public static void main(String[] args) {

        logger.log(Level.INFO, " {0} ", fib(800000000));
        // 9,062,594,501,314,731,461
    }
}
