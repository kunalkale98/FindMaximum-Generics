package com.bridgelabz;

public class FindMaximum {
    public static float giveMaximum(Float num1, Float num2, Float num3) {
        if (num1.compareTo(num2) > 0) {
            if (num1.compareTo(num3) > 0) {
                return num1;
            } else {
                return num3;
            }
        } else if (num2.compareTo(num3) > 0) {
            return num2;
        } else {
            return num3;
        }
    }
}

