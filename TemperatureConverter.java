public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit = 98.6;  // Example Fahrenheit temperature
        double celsius = ((fahrenheit - 32) / 9) * 5;

        System.out.println("Temperature in Celsius: " + celsius);
    }
}
