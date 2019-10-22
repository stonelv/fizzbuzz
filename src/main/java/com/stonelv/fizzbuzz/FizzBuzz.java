package com.stonelv.fizzbuzz;

public class FizzBuzz {
    static String ReturnWords(int input) {
         if (related_with(input, 3) && related_with(input, 5)) return "fizzbuzz";
        if (related_with(input, 3)) return "fizz";
        if (related_with(input, 5)) return "buzz";
        return "" + input;
        }

    private static boolean related_with(int input, int i) {
        return input % i == 0 || String.valueOf(input).contains(String.valueOf(i));
    }

    public String[] MakeBizzBuzzList() {
        String[] results = new String[100];
        for (int i = 1; i <= 100; i++) {
            if (related_with(i, 3) && related_with(i, 5)) {
                results[i -1] = "FizzBuzz";
                continue;
            }
            if (related_with(i, 3)) {
                results[i - 1] = "Fizz";
                continue;
            }
            if(related_with(i, 5)) {
                results[i - 1] = "Buzz";
                continue;
            }
            results[i - 1] = String.valueOf(i);
        }
        return results;
    }
}
