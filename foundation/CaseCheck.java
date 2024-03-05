package foundation;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CaseCheck {
    private static final Logger logger = Logger.getLogger(CaseCheck.class.getName());

    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        logger.info("enter:");
        char character = userIn.next().trim().charAt(0);
        // trim = remove white spaces if any, charAt(0) = same as [0]

        if (character >= 'a' && character <= 'z') {
            logger.info(" Lowercase ");
        } else {
            logger.info(" Uppercase ");
        }

        logger.log(Level.INFO, () -> "character is: " + character);
        userIn.close();
    }

}
