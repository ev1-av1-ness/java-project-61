package hexlet.code;

import java.util.Random;

import static java.lang.Integer.MAX_VALUE;

public class RandomUtils {
    /**
     *
     * @return random int number
     */
    public static int randomNumber() {
        return new Random().nextInt(10000);
    }
}
