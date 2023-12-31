package Foundation;

import java.util.Scanner;

public class CountNums {


    public static void main(String[] args) {
        int n = 999123409;
        // int target = 9;

        Scanner Input = new Scanner(System.in);

        System.out.print("enter a target number: ");

        int target = Input.nextInt();

        int count = 0;
        while (n > 0) {
            int remainder = n % 10;

            if (remainder == target) {

                count++;
            }

            n = n / 10;
        }
        Input.close();
        System.out.println(count);
    }
}


