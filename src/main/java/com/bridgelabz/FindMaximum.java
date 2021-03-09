package com.bridgelabz;

public class FindMaximum <T extends Comparable> {
    public T input1;
    public T input2;
    public T input3;

    public FindMaximum(T input1,T input2,T input3){
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public T giveMaximum() {
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


