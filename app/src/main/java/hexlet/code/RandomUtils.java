package hexlet.code;

import java.util.Random;

public class RandomUtils {
    /**
     *
     * @return random int number
     */
    public static int randomNumber(int maxNumber) {
        return new Random().nextInt(maxNumber);
    }

    /**
     *
     * @return random int number with default meaning
     */
    public static int randomNumber() {
        return randomNumber(10);
    }
}
