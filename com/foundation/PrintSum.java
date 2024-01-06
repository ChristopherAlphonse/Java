package com.foundation;

import java.util.Scanner;

public class PrintSum {

    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = userIn.nextInt();
        int b = userIn.nextInt();
        System.out.print("Result: ");
        printSum(a, b);
        userIn.close();
    }

    static void printSum(int valueA, int valueB) {
        int sum = valueA + valueB;
        System.out.println(sum);
    }

}
