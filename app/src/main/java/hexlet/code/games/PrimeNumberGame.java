package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class PrimeNumberGame {
    public static final String PRIME_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM_PRIME = 100;
    private static final int MIN_RANDOM_PRIME = 2;

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            //бежим по циклу начиная от 2 и до самого числа не включительно
            if (number % i == 0) {
                return false;  //вернуть false, переданное число простым не является
            }
        }
        return true;  //вернуть true, переданное число простое
    }

    public static void runPrime() {
        String[][] dataGame
                = new String[Engine.COUNT_OF_QUESTIONS_BOX][Engine.COUNT_OF_ANSWER_BOX_INDEX];
        int numberFromQuestion; //число для вопроса

        for (int i = 0; i < Engine.COUNT_OF_QUESTIONS_BOX; i++) {
            numberFromQuestion = RandomUtils.randomNumber(MIN_RANDOM_PRIME, MAX_RANDOM_PRIME);
            dataGame[i][Engine.QUESTION_DATA_BOX] = String.valueOf(numberFromQuestion);

            if (isPrimeNumber(numberFromQuestion)) {
                dataGame[i][Engine.CORRECT_ANSWER_DATA_BOX] = "yes";
            } else {
                dataGame[i][Engine.CORRECT_ANSWER_DATA_BOX] = "no";
            }
        }
        Engine.run(dataGame, PRIME_QUESTION);
    }
}
