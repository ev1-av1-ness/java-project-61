package hexlet.code;

import hexlet.code.games.ArithmeticProgressionGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenNumberGame;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.PrimeNumberGame;

import java.util.Scanner;

public class App {
    static final int OPTION_GREETING = 1;
    static final int OPTION_EVEN_NUMBER_GAME = 2;
    static final int OPTION_CALCULATOR_GAME = 3;
    static final int OPTION_GCD_GAME = 4;
    static final int OPTION_PROGRESSION_GAME = 5;
    static final int OPTION_PRIME_NUMBER_GAME = 6;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        int choose = input.nextInt();
        if (choose == 0) {
            input.close();
            return;
        }

        switch (choose) {
            case OPTION_GREETING -> {
                Cli.greeting();
                input.close();
            }
            case OPTION_EVEN_NUMBER_GAME -> {
                EvenNumberGame.runEven();
                input.close();
            }
            case OPTION_CALCULATOR_GAME -> {
                CalculatorGame.runCalk();
                input.close();
            }
            case OPTION_GCD_GAME -> {
                GreatestCommonDivisor.runGCD();
                input.close();
            }
            case OPTION_PROGRESSION_GAME -> {
                ArithmeticProgressionGame.runArithmeticProgression();
                input.close();
            }
            case OPTION_PRIME_NUMBER_GAME -> {
                PrimeNumberGame.runPrime();
                input.close();
            }

            default -> {
                System.out.print("""
                        Incorrect choice. Choose option in 1-6 range
                        """);
                main(args);
                input.close();
            }
        }
    }
}
