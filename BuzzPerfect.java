/* Program to find out if the entered number is Buzz or Perfect
* Buzz number is a number which is divisible or ends with 7. 
* E.g:- 27 and 28 both are Buzz
* Perfect number is a number whose sum of factors(excluding itself) 
* is equal to the number E.g:- 6's factors are 1,2 and 3 excluding itself
* sum is 6. Hence. it is a Perfect number */

import java.util.Scanner;//Scanner class imported from java.util package
public class BuzzPerfect
{
public static void main (String args [])// Main method declared
{
Scanner sc = new Scanner(System.in);//Declaring object to use Scanner class
System.out.println("Menu");//Menu is shown to user
System.out.println("1. Buzz number");
System.out.println("2. Perfect Number");
System.out.println("Enter number");// Asking user for number to be checked
int n = sc.nextInt();//Accepting value from User
System.out.println("Enter choice");// Asking user for choice of execution
int c = sc.nextInt();//Accepting value from User
switch (c)//switch case declared with variable c as its expression
{
case 1://If c is 1, then these set of statements are executed
if (n % 7 == 0 || n % 10 == 7)//If the number obeys either of the two 
                             //criteria
{
    System.out.println("Buzz");//This statement is executed
}
else//Otherwise
{
    System.out.println("Not Buzz");//This Statement is executed
}
break;//break statement terminates statements in case
case 2: //If c is 2, these statements are executed
int sum = 0;
for (int i = 1 ; i < n; i++)//for loop declared to find out factors of
//number and their sum
{
   if (n % i == 0)//if this expression is true
   {
       sum = sum + i;//i is added to the value present in sum
    }//otherwise nothing is executed
}
if (sum == n)//If this expression is true
{
    System.out.println("Perfect Number");//this statement is executed
}
else//Otherwise
{
    System.out.println("Not a perfect number");//this statement is executed
}
break;//break statement terminates statements in case
default://if c is anything other than one or two
System.out.println("Invalid");//This statement(s) is executed
}
}
}
/* Variable Description table
* S.No         Variable Name           Data Type          Description
*  1                 n                   int        Used to accept a number
*                                                   from the user
*  2                 c                   int        Used as an expression 
*                                                  in switch case statement
*  3                sum                  int        Used to store the value
*                                                   of sum of factors of a 
*                                                   number
*  4                 i                   int     Used for execution of loop
*/
