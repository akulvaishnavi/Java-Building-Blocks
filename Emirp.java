/* Program to find Emirp number using recursion.
 * Emirp number is a number which is prime in both 
 * its normal form and its reversed form 
 * E.g :- 13 is an Emirp number, as 13 and its reverse
 * 31 is a prime number */

import java.util.Scanner; // Scanner class imported from java.util package
public class Emirp
{
int n; // n is the number being checked
Emirp(int nn) // Constructor to give value of nn to n
{
n = nn;
}
int isPrime(int x) // Recursive function to check if number is prime
{
if(x == n) // when x is equal to n
return 1; // 1 is returned
if(n % x == 0 || n == 1) // if n%x ==0 or n ==1, basically if n has a factor
return 0; // 0 is returned
else // otherwise
return isPrime(x+1); // function is called again w value of x increased by 1
}
public static void main(String args[]) // Main method declared
{
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class
System.out.println("Enter Number"); // Asking user for number to be checked
int y = sc.nextInt(); // Accepting value from User
Emirp em = new Emirp(y); // Declaring object to use Emirp class 
int rev = 0; int f = 2;
for(int i = y; i > 0; i = i / 10) // for loop to reverse given number
{
int d = i % 10;
rev = (rev * 10) + d;
}
int a = em.isPrime(f); // a stores value if given number is prime or not
Emirp em1 = new Emirp(rev); 
int b = em1.isPrime(f); // b stores value if reversed number is prime or not
if (a == 1 && b == 1) // if both are prime(== 1)
{
System.out.println("Number is Emirp");
}
else
System.out.println("Number is not Emirp");
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                n                     int          Used for storing the
 *                                                      number to be checked
 *                                                      for Emirp
 *  2               nn                     int          Formal parameter of
 *                                                      Constructor which 
 *                                                      stores value to be
 *                                                      given to n
 *  3                x                     int          Formal parameter in 
 *                                                      isPrime function 
 *                                                      which contains 
 *                                                      value of divisor to
 *                                                      see if number has
 *                                                      factor or not
 *  3                y                     int          Used to taking the
 *                                                      number to be checked
 *                                                      for Emirp
 *  4               rev                    int          Used to store the
 *                                                      value of reversed
 *                                                      number
 *  5                f                     int          Used to store value 
 *                                                      of divisor to be 
 *                                                      used in isPrime 
 *                                                      function
 *  6                d                     int          Used for separating
 *                                                      digits from number
 *  7                a                     int          Used to store value 
 *                                                      if given number is 
 *                                                      prime or not
 *  8                b                     int          Used to store value 
 *                                                      if reversed number  
 *                                                      is prime or not */
