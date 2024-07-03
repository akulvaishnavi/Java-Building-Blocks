/*Program to find saddle point of an array
   Saddle point of an array is the number which is
   the smallest in its row but biggest in its column */

import java.util.Scanner; // Scanner class imported from java.util package
public class Saddle_point 
{
public static void main(String args[])// Main method declared
 {
Scanner s = new Scanner(System.in);// Declaring object to use Scanner class
System.out.println("enter the size of 2d matrix");//Asking user for no. of terms in array
int n = s.nextInt(); // Accepting value from User  
int arr[][] = new int[n][n]; // array a declared having n elements
System.out.println("enter the array:-");
for (int i = 0; i < n; i++) // for loop to accept value from user
{
for (int j = 0; j < n; j++) 
{
arr[i][j] = s.nextInt(); // Accepting value from User
}
}
int col_max = 0;
for (int i = 0; i < n; i++) // for loop to find smallest number
{
int row_min = arr[i][0];  // smallest of row
int col = 0;
for (int j = 1; j < n; j++) // for loop to find column
{
if (arr[i][j] < row_min) // of smallest number
{
row_min = arr[i][j];
col = j;
}
}
for (int k = 0; k < n; k++) // for loop to find row of saddle point
{
if (row_min < arr[k][col])
{
col_max = 0;
break;
} 
else
col_max = row_min;
}
if (col_max != 0)
System.out.println("saddle point " + col_max); // saddle point is printed
}
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                arr[][]              int       Array which is to be
 *                                                  sorted
 *  2                 col                 int       Used as temporary 
 *                                                  variable to store 
 *                                                  the column of saddle 
 *                                                  point until correct 
 *                                                  column which is maximum '
 *                                                  is found out
 *  3               col_max               int       Used to store position
 *                                                  of column of saddle
 *                                                  point, which is the 
 *                                                  maximum
 *  4                 temp                int       Used to store position
 *                                                  of row of saddle
 *                                                  point, which is the 
 *                                                  minimum
 *  5                  i                   int      Used for initialization
 *                                                  of variable in for loop
 *  6                  j                   int      Used for initialization
 *                                                  of variable in for loop
 *  7                  k                   int      Used for initialization
 *                                                  of variable in for loop
 */
