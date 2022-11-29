package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class EvenNumberGame {
    public static final String EVEN_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void runEven() {
        String[][] dataGame
                = new String[Engine.COUNT_OF_QUESTIONS_BOX][Engine.COUNT_OF_ANSWER_BOX_INDEX];

        int numberFromQuestion; //число для вопроса

        for (int i = 0; i < Engine.COUNT_OF_QUESTIONS_BOX; i++) {
            numberFromQuestion = RandomUtils.randomNumber();
            dataGame[i][Engine.QUESTION_DATA_BOX] = Integer.toString(numberFromQuestion);

            if (isEven(numberFromQuestion)) {
                dataGame[i][Engine.CORRECT_ANSWER_DATA_BOX] = "yes";
            } else {
                dataGame[i][Engine.CORRECT_ANSWER_DATA_BOX] = "no";
            }
        }
        Engine.run(dataGame, EVEN_QUESTION);
    }
}
