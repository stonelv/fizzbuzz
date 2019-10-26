package com.stonelv.fizzbuzz;

public class FizzBuzzV4 {

    public static String returnValue(int num) {
        if (num % 3 == 0 && num % 5 == 0) return "bizzbuzz";
        if (num % 3 == 0) return "fizz";
        if (num % 5 == 0) return "buzz";
        return "" + num;
    }
}
