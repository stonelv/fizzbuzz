package com.stonelv.fizzbuzz;

import org.junit.jupiter.api.Test;

 class FizzBuzzTest {
    @Test
    void check_normal_numbers() {
        assert FizzBuzz.ReturnWords(1).equals("1");
        assert FizzBuzz.ReturnWords(2).equals("2");
    }

    @Test
    void check_numbers_dividable_by_3() {
        assert FizzBuzz.ReturnWords(3).equals("fizz");
    }

    @Test
    void check_numbers_dividable_by_5() {
        assert FizzBuzz.ReturnWords(5).equals("buzz");
    }

    @Test
    void check_numbers_dividable_by_3_and_5() {
        assert FizzBuzz.ReturnWords(15).equals("fizzbuzz");
    }

    @Test
    void check_numbers_contains_3_and_5() {
        assert FizzBuzz.ReturnWords(23).equals("fizz");
        assert FizzBuzz.ReturnWords(51).equals("fizzbuzz");
    }
}
