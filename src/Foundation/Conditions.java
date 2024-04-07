package Foundation;

public class Conditions {

    public static void main(String[] args) {

        int salary = 90_000;
        int bonus1Years = 1_000;
        int bonus5Years = 3_000;
        int budgetCap = 95_000;

        if (salary >= budgetCap) {
            salary = salary + bonus1Years;
        } else {
            salary = salary + bonus5Years;
        }
        System.out.println(salary);

    }
}
