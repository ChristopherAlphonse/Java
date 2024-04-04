package foundation;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Questions {
    static final Logger logger = Logger.getLogger(Questions.class.getName());
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            logger.info("Enter a number or type 'x' to exit: ");

            if (userInput.hasNextInt()) {
                int n = userInput.nextInt();
                boolean ans = isPrime(n);
                logger.log(Level.INFO, "\u001B[32m" + ans + "\u001B[0m");
            } else {

                String input = userInput.next().toLowerCase();
                if (input.equalsIgnoreCase("x")) {
                    logger.info("Exiting...");
                    break;
                } else {
                    logger.info("Invalid input. ");
                }
            }
        }
        userInput.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        double m = Math.sqrt(n);
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
