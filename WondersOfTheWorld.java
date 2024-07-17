/* Program to check if the word entered by user is a 
* wonder of the world or not */

import java.util.Scanner; // Scanner class imported from java.util package
public class WondersOfTheWorld
{
public static void main(String args[]) // Main method declared
{
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class
String wotw[] = {"Taj Mahal","Great Wall of China","Petra","Machu Picchu","Chichen Itza","Colosseum","Christ the Redeemer"}; // array wotw declared 
System.out.println("Enter element to find"); // Asking user for element
String e = sc.nextLine(); // Accepting value from user
int flag = 0;
for(int i = 0; i <= 6;i++) // for loop declared fro checking if element is present in array
{
if(e.equalsIgnoreCase(wotw[i])) // if the element is present
{
flag++; // flag is incremented
break; // break statement stops further execution of loop
}
}
if(flag ==1) // if flag is 1
{
System.out.println("Element Found"); // user is told that element is found
}
else // otherwise
{
System.out.println("Element not found");//user is told that element is not found
}
}
}
/* Variable Description table
* S.No         Variable Name           Data Type          Description
*  1               wotw                 String       Used to store the               
*                                                    wonders of the world 
*                                                    in the array
*  2                 e                  String       Used to accept and
*                                                    store the element user 
*                                                    enters
*  3                flag                  int        Used as expression to 
*                                                    terminate loop
*  4                 i                    int        Used for execution of 
*                                                    loop */
