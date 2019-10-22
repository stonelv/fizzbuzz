package com.stonelv.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzbuzzApplicationTests {

	@ParameterizedTest(name="given {0} should return {1}")
	@CsvSource({
			"1, '1'",
			"3, 'Fizz'",
			"5, 'Buzz'",
			"15, 'FizzBuzz'"
	})
	void testinput(int input, String words) {
		assert FizzBuzz.ReturnWords(input).equals(words);
		}

}
