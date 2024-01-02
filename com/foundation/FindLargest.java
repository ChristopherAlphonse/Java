package com.foundation;

import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("enter 3 numbers: ");

        long a = userInput.nextLong();
        int b = userInput.nextInt();
        int c = userInput.nextInt();

        long max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The largest num is " + max);
        userInput.close();

    }
}
