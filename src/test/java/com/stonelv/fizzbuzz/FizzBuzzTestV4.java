package com.stonelv.fizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTestV4 {
    @Test
    public void should_return_original_number() {
        assert FizzBuzzV4.returnValue(1).equals("1");
        assert FizzBuzzV4.returnValue(2).equals("2");
    }

    @Test
    public void should_return_bizz_when_input_is_dividable_by_3() {
        assert FizzBuzzV4.returnValue(3).equals("fizz");
        assert FizzBuzzV4.returnValue(33).equals("fizz");
    }

    @Test
    public void should_return_buzz_when_input_is_dividable_by_5() {
        assert FizzBuzzV4.returnValue(5).equals("buzz");
        assert FizzBuzzV4.returnValue(55).equals("buzz");
    }

    @Test
    public void should_return_bizzbuzz_when_input_is_dividable_by_3_and_5() {
        assert FizzBuzzV4.returnValue(15).equals("bizzbuzz");
        assert FizzBuzzV4.returnValue(45).equals("bizzbuzz");
    }
}
