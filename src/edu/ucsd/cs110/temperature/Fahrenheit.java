package edu.ucsd.cs110.temperature;

/**
 * Created by chris on 2/15/17.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((float)((this.getValue()-32)*5)/9);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString() {
        return this.getValue()+" F";
    }
}
