package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void given_num1_greater_should_return_num1() {
        FindMaximum findMax = new FindMaximum();
        String maxNo = findMax.giveMaximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",maxNo);
    }

    @Test
    public void given_num2_greater_should_return_num2() {
        FindMaximum findMax = new FindMaximum();
        String maxNo = findMax.giveMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",maxNo);
    }

    @Test
    public void given_num3_greater_should_return_num3() {
        FindMaximum findMax = new FindMaximum();
        String maxNo = findMax.giveMaximum("Banana","Apple","Peach");
        Assert.assertEquals("Peach",maxNo);
    }
}
