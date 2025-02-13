
public class TemperatureConverter {
    private double celcius;
    private double fahrenheit;

    public double fahrenheitToCelsius(double fahrenheit) {
        celcius = (fahrenheit - 32) * 5/9;
        return celcius;
    }

    public double celsiusToFahrenheit(double celcius) {
        fahrenheit = (9/5 * celcius) + 32;
        return fahrenheit;
    }

    public boolean isExtremeTemperature(double celcius) {
        if (celcius > 50.0) {
            return true;
        } else if ( celcius < -40.0) {
            return true;
        }
        return false;
    }
}