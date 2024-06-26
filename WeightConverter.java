import java.util.Scanner;

public class WeightConverter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("Weight Converter Menu:");
            System.out.println("1. Convert Pounds to Kilograms");
            System.out.println("2. Convert Kilograms to Pounds");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");

            int choice = sc.nextInt();
            double weight;
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter weight in pounds: ");
                    weight = sc.nextDouble();
                    double kilograms = poundsToKilograms(weight);
                    System.out.println("Weight in kilograms: " + kilograms);
                    break;
                case 2:
                    System.out.print("Enter weight in kilograms: ");
                    weight = sc.nextDouble();
                    double pounds = kilogramsToPounds(weight);
                    System.out.println("Weight in pounds: " + pounds);
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

    public static double poundsToKilograms(double pounds) 
    {
        final double KG_PER_POUND = 0.45359237;
        return pounds * KG_PER_POUND;
    }

    public static double kilogramsToPounds(double kilograms) 
    {
        final double POUNDS_PER_KG = 2.2046226218;
        return kilograms * POUNDS_PER_KG;
    }
}
