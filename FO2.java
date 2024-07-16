/* Program to execute the following sum of series
* 1. sum = 1-x/1+x/2...... upto n terms
* 2. sum = 1/1!+1/2!.....upto n terms */

import java.util.Scanner; // Scanner class imported from java.util package
public class FO2
{
public void sumSeries(int n, double x) // function sumSeries declared with 1 int and 1 double argument
{
int j = 1;
double sum = 0.0;
for(int i = 1; i <=n; i++) // for loop declared for until sum of series will work
{
if (j % 2 == 0) // if j is divisible by 2
{
sum = sum - (double) x/j; // x divided by j would be substracted from sum
}
else // otherwise
{
sum = sum + (double) x/j; // x divided by j would be added to sum
}
j++; // j is incremented by one
}
System.out.println("The sum is " + sum); // sum is printed
}
public void sumSeries(int n) // function sumSeries declared with 1 int argument
{
int l = 1;
double sum = 0.0;
int f = 1;
for(int i = 1; i<=n; i++) // for loop declared for until sum of series will work
{
for (int k = l; l <=i; l++) // for loop declared for finding factorial of no.
{
f = f * k; // factorial of number is calculated here (by multiplying the no and no.s before it)
}
sum = sum + (double) 1/f;//x divided by factorial of no. is added to sum
}
System.out.println("The sum is" + sum);//sum is printed
}
public static void main(String args[])//Main method declared
{
FO2 fo = new FO2();// Declaring object to use FO2 class
Scanner sc = new Scanner(System.in);//Declaring object to use Scanner class
System.out.println("Enter n");//Asking user for value of n
int n = sc.nextInt();//Accepting value from User
System.out.println("Enter x");//Asking user for value of x
double x = sc.nextDouble();//Accepting value from User
System.out.println("Enter n1");//Asking user for value of n1
int n1 = sc.nextInt();//Accepting value from User
fo.sumSeries(n,x);//function sumSeries with 2 arguments is called with
//values of n and x being passed to it
fo.sumSeries(n1);//function sumSeries with 1 argument is called with 
//value of n1 being passed to it
}
}
/* Variable Description table
* S.No         Variable Name          Data Type          Description
*  1                 n                   int        Used to accept and 
*                                                   store value of it 
*                                                   from user in main() 
*                                                   and in both function 
*                                                   sumSeries to tell 
*                                                   length of sum of 
*                                                   series
*  2                 x                  double      Used to accept and 
*                                                   store value of it 
*                                                   from user in main() 
*                                                   and in function 
*                                                   sumSeries to be 
*                                                   numerator of frac.  
*                                                   divided by j 
*  3                n1                   int        Used to accept and 
*                                                   store value of it 
*                                                   from user in main()
*                                                   and its value passed
*                                                   to second sumSeries 
*                                                   to tell length of 
*                                                   sum of series
*  4                 j                   int        Used in first function
*                                                   sumSeries as 
*                                                   denominator of 
*                                                   fraction whose 
*                                                   numerator is x
*  5                sum                 double      Used in both function 
*                                                   sumSeries to store 
*                                                   sum of the series
*  6                 l                   int        Used in second function 
*                                                   sumSeries to calculate 
*                                                   factorial of no.
*  7                 f                   int        Used in second function 
*                                                  sumSeries as constant to 
*                                                   calculate sum of series
*  8                 i                   int       Used for running of loop 
*                                                   until it has fulfilled 
*                                                   its condition
*  9                 k                   int       Used for running of loop 
*                                                   until it has fulfilled 
*                                                   its condition */
