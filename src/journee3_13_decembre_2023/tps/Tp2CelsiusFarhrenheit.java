package journee3_13_decembre_2023.tps;

public class Tp2CelsiusFarhrenheit {

    public static void main(String[] args) {
        // Test de conversion de Celsius en Fahrenheit
        double celsius = 0;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " °C équivaut à " + fahrenheit + " °F");

        // Test de conversion de Fahrenheit en Celsius
        fahrenheit = 32;
        celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F équivaut à " + celsius + " °C");
    }

    /**
     * Convertit la température de Celsius en Fahrenheit.
     *
     * @param celsius Température en degrés Celsius.
     * @return Température en degrés Fahrenheit.
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convertit la température de Fahrenheit en Celsius.
     *
     * @param fahrenheit Température en degrés Fahrenheit.
     * @return Température en degrés Celsius.
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
