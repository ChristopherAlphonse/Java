package Foundation.misc;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pointing {
    private static final Logger logger = Logger.getLogger(Pointing.class.getName());

    public static void main(String[] args) {
        HashMap<String, String> mapping = new HashMap<>();

        mapping.put("oh", "ohio");
        mapping.put("ma", "massachusetts");
        mapping.put("fl", "florida");
        logger.log(Level.INFO, String.valueOf(mapping));

    }
}
