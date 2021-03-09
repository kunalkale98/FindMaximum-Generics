package com.bridgelabz;

public class FindMaximum {
    public static <T extends Comparable> T giveMaximum(T input1, T input2, T input3) {
        if (input1.compareTo(input2) > 0) {
            if (input1.compareTo(input3) > 0) {
                return input1;
            } else {
                return input3;
            }
        } else if (input2.compareTo(input3) > 0) {
            return input2;
        } else {
            return input3;
        }
    }
}

