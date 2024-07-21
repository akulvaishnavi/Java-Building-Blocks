/* Program to convert Decimal number to Binary, Hexadecimal or Octal
 * E.G:- Decimal 47 =
 * 2F Hexadecimal = 57 Octal = 101111 Binary  */

import java.util.Scanner; // Scanner class imported from java.util package
public class DtoBOH
{
public static void main(String args[]) // Main method declared
{
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class
System.out.println("Enter decimal number"); // Asking user for decimal no.
int n = sc.nextInt(); // Accepting value from User
System.out.println("Menu"); // Menu is shown to user
System.out.println("Press 1 for Binary Conversion");
System.out.println("Press 2 for Octal Conversion");
System.out.println("Press 3 for Hexadecimal Conversion");
System.out.println("Enter choice"); // Asking user for choice of execution
int k = sc.nextInt(); // Accepting value from User
switch(k) // switch case declared with variable k as its expression
{
case 1: // If k is 1, then these set of statements are executed
String s = "";
for(int i = n; i > 0; i = i / 2) // for loop to find remainders by division method and concatenate them
{
int r = i % 2; // remainder is stored in r
s = s + String.valueOf(r); // value of r is concated to s
}
StringBuffer sb = new StringBuffer(s);
sb = sb.reverse(); // sb is reversed
System.out.println("The Binary Form is " + sb); // correct binary form is printed
break; // break statement terminates statements in case
case 2: // If k is 2, these statements are executed
String s1=""; // variable for storing the result
char dig[]={'0','1','2','3','4','5','6','7'}; // array storing the digits (as characters) in the octal number system

while(n>0)
{
int r=n%8; // finding remainder by dividing the number by 8
s1=dig[r]+s1; // adding the remainder to the result and reversing at the same time
n=n/8;
}
System.out.println("The Octal Form is " + s1); // correct octal form is printed
break; // break statement terminates statements in case
case 3: // If k is 3, these statements are executed
String s2=""; // variable for storing the result
char dig1[]={'0','1','2','3','4','5','6','7','8','9',
'A','B','C','D','E','F'};
// array storing the digits (as characters) in a hexadecimal number system
for(; n > 0; n = n / 16)
{
int r=n%16; // finding remainder by dividing the number by 16
s2=dig1[r]+s2; // adding the remainder to the result
}
System.out.println("The Hexadecimal Form is "+s2);//correct hexadecimal form is printed
break; // break statement terminates statements in case
default: // if k is anything other than one or two 
System.out.println("Invalid"); // error statement given
}
}
}
/* Variable Description table
* S.No         Variable Name           Data Type          Description
*  1                 n                   int       Used to accept and store
*                                                  decimal no. from user
*  2                 k                   int       Used to store the option
*                                                  the user has selected
*  3                 s                  String     Used to store remainder
*                                                  which are concated after
*                                                  division method
*  4                 sb              StringBuffer  Used to store correct 
*                                                  form of binary no. after
*                                                  reversing
*  5                 s1                 String     Used to store octal form
*                                                  of decimal number
*  6                 r                   int       Used to store remainders
*  7               dig[]                 int       Used to store all octal
*                                                  numbers to be used to 
*                                                  make an octal no.
*  8                 i                   int       Used as initialization
*                                                  variable in for loop
*  9                 s2                String     Used to store hexadecimal
*                                                  form of decimal number
* 10              dig1[]                 int      Used to store all hexa-
*                                                 decimal numbers to be 
*                                                  used to make an 
*                                                  octal no. */
