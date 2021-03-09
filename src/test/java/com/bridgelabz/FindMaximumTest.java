package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void given_num1_greater_should_return_num1() {
        FindMaximum findMax = new FindMaximum();
        int maxNo = findMax.giveMaximum(8,5,6);
        Assert.assertEquals(8,maxNo);
    }

    @Test
    public void given_num2_greater_should_return_num2() {
        FindMaximum findMax = new FindMaximum();
        int maxNo = findMax.giveMaximum(6,8,5);
        Assert.assertEquals(8,maxNo);
    }

    @Test
    public void given_num3_greater_should_return_num3() {
        FindMaximum findMax = new FindMaximum();
        int maxNo = findMax.giveMaximum(5,6,8);
        Assert.assertEquals(8,maxNo);
    }

    @Test
    public void given_float1_greater_should_return_float1() {
        FindMaximum findMax = new FindMaximum();
        Float num1 = (float) 8.5;
        Float num2 = (float) 5.6;
        Float num3 = (float) 6.8;
        Float maxNo = findMax.giveMaximum(num1,num2,num3);
        Assert.assertEquals(num1,maxNo);
    }

    @Test
    public void given_float2_greater_should_return_float2() {
        FindMaximum findMax = new FindMaximum();
        Float num1 = (float) 6.8;
        Float num2 = (float) 8.5;
        Float num3 = (float) 5.6;
        Float maxNo = findMax.giveMaximum(num1,num2,num3);
        Assert.assertEquals(num2,maxNo);
    }

    @Test
    public void given_float3_greater_should_return_float3() {
        FindMaximum findMax = new FindMaximum();
        Float num1 = (float) 5.6;
        Float num2 = (float) 6.8;
        Float num3 = (float) 8.5;
        Float maxNo = findMax.giveMaximum(num1,num2,num3);
        Assert.assertEquals(num3,maxNo);
    }

    @Test
    public void given_string1_greater_should_return_string1() {
        FindMaximum findMax = new FindMaximum();
        String maxNo = findMax.giveMaximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",maxNo);
    }

    @Test
    public void given_string2_greater_should_return_string2() {
        FindMaximum findMax = new FindMaximum();
        String maxNo = findMax.giveMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",maxNo);
    }

    @Test
    public void given_string3_greater_should_return_string3() {
        FindMaximum findMax = new FindMaximum();
        String maxNo = findMax.giveMaximum("Banana","Apple","Peach");
        Assert.assertEquals("Peach",maxNo);
    }
}
