/* Program to take out Fibonacci series till the user says to stop it 
* The series goes like - 0,1,1,2,3,5,8 ...... */

import java.util.Scanner; // Scanner class imported from java.util package
public class Fibonacci
{
public static void main (String args []) // Main method declared
{
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class
System.out.println("Enter no. of values"); // Asking user for the number of values to be printed of the series
int n = sc.nextInt(); // Accepting value from User
int count = 3; // Establishing a counter to check to the number of values printed
int x = 0;
int y = 1;
System.out.println(x); // Here the first two values of Fibonacci series are printed, which is why the counter is set at 3 
System.out.println(y);
while (count <= n) // While Loop Declared for calculating numbers for series
{
int z = x + y;//This stores the value of the sum of the previous two numbers of the series
System.out.println(z); // and the value is printed here 
x = y; // The value of the numbers is switched accordingly so that after the
y = z; //number is printed, the number which is printed and the number before it becomes the last two numbers

count++;//The counter increases after the printing of the new number
//The program will stop when the counter is more than the value n
//which is entered by the user
}
}
}

/* Variable Description table
* S.No         Variable Name           Data Type          Description
*  1                n                     int        Used to accept the 
*                                                    value of till when 
*                                                    the series would be
*                                                    printed
*  2               count                  int        Used as counter to
*                                                    check till how much
*                                                    the series would be
*                                                    shown
*  3                x                     int        Used to store one 
*                                                    value of the series
*  4                y                     int        Used to store the 
*                                                    value of number 
*                                                    after x in series
*  5                z                     int        Used to store the 
*                                                    sum of x and y
*/
