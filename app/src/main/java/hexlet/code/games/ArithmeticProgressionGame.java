package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class ArithmeticProgressionGame {
    public static final String PROGRESSION_QUESTION = "What number is missing in the progression?";
    private static final int MAX_LENGTH_PROGRESSION = 10; //максимальная длина прогрессии
    private static final int MIN_LENGTH_PROGRESSION = 5; //минимальная длина прогрессии
    private static final int MAX_FIRST_NUMBER = 9; //генерируем первый элемент прогресии
    private static final int MAX_NUMBER_ELEMENT = 4; //макс номер позиции в ряде, который может спрашиваться у игрока
    private static final int MIN_STEP_PROGRESSION = 1; //минимальный шаг прогрессии
    private static final int MAX_STEP_PROGRESSION = 3; //максимальный шаг прогрессии

    private static int[] createProgressionNumber(int firstNumber, int stepProgression, int lengthProgression) {

        int[] progressionNumbers = new int[lengthProgression]; //матрица с 10-ю числами прогрессии
        for (int j = 0; j < lengthProgression; j++) {
            if (j == 0) {
                progressionNumbers[j] = firstNumber;
            } else {
                progressionNumbers[j] = progressionNumbers[j - 1] + stepProgression;
            }
        }
        return progressionNumbers;
    }

    private static String maskNumberAndFormatProgressionToString(int[] progressionNumbers, int numberElement, int lengthProgression) {
        var result = new StringBuilder();
        for (int i = 0; i < lengthProgression; i++) {
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
        String[][] dataGame
                = new String[Engine.COUNT_OF_QUESTIONS_BOX][Engine.COUNT_OF_ANSWER_BOX_INDEX];

        int firstNumber; //первый элемент прогрессии
        int stepProgression; //шаг арифметической прогресси
        int lengthProgression; //длина арифметической прогрессии

        for (int i = 0; i < Engine.COUNT_OF_QUESTIONS_BOX; i++) {
            //определяем ряд прогрессии
            firstNumber = RandomUtils.randomNumber(MAX_FIRST_NUMBER);
            stepProgression = RandomUtils.randomNumber(MIN_STEP_PROGRESSION, MAX_STEP_PROGRESSION);
            lengthProgression = RandomUtils.randomNumber(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);

            int[] progressionNumbers
                    = createProgressionNumber(firstNumber, stepProgression, lengthProgression);
            //определяем номер элемента в ряде, который будет спрашиваться у игрока
            int numberElement = RandomUtils.randomNumber(MAX_NUMBER_ELEMENT);
            dataGame[i][Engine.QUESTION_DATA_BOX] =
                    maskNumberAndFormatProgressionToString(progressionNumbers, numberElement, lengthProgression);
            dataGame[i][Engine.CORRECT_ANSWER_DATA_BOX]
                    = String.valueOf(progressionNumbers[numberElement]);
        }
        Engine.run(dataGame, PROGRESSION_QUESTION);
    }
}
