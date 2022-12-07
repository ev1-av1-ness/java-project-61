package hexlet.code;

import java.util.Random;

public class RandomUtils {
    private static final int DEFAULT_MAX_RANDOM_NUMBER = 10;

    /**
     * Метод, который генерирует случайное целое число, ограниченное только максимальным значением.
     *
     * @param maxNumber max value of random number
     * @return int random
     */
    public static int randomNumber(int maxNumber) {
        return new Random().nextInt(maxNumber);
    }

    /**
     * Метод, который генерирует случайное целое число, ограниченное минимальным и максимальным значением.
     *
     * @param minNumber min value of random number
     * @param maxNumber max value of random number
     * @return int random
     */
    public static int randomNumber(int minNumber, int maxNumber) {
        return new Random().nextInt(minNumber, maxNumber);
    }

    /**
     * Метод, который генерирует в играх случайное целое число, ограниченное максимальным значением по дефолту.
     *
     * @return default max value of random number
     */
    public static int randomNumber() {
        return randomNumber(DEFAULT_MAX_RANDOM_NUMBER);
    }
}
