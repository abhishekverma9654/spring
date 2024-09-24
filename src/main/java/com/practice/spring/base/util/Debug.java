package com.practice.spring.base.util;

import org.slf4j.Logger;

public class Debug {
    static Logger logger = org.slf4j.LoggerFactory.getLogger(Debug.class);

    public static void log (String message) {
        logger.info(message);
    }
    public static void log (String message, Object ... args)
    {
        logger.info(message, args);
    }
    public static void error (String message) {
        logger.error(message);
    }
    public static void error (String message, Object ... args) {
        logger.error(message, args);
    }

}
