package com.misc;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dbj2Hash {

    private static final Logger logger =
            Logger.getLogger(Dbj2Hash.class.getName());

    public static long dbj2Hash(String input) {
        long hash = 5381;
        for (char c : input.toCharArray()) {
            hash = hash * 33 + c;
        }
        return hash;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.log(Level.INFO, "Enter the string to hash: ");
        String input = scanner.next();
        scanner.close();

        long hash = dbj2Hash(input);
        logger.log(Level.INFO, " {0} ", hash);

        /**
         * Enter the string to hash: chris. INFO: 210,708,821,086
         */

    }
}
