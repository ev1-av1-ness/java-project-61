package hexlet.code;

import java.util.Random;

public class RandomUtils {
    private static final int DEFAULT_MAX_RANDOM_NUMBER = 10;

    /**
     *
     * @param maxNumber max value of random number
     * @return int random
     */
    public static int randomNumber(int maxNumber) {
        return new Random().nextInt(maxNumber);
    }

    /**
     *
     * @param minNumber min value of random number
     * @param maxNumber max value of random number
     * @return int random
     */
    public static int randomNumber(int minNumber, int maxNumber) {
        return new Random().nextInt(minNumber, maxNumber);
    }

    /**
     *
     * @return default max value of random number
     */
    public static int randomNumber() {
        return randomNumber(DEFAULT_MAX_RANDOM_NUMBER);
    }
}
