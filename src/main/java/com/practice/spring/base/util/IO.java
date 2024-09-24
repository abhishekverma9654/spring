package com.practice.spring.base.util;

import java.math.BigDecimal;
import java.util.Scanner;

public class IO {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        return scanner.nextInt();
    }
    public static String getString() {
        return scanner.next();
    }
    public static double getDouble() {
        return scanner.nextDouble();
    }
    public static boolean getBoolean() {
        return scanner.nextBoolean();
    }
    public static char getChar() {
        return scanner.next().charAt(0);
    }
    public static BigDecimal getBigDecimal() {
        return new BigDecimal(scanner.next());
    }


}
