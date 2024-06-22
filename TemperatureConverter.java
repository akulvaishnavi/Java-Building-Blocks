import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Temperature Converter Menu:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");

            int choice = scanner.nextInt();
            double temperature;
            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    temperature = scanner.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(temperature);
                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temperature = scanner.nextDouble();
                    double celsius = fahrenheitToCelsius(temperature);
                    System.out.println("Temperature in Celsius: " + celsius);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
            System.out.println();
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
