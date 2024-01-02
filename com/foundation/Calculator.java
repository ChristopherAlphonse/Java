package com.foundation;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {

    private static final Logger logger =
            Logger.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        while (true) {
            char op = getOperator(userIn);

            if (op == 'x' || op == 'X')
                break;

            performOperation(op, userIn);
        }

        userIn.close();
    }

    private static char getOperator(Scanner userIn) {
        logger.info("Enter the operator: ");
        return userIn.next().trim().charAt(0);
    }

    private static void performOperation(char op, Scanner userIn) {
        if (isValidOperator(op)) {
            logger.info("Enter two numbers: ");
            int a = userIn.nextInt();
            int b = userIn.nextInt();

            int answer = calculate(op, a, b);
            logger.info(() -> "Result: " + answer);

        } else {
            logger.warning("Invalid operator. Try again.");
        }
    }

    private static boolean isValidOperator(char op) {
        return op == '+' || op == '-' || op == '/' || op == '%' || op == '*';
    }

    private static int calculate(char op, int a, int b) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '/' -> (b != 0) ? a / b : handleDivisionByZero();
            case '%' -> a % b;
            case '*' -> a * b;
            default -> 0;
        };
    }

    private static int handleDivisionByZero() {
        logger.warning("Cannot divide by zero.");
        return 0;
    }
}
