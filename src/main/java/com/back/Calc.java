package com.back;

public class Calc {
    public static int run(String expression) {
        if(expression.contains("+")){
            String[] expressionBits = expression.split("\\+");

            int num1 = Integer.parseInt(expressionBits[0].trim());
            int num2 = Integer.parseInt(expressionBits[1].trim());
            return num1 + num2;
        }
        else if(expression.contains("-")){
            String[] expressionBits = expression.split("\\-");

            int num1 = Integer.parseInt(expressionBits[0].trim());
            int num2 = Integer.parseInt(expressionBits[1].trim());
            return num1 - num2;
        }
        return 0;
    }
}

