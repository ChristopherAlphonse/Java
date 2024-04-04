package foundation;

import java.util.Scanner;

public class BitMapping {

    int mask = 0x0f;
    int value = 0x55;

    public static void main(String[] args) {
        BitMapping bitMap = new BitMapping();
        System.out.println(bitMap.performBitMapping());
    }

    public int performBitMapping() {
        return mask & value;
    }

    public static class PrintSum {

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
}
