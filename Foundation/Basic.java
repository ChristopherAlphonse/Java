package Foundation;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print(
                "Please input the temperature in Celsius: ");

        float tempInCelsius = userInput.nextFloat();
        float tempInFahrenheit = (1.8f * tempInCelsius) + 32;

        System.out.println(tempInFahrenheit + "°F");

        userInput.close();

    }
}
