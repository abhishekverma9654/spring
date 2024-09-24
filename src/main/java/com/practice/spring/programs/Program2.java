package com.practice.spring.programs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.*;

@Setter
@Getter
@Component
public class Program2 {
    private double num1;
    private double num2;
    private String operation;

    public static Map<String, ? extends Object> calculator(double num1, double num2, String operation) {
        Map<String, Object> resultMap = new HashMap<>();
        List<String> validOperations = new LinkedList<>(Arrays.asList("+", "-", "*", "/", "(", ")"));
        List<String> errorList = new LinkedList<>();

        double result = 0;
        if ("+".equals(operation)) {
            result = num1 + num2;
        } else if ("-".equals(operation)) {
            result = num1 - num2;
        } else if ("*".equals(operation)) {
            result = num1 * num2;
        } else if ("/".equals(operation)) {
            result = num1 / num2;
        } else {
            errorList.add("Invalid operation: " + operation);
        }
        if (!errorList.isEmpty())
            resultMap.put("errorList", errorList);

        resultMap.put("result", result);
        return resultMap;
    }
}
