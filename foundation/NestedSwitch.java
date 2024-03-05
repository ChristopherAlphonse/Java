package foundation;

import java.util.Scanner;
import java.util.logging.Logger;

public class NestedSwitch {

    private static final Logger logger = Logger.getLogger(NestedSwitch.class.getName());

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);


        System.out.print("Enter Identification Number: ");
        int userID = userIn.nextInt();
        userIn.nextLine();

        switch (userID) {
            case 1 -> logger.info("John Doe");
            case 2 -> logger.info("Mary Jane");
            case 3 -> {
                logger.info("Enter Department: ");
                String department = userIn.next().toUpperCase();
                switch (department) {
                    case "IT" -> logger.info("IT Department");
                    case "HR" -> logger.info("HR Department");
                    default -> logger.warning("Department not found");
                }
            }
            default -> logger.warning("try again");
        }

        userIn.close();
    }


}
