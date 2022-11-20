package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_OF_QUESTIONS_BOX = 3;
    public static final int QUESTION_DATA_BOX = 0;
    public static final int CORRECT_ANSWER_DATA_BOX = 1;

    public static void run(String[][] gameData, String taskDescription) {
        String userName = Cli.greeting();

        int numberOfCurrentAttempt = 0;
        String userAnswer;

        Scanner input = new Scanner(System.in);
        System.out.println(taskDescription);
        while (numberOfCurrentAttempt < COUNT_OF_QUESTIONS_BOX) {
            System.out.print("Question: " + gameData[numberOfCurrentAttempt][QUESTION_DATA_BOX]);

            System.out.print("\nYour answer: ");
            userAnswer = input.nextLine();
            if (userAnswer.equals(gameData[numberOfCurrentAttempt][CORRECT_ANSWER_DATA_BOX])) {
                System.out.println("Correct!");
                numberOfCurrentAttempt++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + gameData[numberOfCurrentAttempt][CORRECT_ANSWER_DATA_BOX] + "'. Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
