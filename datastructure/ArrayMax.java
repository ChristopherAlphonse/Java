package datastructure;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayMax {


    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        Logger logger = Logger.getLogger(ArrayMax.class.getName());


        int[] n = {43, 56, 23, 32, 53, 76, 4, 34, 90, 98, 29, 21, 67, 52, 80};

        logger.info("enter the start value: ");
        int startRange = userInput.nextInt();
        logger.info("enter the end range: ");
        int endRange = userInput.nextInt();

        logger.log(Level.INFO, () -> " The max value: " + findMaxValue(n));
        logger.log(Level.INFO,
                () -> " The max Range value: " + findMaxRange(n, startRange, endRange));


        userInput.close();

    }

    static int findMaxValue(int[] n) {
        if (n == null) {
            return -1;
        }

        int result = n[0];

        for (int num : n) {

            if (num > result) {
                result = num;
            }

        }
        return result;
    }

    static int findMaxRange(int[] n, int start, int end) {

        if (end > start) {
            return -1;
        }

        if (n == null) {
            return -1;
        }


        int result = n[start];

        for (int i = start; i <= end; i++) {
            if (n[i] > result) {
                result = n[i];
            }

        }
        return result;
    }
    /*
     * for num of index of n, if index of n is greater than the previous value that is stored in
     * result, update result to the value of the current index of n
     */


}
