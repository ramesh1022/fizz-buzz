package com.fizzbuzz;

import com.fizzbuzz.util.FizzBuzzUtil;

import java.util.Objects;
import java.util.stream.IntStream;

public class FizzBuzzPrinter {
    public static void main(String[] args) {
        IntStream.range(1, 100)
                .boxed()
                .map(i -> getFizzBuzz(args, i))
                .forEach(System.out::println);
    }

    private static String getFizzBuzz(String[] args, int i){
        // if first argument is stage2 then we execute fizzbuzz stage2 and for all remaining cases we go for stage1 as default
        if(Objects.nonNull(args) && args.length >= 1 ){
            if ("stage2".equalsIgnoreCase(args[0])){
                return FizzBuzzUtil.getFizzBuzzStage2(i);
            }
        }
        return FizzBuzzUtil.getFizzBuzzStage1(i);
    }
}
