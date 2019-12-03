package com.fizzbuzz;

import org.fizzbuzz.util.FizzBuzzUtil;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzStage1Test {

    @Test
    public void testFizzBuzzStage1(){
        Assert.assertTrue("3 should be fizz word", "fizz".equalsIgnoreCase(FizzBuzzUtil.getFizzBuzzStage1(3)));
        Assert.assertTrue("5 should be buzz word", "buzz".equalsIgnoreCase(FizzBuzzUtil.getFizzBuzzStage1(5)));
        Assert.assertTrue("15 should be fizzbuzz word", "fizzbuzz".equalsIgnoreCase(FizzBuzzUtil.getFizzBuzzStage1(15)));
        Assert.assertTrue("8 should be neither fizz nor buzz word", "8".equalsIgnoreCase(FizzBuzzUtil.getFizzBuzzStage1(8)));
    }

}
