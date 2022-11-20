package hexlet.code.games;

import hexlet.code.RandomUtils;

import static hexlet.code.Engine.*;

public class EvenNumberGame {

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void runEven() {
        int oneNumber;
        int countOfAnswersBoxIndex = 2; //правильный и неправильный
        String[][] dataGame = new String[COUNT_OF_QUESTIONS_BOX][countOfAnswersBoxIndex];

        for (int i = 0; i < COUNT_OF_QUESTIONS_BOX; i++) {
            oneNumber = RandomUtils.randomNumber();
            dataGame[i][QUESTION_DATA_BOX] = Integer.toString(oneNumber);

            if (isEven(oneNumber)) {
                dataGame[i][CORRECT_ANSWER_DATA_BOX] = "yes";
            } else {
                dataGame[i][CORRECT_ANSWER_DATA_BOX] = "no";
            }
        }
        run(dataGame, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
