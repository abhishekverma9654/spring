package com.practice.spring.base.util;

public class UtilValidate {
    public static boolean isNotEmpty(String str) {
        return str != null && str.length() > 0;
    }
}
