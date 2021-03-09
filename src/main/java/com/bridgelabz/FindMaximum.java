package com.bridgelabz;

public class FindMaximum {
    public static String giveMaximum(String first, String second, String third) {
        if (first.compareTo(second) > 0) {
            if (first.compareTo(third) > 0) {
                return first;
            } else {
                return third;
            }
        } else if (second.compareTo(third) > 0) {
            return second;
        } else {
            return third;
        }
    }
}

