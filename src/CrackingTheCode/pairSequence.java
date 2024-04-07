package CrackingTheCode;

public class pairSequence {

    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;

    public static int pairSumSequence(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    static int pairSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(pairSumSequence(2));

    }
}
