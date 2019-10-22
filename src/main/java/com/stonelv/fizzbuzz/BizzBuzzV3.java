package com.stonelv.fizzbuzz;

public class BizzBuzzV3 {
    private int num;
    BizzBuzzV3(int iNum) {
        num = iNum;
    }

    @Override
    public String toString() {
        if (isDividableBy(3) && isDividableBy(5)) return "bizzbuzz";
        if (isDividableBy(3)) return "bizz";
        if (isDividableBy(5)) return  "buzz";
        return String.valueOf(num);
    }

    private boolean isDividableBy(int i) {
        return num % i == 0;
    }
}
