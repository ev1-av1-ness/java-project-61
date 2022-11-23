package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;
import java.util.Random;

public class CalculatorGame {
    private static final String[] OPERATOR_SIGNS = new String[]{"*", "+", "-"};

    private static int calculateExpression(int numberA, int numberB, String operationSign) {
        switch (operationSign) {
            case "*" -> {
                return numberA * numberB;
            }
            case "+" -> {
                return numberA + numberB;
            }
            case "-" -> {
                return numberA - numberB;
            }
            default -> throw new UnsupportedOperationException("This operation is not available!");
        }
    }

    public static void runCalk() {
        String[][] dataGame
                = new String[Engine.COUNT_OF_QUESTIONS_BOX][Engine.COUNT_OF_ANSWER_BOX_INDEX];

        String operationSign; //знак операции
        int firstNumber; //первое случайное число
        int secondNumber; //второе случайное число

        for (int i = 0; i < Engine.COUNT_OF_QUESTIONS_BOX; i++) {
            firstNumber = RandomUtils.randomNumber();
            secondNumber = RandomUtils.randomNumber();
            operationSign = OPERATOR_SIGNS[new Random().nextInt(OPERATOR_SIGNS.length)];
            //любой из знаков операций

            dataGame[i][Engine.QUESTION_DATA_BOX]
                    = firstNumber + " " + operationSign + " " + secondNumber;
            dataGame[i][Engine.CORRECT_ANSWER_DATA_BOX] =
                    String.valueOf(calculateExpression(firstNumber, secondNumber, operationSign));
        }
        Engine.run(dataGame, "What is the result of the expression?");
    }
}
