package org.fizzbuzz.util;

import static org.fizzbuzz.util.FizzBuzzPredicates.*;

public final class FizzBuzzUtil {
    private static final String FIZZ_WORD = "Fizz";
    private static final String BUZZ_WORD = "Buzz";
    private static final String FIZZ_BUZZ_WORD = "FizzBuzz";
    private FizzBuzzUtil(){}

    public static String getFizzBuzzStage1(int i) {
        if(isMultipleOf(3).and(isMultipleOf(5)).test(i)) {
            return FIZZ_BUZZ_WORD;
        } else if(isMultipleOf(5).test(i)) {
            return BUZZ_WORD;
        } else if(isMultipleOf(3).test(i)) {
            return FIZZ_WORD;
        } else {
            return String.valueOf(i);
        }
    }

    public static String getFizzBuzzStage2(int i) {
        if(isMultipleOfOrIsContains(3).and(isMultipleOfOrIsContains(5)).test(i)) {
            return FIZZ_BUZZ_WORD;
        } else if(isMultipleOfOrIsContains(5).test(i)) {
            return BUZZ_WORD;
        } else if(isMultipleOfOrIsContains(3).test(i)) {
            return FIZZ_WORD;
        } else {
            return String.valueOf(i);
        }
    }

}
