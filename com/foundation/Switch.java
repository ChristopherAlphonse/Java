package com.foundation;

import java.util.Scanner;
import java.util.logging.Logger;

public class Switch {

    private static final Logger logger =
            Logger.getLogger(Switch.class.getName());


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        logger.info("Enter a fruit: ");
        String userInput = scan.nextLine();

        switch (userInput.toLowerCase()) {

            case "orange" -> logger.info(
                    "Oranges signify abundance and happiness; other cultures say oranges are "
                            + "symbols of positivity");

            case "apple" -> logger.info(
                    "Although people say the apple is a symbol of destruction following the story of the "
                            + "garden.");

            case "watermelon" -> logger.info(
                    "This fruit symbolizes hope and high spirit because it has two bright colors.");

            case "pineapple" -> logger.info(
                    "Warm colors, pineapples are attached to royalty, beauty, and dare. The spikes around"
                            + " it represent a quest.");

            case "mango" -> logger.info(
                    "This fruit stands for patience, compassion, and love. It’s funny how you might not "
                            + "have" + " "
                            + "thought of it");

            default -> logger.warning(
                    "Try again. Enter a valid fruit.");
        }
    }
}
