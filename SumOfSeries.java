/* Program to show a sum of series like :-
* 1/4 + 1/8 + 1/12 ...... upto n terms
*/
import java.util.Scanner;//Scanner class imported from java.util package
public class SumOfSeries
{
public static void main (String args [])// Main method declared
{
Scanner sc = new Scanner (System.in);//Declaring object to use Scanner class
System.out.println("Enter Terms");// Asking user for no. of terms
int n = sc.nextInt();//Accepting value from User
double sum = 0.0;//Declaring variable sum
int j = 4;//Declaring variable j
for (int i = 1; i <=n; i++)//For Loop Declared for taking out the sum
{
   sum = sum + (double) 1/j;//sum is equal to sum plus double form of 1/j
                           //(explicit)
   j = j + 4;//j is incremented by 4
}
System.out.println("The sum is " + sum);//sum is displayed to user
}
}
/* Variable Description table:-
* S.No         Variable Name           Data Type          Description
*  1                n                     int        Used for taking the 
*                                                    terms for series from 
*                                                    user
*  2               sum                  double       Used to store value 
*                                                    of the sum of series
*  3                j                     int        Used for storing the 
*                                                 value of the denominator,
*                                                which is later incremented
*  4                i                     int        Used for storing value 
*                                                  for incrementing the loop
*/
