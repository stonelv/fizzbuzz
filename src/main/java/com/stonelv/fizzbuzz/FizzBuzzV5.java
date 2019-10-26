package com.stonelv.fizzbuzz;

public class FizzBuzzV5 {
    public static String sayNumber(int num) {
        if (num % 3 == 0 && num % 5 == 0) return "fizzbuzz";
        if (num % 3 == 0) return "fizz";
        if (num % 5 == 0) return "buzz";
        return "" + num;
    }
}
