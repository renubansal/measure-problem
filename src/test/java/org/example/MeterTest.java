package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MeterTest {
    @Test
    void shouldAssert1000MetresIsEqualTo1000Metres() {
        Distance thousandMeter = new Distance(1000, "m");
        Distance anotherThousandMeter = new Distance(1000, "m");

        assertEquals(thousandMeter, anotherThousandMeter);
    }

    @Test
    void shouldAssert1MetresIsEqualTo1000Metres() {
        Distance oneMeter = new Distance(1, "m");
        Distance thousandMeter = new Distance(1000, "m");

        assertNotEquals(oneMeter, thousandMeter);
    }
}
