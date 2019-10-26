package com.stonelv.fizzbuzz;

import org.junit.jupiter.api.Test;

public class LengthConversionTest {
    @Test
    public void check_foot_to_inch() {
        assert LengthConversion.footToInch(1) == 12;
        assert LengthConversion.footToInch(5) == 60;
    }

    @Test
    public void check_yard_to_foot() {
        assert LengthConversion.yardToFoot(1) == 3;
        assert LengthConversion.yardToFoot(5) == 15;
    }

    @Test
    public void check_yard_to_inch() {
        assert LengthConversion.yardToInch(1) == 36;
    }
}
