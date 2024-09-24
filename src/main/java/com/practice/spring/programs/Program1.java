package com.practice.spring.programs;

import java.util.HashMap;
import java.util.Map;

public class Program1 {
    public static Map<String, ? extends Object> helloWorld() {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("result", "Hello World");
        return resultMap;
    }
}
