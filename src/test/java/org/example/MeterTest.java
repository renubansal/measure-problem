package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MeterTest {
    @Test
    void shouldAssert1000MetresIsEqualTo1000Metres() {
        Meter thousandMeter = new Meter(1000);
        Meter anotherThousandMeter = new Meter(1000);

        assertEquals(thousandMeter, anotherThousandMeter);
    }

    @Test
    void shouldAssert1MetresIsEqualTo1000Metres() {
        Meter oneMeter = new Meter(1);
        Meter thousandMeter = new Meter(1000);

        assertNotEquals(oneMeter, thousandMeter);
    }
}
