package ru.novikov.practika.two.first;

public class Factorial {
    /**
     * @param a can't have negative value.
     * @return if a is negative - -1
     * else factorial. Also, 0! = 1
     */
    public static long of(int a) {
        if (a < 0) return 0;

        long result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
