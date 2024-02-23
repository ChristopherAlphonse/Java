package com.misc;

import java.util.logging.Logger;

public class Cookie {

    private static final Logger logger =
            Logger.getLogger(Cookie.class.getName());

    private String color;

    public Cookie(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("blue");
        logger.info(cookieOne.color);
    }

}
