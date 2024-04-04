package foundation;

public class ReverseNumber {

    public static void main(String[] args) {
        int n = 123;
        int answer = 0;
        while (n > 0) {
            int remain = n % 10;
            n = n / 10;
            answer = answer * 10 + remain;
        }

        System.out.println(answer);
    }

}
