package com.exemplo;
import static org.junit.Assert.*;
import org.junit.Test;

public class ConversorTest {
    @Test
    public void testFahrenheitParaCelsius() {
        Conversor conv = new Conversor();
        assertEquals(0.0, conv.fahrenheitParaCelsius(32), 0.001);
    }
    @Test
    public void testCelsiusParaFahrenheit() {
        Conversor conv = new Conversor();
        assertEquals(32.0, conv.celsiusParaFahrenheit(0), 0.001);
    }
}