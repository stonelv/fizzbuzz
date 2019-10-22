package com.stonelv.fizzbuzz;

class FizzBuzzV2 {
    static String returnValue(int num) {
        if (num % 3 == 0 && num % 5 == 0) return "fizzbuzz";
        if (num % 5 == 0) return "buzz";
        if (num % 3 == 0) return "bizz";

        return "" + num;
    }
}
