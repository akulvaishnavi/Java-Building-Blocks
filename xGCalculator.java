import java.util.Scanner;

public class xGCalculator 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Expected Goals (xG) Calculator");

        System.out.print("Enter distance from goal (in meters): ");
        double distance = sc.nextDouble();

        System.out.print("Enter angle to goal (in degrees): ");
        double angle = sc.nextDouble();

        System.out.println("Enter type of shot: ");
        System.out.println("1. Header");
        System.out.println("2. Shot with foot");
        int shotType = scanner.nextInt();

        double xG = calculatexG(distance, angle, shotType);
        System.out.println("Expected Goals (xG) value: " + xG);

        sc.close();
    }

    public static double calculatexG(double distance, double angle, int shotType) {
        // Basic xG calculation formula components
        double distanceFactor = Math.exp(-distance / 7); // Exponential decay based on distance
        double angleFactor = Math.sin(Math.toRadians(angle)); // Sine of the angle in degrees

        // Type of shot factor
        double shotTypeFactor;
        if (shotType == 1) 
        {
            shotTypeFactor = 0.1; // Headers have a lower success rate
        } 
        else 
        {
            shotTypeFactor = 0.2; // Shots with foot have a higher success rate
        }
        // Combine factors to estimate xG
        double xG = distanceFactor * angleFactor * shotTypeFactor;
        return xG;
    }
}
