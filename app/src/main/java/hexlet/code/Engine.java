package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_OF_QUESTIONS_BOX = 3;
    public static final int QUESTION_DATA_BOX = 0;
    public static final int CORRECT_ANSWER_DATA_BOX = 1;
    public static final int COUNT_OF_ANSWER_BOX_INDEX = 2; //места для правильного и неправильного вариантов

    public static void run(String[][] gameData, String taskDescription) {
        String userName;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner input = new Scanner(System.in);
        userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");

        int numberOfCurrentAttempt = 0;
        String userAnswer;

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
                        + gameData[numberOfCurrentAttempt][CORRECT_ANSWER_DATA_BOX]
                        + "'. Let's try again, " + userName + "!");
                input.close();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        input.close();
    }
}
