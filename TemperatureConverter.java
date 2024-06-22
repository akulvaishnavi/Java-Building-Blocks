import java.util.Scanner;
public class TemperatureConverter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("Temperature Converter Menu:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");

            int choice = sc.nextInt();
            double temp;
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    temp = sc.nextDouble();
                    double fah = celsiusToFahrenheit(temp);
                    System.out.println("Temperature in Fahrenheit: " + fah);
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temp = sc.nextDouble();
                    double cel = fahrenheitToCelsius(temp);
                    System.out.println("Temperature in Celsius: " + cel);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
            System.out.println();
        }
    }

    public static double celsiusToFahrenheit(double celsius) 
    {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) 
    {
        return (fahrenheit - 32) * 5/9;
    }
}
