package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenNumberGame;

import java.util.Scanner;

public class App {
    static final int OPTION_GREETING = 1;
    static final int OPTION_EVEN_NUMBER_GAME = 2;
    static final int OPTION_CALCULATOR_GAME = 3;

    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                Your choice:\s""");

        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        if (choose == 0) {
            return;
        }

        switch (choose) {
            case OPTION_GREETING -> Cli.greeting();
            case OPTION_EVEN_NUMBER_GAME -> EvenNumberGame.runEven();
            case OPTION_CALCULATOR_GAME -> CalculatorGame.runCalk();
            default -> {
            }
        }
    }
}
