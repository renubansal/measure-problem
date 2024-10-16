package org.example;

public class Meter {
    private final double value;

    public Meter(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return this.value == ((Meter) obj).value;
    }
}
