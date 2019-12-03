package com.fizzbuzz;

import org.fizzbuzz.util.FizzBuzzUtil;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzStage2Test {

    @Test
    public void testFizzBuzzStage2(){
        Assert.assertTrue("13 should be fizz word", "fizz".equalsIgnoreCase(FizzBuzzUtil.getFizzBuzzStage2(13)));
        Assert.assertTrue("52 should be buzz word", "buzz".equalsIgnoreCase(FizzBuzzUtil.getFizzBuzzStage2(52)));
        Assert.assertTrue("57 should be fizzbuzz word", "fizzbuzz".equalsIgnoreCase(FizzBuzzUtil.getFizzBuzzStage2(57)));
        Assert.assertTrue("8 should be neither fizz nor buzz word", "8".equalsIgnoreCase(FizzBuzzUtil.getFizzBuzzStage2(8)));
    }

}
