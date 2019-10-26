package com.stonelv.fizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTestV5 {
    @Test
    public void should_return_original_number_when_input_normal() {
        assert FizzBuzzV5.sayNumber(1).equals("1");
        assert FizzBuzzV5.sayNumber(2).equals("2");
    }

    @Test
    public void should_return_fizz_when_input_is_dividable_by_3() {
        assert FizzBuzzV5.sayNumber(3).equals("fizz");
        assert FizzBuzzV5.sayNumber(9).equals("fizz");
    }

    @Test
    public void should_return_buzz_when_input_is_dividable_by_5() {
        assert FizzBuzzV5.sayNumber(5).equals("buzz");
        assert FizzBuzzV5.sayNumber(20).equals("buzz");
    }

    @Test
    public void should_return_bizzbuzz_when_input_is_dividable_by_3_and_5() {
        assert FizzBuzzV5.sayNumber(15).equals("fizzbuzz");
    }
}
