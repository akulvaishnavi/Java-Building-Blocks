/* Program to find if the no. is evil number
* Evil number is a number whose binary form has even '1''s
* E.g:- binary form of 15 is 1111. It has 4 '1''s
* Thus 15 is a evil number */

import java.util.Scanner; // Scanner class imported from java.util package
public class EvilNumber
{
public static void main(String args[]) // Main method declared
{
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class
System.out.println("Enter number"); // Asking user for number to be checked
int n = sc.nextInt(); // Accepting value from User
String r = ""; int c = 0; // counter variable declared
for(int i = n; i > 0; i = i / 2) // for loop for finding binary of number
{
int y = i % 2;
String s = String.valueOf(y);
r = r + s; // binary of number is formed
}
StringBuffer sb = new StringBuffer(r);
sb = sb.reverse(); // actual binary is formed
for(int i = 0; i < r.length(); i++) // for loop to find no. of 1's in binary of number
{
char ch = r.charAt(i);
if(ch == '1') // if char is 1
{
c++; // counter is incremented
}
}
if(c % 2 == 0) // if counter is divisible by 2
{
System.out.println("The number is evil and binary is " + sb);//no. is evil and its binary is shown
}
else // otherwise
{
System.out.println("The number is not evil and binary is " + sb);
//number is not evil and its binary is shown
}
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                 n                    int       Used to take and store
 *                                                   a number from the user
 *  2                 r                   String     Used to store the 
 *                                                   reversed form of the 
 *                                                   binary of the number
 *  3                 c                    int       Used as counter 
 *                                                   variable to find no.
 *                                                   of 1's in binary form
 *                                                   of number
 *  4                 y                    int       Used to store a part
 *                                                   which is added to the
 *                                                   binary form of the no.
 *  5                sb                StringBuffer  Used to store the 
 *                                                   correct binary form of
 *                                                   the number
 *  6                 s                   String     Used to store the 
 *                                                   converted String from
 *                                                   int
 *  7                ch                    char      Used to store all
 *                                                   characters of the
 *                                                   String r one at a time
 *  8                 i                     int      Used as initialization
 *                                                   variable in for loop
 */
