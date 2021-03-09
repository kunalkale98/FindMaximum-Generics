package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void given_num1_greater_should_return_num1() {
        FindMaximum findMax = new FindMaximum(8,5,6);
        int maxNo = (int) findMax.giveMaximum();
        Assert.assertEquals(8,maxNo);
    }

    @Test
    public void given_num2_greater_should_return_num2() {
        FindMaximum findMax = new FindMaximum(6,8,5);
        int maxNo = (int) findMax.giveMaximum();
        Assert.assertEquals(8,maxNo);
    }

    @Test
    public void given_num3_greater_should_return_num3() {
        FindMaximum findMax = new FindMaximum(5,6,8);
        int maxNo = (int) findMax.giveMaximum();
        Assert.assertEquals(8,maxNo);
    }

    @Test
    public void given_float1_greater_should_return_float1() {
        Float num1 = (float) 8.5;
        Float num2 = (float) 5.6;
        Float num3 = (float) 6.8;
        FindMaximum findMax = new FindMaximum(num1,num2,num3);
        Float maxNo = (Float) findMax.giveMaximum();
        Assert.assertEquals(num1,maxNo);
    }

    @Test
    public void given_float2_greater_should_return_float2() {
        Float num1 = (float) 6.8;
        Float num2 = (float) 8.5;
        Float num3 = (float) 5.6;
        FindMaximum findMax = new FindMaximum(num1,num2,num3);
        Float maxNo = (Float) findMax.giveMaximum();
        Assert.assertEquals(num2,maxNo);
    }

    @Test
    public void given_float3_greater_should_return_float3() {
        Float num1 = (float) 5.6;
        Float num2 = (float) 6.8;
        Float num3 = (float) 8.5;
        FindMaximum findMax = new FindMaximum(num1,num2,num3);
        Float maxNo = (Float) findMax.giveMaximum();
        Assert.assertEquals(num3,maxNo);
    }

    @Test
    public void given_string1_greater_should_return_string1() {
        FindMaximum findMax = new FindMaximum("Peach","Apple","Banana");
        String maxNo = (String) findMax.giveMaximum();
        Assert.assertEquals("Peach",maxNo);
    }

    @Test
    public void given_string2_greater_should_return_string2() {
        FindMaximum findMax = new FindMaximum("Apple","Peach","Banana");
        String maxNo = (String) findMax.giveMaximum();
        Assert.assertEquals("Peach",maxNo);
    }

    @Test
    public void given_string3_greater_should_return_string3() {
        FindMaximum findMax = new FindMaximum("Banana","Apple","Peach");
        String maxNo = (String) findMax.giveMaximum();
        Assert.assertEquals("Peach",maxNo);
    }
}
