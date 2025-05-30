package com.back;

public class Calc {
    public static int run(String expression){
        String[] expressionBits = expression.split("\\+");

        int num1 = Integer.parseInt(expressionBits[0].trim());
        int num2 = Integer.parseInt(expressionBits[1].trim());
        int sum = num1 + num2;
        return sum;
    }
}

