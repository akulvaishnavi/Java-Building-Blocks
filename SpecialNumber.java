import java.util.Scanner;

public class SpecialNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isSpecialNumber(number)) 
        {
            System.out.println(number + " is a special number.");
        } 
        else 
        {
            System.out.println(number + " is not a special number.");
        }
    }

    public static boolean isSpecialNumber(int number) 
    {
        int sum = 0;
        int temp = number;

        while (temp != 0) 
        {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    public static int factorial(int n) {
        if (n == 0) 
        {
            return 1;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++)
            {
            fact *= i;
        }
        return fact;
    }
}
