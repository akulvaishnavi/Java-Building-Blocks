/* Program to overload a function polygon() as follows :-
* polygon(int n, char ch)- prints ch(if ch = a) as follows(if n = 3) :-
* a
* aa
* aaa
* polygon(int x, int y)- prints '@' with x no. of rows and
* y no. of columns :-
* @@(if x = 1 and y = 2)
* polygon(int a) - prints pattern as follows(if a = 3) :-
* 1 11 111 */

import java.util.Scanner; // Scanner class imported from java.util package
public class PolyConstructor
{
void polygon(int n, char ch) // function polygon declared with 1 int and 1 char argument
{
for(int i = 1; i <=n; i++) // First for loop for number of columns and rows
{
for (int j = 1; j <=i; j++) // Second for loop for printing pattern
{
System.out.print(ch); // characters of one line are printed
}
System.out.println(); // line is broken here
}
}
void polygon(int x, int y) // function polygon declared with 2 int arguments

{
for(int i = 1; i <=x;i++) // First for loop for number of rows
{
for(int j = 1; j <=y;j++) // Second for loop for printing pattern untilnumber of columns
{
System.out.print("@"); // characters of columns are printed
}
System.out.println(); // line is broken(new row is formed)
}
}
void polygon(int a) // function polygon declared with 1 int argument
{
for(int i = 1;i <=a;i++) // First for loop for printing starting of one set of 1's and giving spaces
{
System.out.print("1");
for(int j = 2; j <=i; j++) // Second for loop for printing rest of the set
{
System.out.print("1");
}
System.out.print("\t");
}
}
public static void main(String args[]) // Main method declared
{
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class
PolyConstructor po = new PolyConstructor();// Declaring object to use PolyConstructor class
System.out.println("Enter choice (1. int and char 2. int and int 3. int)"); // Asking user for choice
int d = sc.nextInt(); // Accepting value from user
switch(d) // switch case declared with variable d as its expression
{
case 1: // If d is 1, then these set of statements are executed
System.out.println("Enter Int"); // Asking user for Integer
int f = sc.nextInt(); // Accepting value from user
System.out.println("Enter char");
char ch1 = sc.next().charAt(0); // Accepting value from user
po.polygon(f,ch1); // function polygon with 2 arguments is called with values of f and ch being passed to it
break; // break statement terminates statements in case
case 2: // If d is 2, then these set of statements are executed
System.out.println("Enter Int"); // Asking user for Integer
int h = sc.nextInt(); // Accepting value from user
System.out.println("Enter 2nd Int"); // Asking user for 2nd Integer
int z = sc.nextInt(); // Accepting value from user
po.polygon(h,z); // function polygon with 2 arguments is called with values of h and z being passed to it
break; // break statement terminates statements in case
case 3: // If d is 3, then these set of statements are executed
System.out.println("Enter Number"); // Asking user for Number
int e = sc.nextInt(); // Accepting value from user
po.polygon(e); // function polygon with 1 argument is called with value of e being passed to it
}
}
}
/* Variable Description table
* S.No         Variable Name           Data Type          Description
*  1                 f                    int       Used to accept and
*                                                   store value of
*                                                   integer from user
*  2                 h                    int       Used to accept and
*                                                   store value of
*                                                   integer from user
*  3                 z                    int       Used to accept and
*                                                   store value of
*                                                   integer from user
*  4                 e                    int       Used to accept and
*                                                   store value of
*                                                   number from user
*  5                ch1                  char       Used to accept and
*                                                   store value of
*                                                   character from user
*  6                 d                    int      Used to store the option
*                                                   the user has selected
*  7                 i                    int      Used for running of loop 
*                                                   until it has fulfilled 
*                                                   its condition
*  8                 j                    int      Used for running of loop 
*                                                   until it has fulfilled 
*                                                   its condition
*  9                 n                    int       Used to store value of
*                                                   f in it to be used in 
*                                                   function polygon()
* 10                ch                   char       Used to store value of
*                                                   ch in it to be used in 
*                                                   function polygon()
* 11                 x                    int       Used to store value of
*                                                   h in it to be used in 
*                                                   function polygon()
* 12                 y                    int       Used to store value of
*                                                   z in it to be used in 
*                                                   function polygon()
* 13                 a                    int       Used to store value of
*                                                   e in it to be used in 
*                                                   function polygon() */
