package com.algorithm;

import java.util.Scanner;
import java.util.logging.Logger;

public class IsArmstrong {

    static final Logger logger = Logger.getLogger(IsArmstrong.class.getName());

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        logger.info("Enter a number: ");

        int number = in.nextInt();
        int originalNumber;
        int remainder;
        int result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += (int) Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number) {
            logger.info("is ArmStrong: %s ");
        } else {
            logger.info("is not ArmStrong: %s");
        }

        in.close();
    }
}
