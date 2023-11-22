package Algorithm;

public class BinaryGap {

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        boolean started = false;

        int counter = 0;
        int maxCount = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);

            if (c == '1') {
                if (started) {
                    if (counter > maxCount) {
                        maxCount = counter;
                    }
                }

                counter = 0;
                started = true;
            } else if (c == '0') {
                counter++;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        BinaryGap bg = new BinaryGap();
        int result = bg.solution(9);
        System.out.println(result);
    }
}
