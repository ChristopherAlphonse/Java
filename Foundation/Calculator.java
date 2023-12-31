package Foundation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter the operator: ");

        int answer = 0;

        while (true) {
            char op = userIn.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '/' || op == '%' || op == '*') {
                System.out.print("Enter two numbers: ");
                int a = userIn.nextInt();
                int b = userIn.nextInt();

                if (op == '+') {
                    answer = a + b;
                } else if (op == '-') {
                    answer = a - b;
                } else if (op == '/') {
                    if (b != 0) {
                        answer = a / b;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                } else if (op == '%') {
                    answer = a % b;
                } else {
                    answer = a * b;
                }

                System.out.println("Result: " + answer);
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Try again.");
            }
        }
    }
}
