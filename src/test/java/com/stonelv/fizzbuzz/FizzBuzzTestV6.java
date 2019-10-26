package com.stonelv.fizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTestV6 {
    @Test
    public void should_return_itself_when_input_is_normal_number() {
        assert new FizzBuzzV6(1).say().equals("1");
        assert new FizzBuzzV6(2).say().equals("2");
    }

    @Test
    public void should_say_fizz_when_input_is_multiple_of_3() {
        assert new FizzBuzzV6(3).say().equals("fizz");
    }

    @Test
    public void should_say_buzz_when_input_is_multiple_of_5() {
        assert new FizzBuzzV6(5).say().equals("buzz");
    }

    @Test
    public void should_say_fizzbuzz_when_input_is_multiple_of_3_and_5() {
        assert new FizzBuzzV6(15).say().equals("fizzbuzz");
    }
}
