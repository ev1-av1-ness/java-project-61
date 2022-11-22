package hexlet.code;

import java.util.Random;

public class RandomUtils {
    /**
     *
     * @return random int number
     */
    public static int randomNumber() {
        return new Random().nextInt(10);
    }
}
