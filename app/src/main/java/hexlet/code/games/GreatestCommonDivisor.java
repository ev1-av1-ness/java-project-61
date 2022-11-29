package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GreatestCommonDivisor {
    public static final String GCD_QUESTION = "Find the greatest common divisor of given numbers.";

    private static int findGCD(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return findGCD(secondNumber, firstNumber % secondNumber);
    }

    public static void runGCD() {
        String[][] dataGame
                = new String[Engine.COUNT_OF_QUESTIONS_BOX][Engine.COUNT_OF_ANSWER_BOX_INDEX];

        int firstNumber; //первое случайное число
        int secondNumber; //второе случайное число

        for (int i = 0; i < Engine.COUNT_OF_QUESTIONS_BOX; i++) {
            firstNumber = RandomUtils.randomNumber();
            secondNumber = RandomUtils.randomNumber();
            dataGame[i][Engine.QUESTION_DATA_BOX] = firstNumber + " " + secondNumber;
            dataGame[i][Engine.CORRECT_ANSWER_DATA_BOX] =
                    String.valueOf(findGCD(firstNumber, secondNumber));
        }
        Engine.run(dataGame, GCD_QUESTION);
    }
}
