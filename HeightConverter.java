import java.util.Scanner;

public class HeightConverter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while (true)
            {
            System.out.println("Height Converter Menu:");
            System.out.println("1. Convert Feet and Inches to Centimeters");
            System.out.println("2. Convert Centimeters to Feet and Inches");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");

            int choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter feet: ");
                    int feet = sc.nextInt();
                    System.out.print("Enter inches: ");
                    int inches = sc.nextInt();
                    double centimeters = feetAndInchesToCentimeters(feet, inches);
                    System.out.println("Height in centimeters: " + centimeters);
                    break;
                case 2:
                    System.out.print("Enter centimeters: ");
                    double cm = sc.nextDouble();
                    int[] feetAndInches = centimetersToFeetAndInches(cm);
                    System.out.println("Height in feet and inches: " + feetAndInches[0] + " feet " + feetAndInches[1] + " inches");
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

    public static double feetAndInchesToCentimeters(int feet, int inches) 
    {
        final double CM_PER_INCH = 2.54;
        final double INCHES_PER_FOOT = 12;
        return (feet * INCHES_PER_FOOT + inches) * CM_PER_INCH;
    }

    public static int[] centimetersToFeetAndInches(double cm)
    {
        final double CM_PER_INCH = 2.54;
        final double INCHES_PER_FOOT = 12;
        int totalInches = (int) (cm / CM_PER_INCH);
        int feet = totalInches / INCHES_PER_FOOT;
        int inches = totalInches % INCHES_PER_FOOT;
        return new int[]{feet, inches};
    }
}
