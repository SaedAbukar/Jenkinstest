import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter t = new TemperatureConverter();
        double result = t.celsiusToFahrenheit(10.0);
        assertEquals(42.0, result);
    }

    @Test
    void testFahrenheitToCelsius() {
        TemperatureConverter t = new TemperatureConverter();
        double result = t.fahrenheitToCelsius(50.0);
        assertEquals(10.0, result);
    }

    @Test
    void testIsExtremeTemperatureFalse() {
        TemperatureConverter t = new TemperatureConverter();
        boolean result = t.isExtremeTemperature(25.0);
        assertEquals(false, result);
    }

    @Test
    void testIsExtremeTemperatureTrue() {
        TemperatureConverter t = new TemperatureConverter();
        boolean result = t.isExtremeTemperature(1000.0);
        assertEquals(true, result);
    }

    @Test
    void testIsExtremeTemperatureTrue2() {
        TemperatureConverter t = new TemperatureConverter();
        boolean result = t.isExtremeTemperature(-1000.0);
        assertEquals(true, result);
    }
}