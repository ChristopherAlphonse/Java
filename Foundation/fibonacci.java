package Foundation;

/*
 * 
 * 
 * first discovered in India, then Rome (phi), then popularized by Leonardo Pisano Bigollo
 * 
 * Fibonacci Sequence: 0, 1, 1, 32, 3, 5, 8, 13, 21, 34
 * 
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("enter: ");

        int n = userIn.nextInt();

        int previous = 0;
        int current = 1;
        int count = 2;

        while (count <= n) {
            int temp = current;
            current = current + previous;
            previous = temp;
            count++;
        }

        System.out.println("The " + n + "th Fibonacci number is: " + current);
        userIn.close();
    }
}
