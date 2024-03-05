package foundation;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Basic {
    private static final Logger logger = Logger.getLogger(Basic.class.getName());

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        logger.info("Please input the temperature in Celsius: ");

        float tempInCelsius = userInput.nextFloat();
        float tempInFahrenheit = (1.8f * tempInCelsius) + 32;

        logger.log(Level.INFO, () -> tempInFahrenheit + "°F");

        userInput.close();

    }
}
