package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import static hexlet.code.Engine.*;

public class ArithmeticProgressionGame {
    private static final int MAX_LENGTH_PROGRESSION = 10; //максимальная длина прогрессии
    private static final int MAX_FIRST_NUMBER = 9; //генерируем первый элемент прогресии
    private static final int MAX_NUMBER_ELEMENT = 9; //макс номер позиции в ряде, который может спрашиваться у игрока
    private static final int MAX_STEP_PROGRESSION = 3; //максимальный шаг прогрессии

    private static int[] createProgressionNumber(int firstNumber, int stepProgression) {

        int[] progressionNumbers = new int[MAX_LENGTH_PROGRESSION]; //матрица с 10-ю числами прогрессии
        for (int j = 0; j < MAX_LENGTH_PROGRESSION; j++) {
            if (j == 0) {
                progressionNumbers[j] = firstNumber;
            } else {
                progressionNumbers[j] = progressionNumbers[j - 1] + stepProgression;
            }
        }
        return progressionNumbers;
    }

    private static String maskNumberAndFormatProgressionToString(int[] progressionNumbers, int numberElement) {
        var result = new StringBuilder();
        for (int i = 0; i < MAX_LENGTH_PROGRESSION; i++) {
            if (i == numberElement) {
                result.append(".. ");
            } else {
                result.append(progressionNumbers[i]);
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void runArithmeticProgression() {

        String[][] dataGame = new String[Engine.COUNT_OF_QUESTIONS_BOX][2];

        int firstNumber; //первый элемент прогрессии
        int stepProgression; //шаг арифметической прогресси

        for (int i = 0; i < Engine.COUNT_OF_QUESTIONS_BOX; i++) {
            //определяем ряд прогресси
            firstNumber = RandomUtils.randomNumber(MAX_FIRST_NUMBER);
            stepProgression = RandomUtils.randomNumber(MAX_STEP_PROGRESSION);
            if (stepProgression == 0) {
                stepProgression = stepProgression + 1; //прибавляем 1, чтобы шаг не мог равняться нулю
            }

            int[] progressionNumbers = createProgressionNumber(firstNumber, stepProgression);
            //определяем номер элемента в ряде, который будет спрашиваться у игрока
            int numberElement = RandomUtils.randomNumber(MAX_NUMBER_ELEMENT);
            dataGame[i][QUESTION_DATA_BOX] =
                    maskNumberAndFormatProgressionToString(progressionNumbers, numberElement);
            dataGame[i][CORRECT_ANSWER_DATA_BOX] = String.valueOf(progressionNumbers[numberElement]);
        }
        run(dataGame, "What number is missing in the progression?");
    }
}
