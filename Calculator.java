import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Select an operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        double result = 0;
        
        switch(operator)
            {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        
        System.out.println("Result: " + result);
        
        sc.close();
    }

    public static double add(double num1, double num2) 
    {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) 
    {
        return num1 - num2;
    }
    
    public static double multiply(double num1, double num2) 
    {
        return num1 * num2;
    }
  
    public static double divide(double num1, double num2) 
    {
        if(num2 == 0) 
        {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
        return num1 / num2;
    }
}
