package hexlet.code.games;

import hexlet.code.RandomUtils;

import java.math.BigInteger;

import static hexlet.code.Engine.*;

public class PrimeNumberGame {
    private static final int MAX_RANDOM_PRIME = 100;

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++)  //бежим по циклу начиная от 2 и до самого числа не включительно
        {
            if (number % i == 0)  //если остаток от деления числа на значение шага цикла равен нулю, то
            {
                return false;  //вернуть false, переданное число простым не является
            }
        }
        //если же ни одного значения, удоволетворяющего условию выше, не было найдено, то
        return true;  //вернуть true, переданное число простое
    }

    public static void runPrime() {
        String[][] dataGame = new String[COUNT_OF_QUESTIONS_BOX][COUNT_OF_ANSWER_BOX_INDEX];
        int numberFromQuestion; //число для вопроса

        for (int i = 0; i < COUNT_OF_QUESTIONS_BOX; i++) {
            numberFromQuestion = RandomUtils.randomNumber(MAX_RANDOM_PRIME);
            if (numberFromQuestion == 0) numberFromQuestion = numberFromQuestion + 1; //не должно быть равно нулю
            dataGame[i][QUESTION_DATA_BOX] = String.valueOf(numberFromQuestion);

            if (isPrimeNumber(numberFromQuestion)) {
                dataGame[i][CORRECT_ANSWER_DATA_BOX] = "yes";
            } else {
                dataGame[i][CORRECT_ANSWER_DATA_BOX] = "no";
            }
        }

        run(dataGame, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
