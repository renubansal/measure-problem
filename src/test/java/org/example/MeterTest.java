package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeterTest {
    @Test
    void shouldAssert1000MetresIsEqualTo1000Metres() {
        Meter thousandMeter = new Meter(1000);
        Meter anotherThousandMeter = new Meter(1000);

        assertEquals(thousandMeter, anotherThousandMeter);
    }
}
