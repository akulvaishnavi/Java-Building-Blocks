/* Program to find the sum of border elements of an 2d array */

import java.util.Scanner; // Scanner class imported from java.util package
public class SumOfBE
{
public static void main(String args[])// Main method declared
{
Scanner sc = new Scanner(System.in);//Declaring object to use Scanner class
System.out.println("Enter no. of rows");//Asking user for no. of rows
int m = sc.nextInt();//Accepting value from user
System.out.println("Enter no. of columns");//Asking user for no. of columns
int n = sc.nextInt();//Accepting value of user
System.out.println("Enter Elements");//Asking user for elements
int a[][]= new int[m][n];//array a declared having mxn elements
int sum = 0;
for(int i = 0; i < m; i++)
{
for(int j = 0; j < n; j++)
{
    a[i][j] = sc.nextInt();//Accepting value from User
}
}
for(int j = 0; j < n; j++)//for loop to find sum of upper row
{
    sum = sum + a[0][j];
}
for(int i = 0; i < m; i++)//for loop to find sum of right column
{
    sum = sum + a[i][n-1];
}
for(int j = n-1; j >=0; j--)//for loop to find sum of lowest row
{
    sum = sum + a[m-1][j];
}
for(int i = (m-1); i >= 0; i--)//for loop to find sum of left column
{
    sum = sum + a[i][0];
}
sum = sum - a[0][0] - a[0][n-1] - a[m-1][n-1] - a[m-1][0];//substracting duplicate terms
System.out.println("Sum of border elements is :- " + sum);//sum is printed
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                a[][]                int       Array of which the
 *                                                  border elements' sum
 *                                                  is to be found
 *  3                  m                  int       Used to store no. of
 *                                                  rows
 *  4                  n                  int       Used to store no. of
 *                                                  columns
 *  5                  i                  int       Used for initialization
 *                                                  of variable in for loop
 *  6                  j                  int       Used for initialization
 *                                                  of variable in for loop
 *  7                 sum                 int       Used to store sum of
 *                                                  border elements
 */
