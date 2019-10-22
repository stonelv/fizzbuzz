package com.stonelv.fizzbuzz;

import org.junit.jupiter.api.Test;

 class FizzBuzzTestV2 {
    @Test
     void should_return_itself_when_input_normal_numbers() {
        assert FizzBuzzV2.returnValue(1).equals("1");
        assert FizzBuzzV2.returnValue(2).equals("2");
    }

    @Test
    void should_return_bizz_when_input_dividable_by_3() {
        assert FizzBuzzV2.returnValue(3).equals("bizz");
        assert FizzBuzzV2.returnValue(24).equals("bizz");
    }

    @Test
    void should_return_buzz_when_input_dividable_by_5() {
        assert FizzBuzzV2.returnValue(5).equals("buzz");
        assert FizzBuzzV2.returnValue(20).equals("buzz");
    }

    @Test
    void should_return_fizzbuzz_when_input_dividable_by_3_and_5() {
        assert FizzBuzzV2.returnValue(15).equals("fizzbuzz");
        assert FizzBuzzV2.returnValue(45).equals("fizzbuzz");
    }
}
