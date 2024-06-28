import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int originalNumber = n;
        int reversedNumber = 0;

        for (int i = n; i > 0; i /= 10) 
        {
            int digit = i % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        if (originalNumber == reversedNumber) 
        {
            System.out.println(originalNumber + " is a palindrome number.");
        } 
        else 
        {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}
