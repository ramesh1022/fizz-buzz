package com.fizzbuzz.util;

import java.util.function.Predicate;

/**
 * Contains Predicate objects which are used in evaluating fizz buzz words.
 */
public interface FizzBuzzPredicates {

    /*
    Reusable Predicate which checks if predicate object is a multiple of method argument.
    This can be re used to check for 3,4,5 etc., and any number instead of writing a separate predicate for each multiple which is more
    future proof.
     */
    static Predicate<Integer> isMultipleOf(final int value) {
        return i -> i % value == 0;
    }

    /*
    Reusable Predicate which checks if predicate object is a multiple of method argument OR string value of predicate object contains
    string value of method argument.
    This can be re used to check for 3,4,5 etc., and any number instead of writing a separate predicate for each multiple which is more
    future proof.
     */
    static Predicate<Integer> isMultipleOfOrIsContains(final int value) {
        return i -> i % value == 0 ||
                String.valueOf(i).contains(String.valueOf(value));
    }

}