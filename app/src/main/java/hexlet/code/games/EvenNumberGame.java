package hexlet.code.games;

import hexlet.code.RandomUtils;

import static hexlet.code.Engine.*;

public class EvenNumberGame {

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void runEven() {
        int numberFromQuestion; //число для вопроса
        int countOfAnswersBoxIndex = 2; //места для правильного и неправильного вариантов
        String[][] dataGame = new String[COUNT_OF_QUESTIONS_BOX][countOfAnswersBoxIndex];

        for (int i = 0; i < COUNT_OF_QUESTIONS_BOX; i++) {
            numberFromQuestion = RandomUtils.randomNumber();
            dataGame[i][QUESTION_DATA_BOX] = Integer.toString(numberFromQuestion);

            if (isEven(numberFromQuestion)) {
                dataGame[i][CORRECT_ANSWER_DATA_BOX] = "yes";
            } else {
                dataGame[i][CORRECT_ANSWER_DATA_BOX] = "no";
            }
        }
        run(dataGame, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
