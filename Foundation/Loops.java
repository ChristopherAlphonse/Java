package Foundation;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String out = userInput.nextLine();

        System.out.print("Hello, " + out);


        userInput.close();
    }
}
