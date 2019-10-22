package com.stonelv.fizzbuzz;

import org.junit.jupiter.api.Test;

class FizzBuzzTestV3 {
    @Test
    void should_return_itself_if_input_is_normal_numbers() {
        assert ifReturnCorrectValue(1, "1");
        assert ifReturnCorrectValue(2, "2");
    }

    private boolean ifReturnCorrectValue(int i, String s) {
        return new BizzBuzzV3(i).toString().equals(s);
    }

    @Test
    void should_return_bizz_if_input_is_dividable_by_3() {
        assert ifReturnCorrectValue(3, "bizz");
    }

    @Test
    void should_return_buzz_if_input_is_dividable_by_5() {
        assert ifReturnCorrectValue(5, "buzz");
    }

    @Test
    void should_return_bizzbuzz_if_input_is_dividable_by_3_and_5() {
        assert ifReturnCorrectValue(15, "bizzbuzz");
    }
}
