/* Program to print the following pattern:-
* 1234567
* 123456
* 12345....
* .....1
* 12
* 123
* 1234
* 
*/
import java.util.Scanner;//Scanner class imported from java.util package
public class NestedFor10
{
public static void main (String args [])// Main method declared
{
Scanner sc = new Scanner(System.in);// Declaring object to use Scanner class
System.out.println("Enter no");// Asking user for number till which pattern
//will work
int x = sc.nextInt();//Accepting value from User
int t = x;//new variable t stores value of x as value of x changes during
//the course of the program
for (int i = x;i >=1; i--)//First for loop for number of columns and rows
{
for (int j = 1; j <= i; j++)//Second for loop for printing pattern
{
System.out.print(j + " ");//numbers of one line are printed
}
System.out.println();//line breaks here
}
for(int i = 2; i <= t; i++)//First for loop for number of columns and rows
{
for (int j = 1; j <= i; j++)//Second for loop for printing pattern
{
System.out.print(j + " ");//numbers of one line are printed
}
System.out.println();//line breaks here
}
}
}
/* Variable Description table
* S.No         Variable Name           Data Type          Description
*  1                 i                    int        Used to check working   
*                                                    of first loop in both 
*                                                    1st and 2nd nested 
*                                                    loop;till when will 
*                                                    loop work  
*  2                 j                    int        Used to check working 
*                                                    of second loop in both
*                                                   1st and 2nd nested loop;
*                                                   till when will loop work
*  3                 x                    int        Used to take and store 
*                                                    value of number till 
*                                                    which the user wants 
*                                                    the pattern to be 
*                                                    executed
*  4                 t                    int        Used to store the exact 
*                                                    value of x
*/
