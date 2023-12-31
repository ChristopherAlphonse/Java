package Foundation;

import java.util.Scanner;

public class CaseCheck {


    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        System.out.print("enter:");
        char character = userIn.next().trim().charAt(0);
        // trim = remove white spaces if any, charAt(0) = same as [0]


        if (character >= 'a' && character <= 'z') {
            System.out.print(" Lowercase ");
        } else {
            System.out.print(" Uppercase ");
        }

        System.out.print("character is: " + character);
        userIn.close();
    }

}

