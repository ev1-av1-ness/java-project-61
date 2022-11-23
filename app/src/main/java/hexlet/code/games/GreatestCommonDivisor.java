package hexlet.code.games;

import hexlet.code.RandomUtils;

import static hexlet.code.Engine.*;

public class GreatestCommonDivisor {
    private static int findGCD(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return findGCD(secondNumber, firstNumber % secondNumber);
    }

    public static void runGCD() {
        String[][] dataGame = new String[COUNT_OF_QUESTIONS_BOX][COUNT_OF_ANSWER_BOX_INDEX];

        int firstNumber; //первое случайное число
        int secondNumber; //второе случайное число

        for (int i = 0; i < COUNT_OF_QUESTIONS_BOX; i++) {
            firstNumber = RandomUtils.randomNumber();
            secondNumber = RandomUtils.randomNumber();
            dataGame[i][QUESTION_DATA_BOX] = firstNumber + " " + secondNumber;
            dataGame[i][CORRECT_ANSWER_DATA_BOX] =
                    String.valueOf(findGCD(firstNumber, secondNumber));
        }
        run(dataGame, "Find the greatest common divisor of given numbers.");
    }
}