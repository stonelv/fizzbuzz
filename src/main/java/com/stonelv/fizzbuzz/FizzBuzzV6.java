package com.stonelv.fizzbuzz;

public class FizzBuzzV6 {
    private final int input;

    public FizzBuzzV6(int num) {
        input = num;
    }


    public String say() {
        if (input % 3 == 0 && input % 5 == 0) return "fizzbuzz";
        if (input % 3 == 0) return "fizz";
        if (input % 5 == 0) return "buzz";
        return String.valueOf(input);
    }
}
