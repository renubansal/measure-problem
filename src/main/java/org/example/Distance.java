package org.example;

public class Distance {
    private final double value;
    private final String unit;

    public Distance(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        return this.value == ((Distance) obj).value;
    }
}
