/* Program to find all the anagrams of a word
 * E.g- for RED, anagrams are = RDE,EDR,ERD,DER,DRE*/

import java.util.Scanner; // Scanner class imported from java.util package
class Anagrams
{
int c = 0;     
void input()
{
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class
System.out.print("Enter a word : "); // Asking user for word
String s = sc.next(); // Accepting value from User
System.out.println("The Anagrams are : ");
display("",s); // Anagrams of word are shown here
System.out.println("Total Number of Anagrams = "+c); // No. of anagrams are shown
}   
void display(String s1, String s2) // Function to display anagrams
{
if(s2.length()<=1)
{
c++;
System.out.println(s1+s2);
}
else
{
for(int i=0; i<s2.length(); i++) // For loop to find anagrams
{
String x = s2.substring(i, i+1);
String y = s2.substring(0, i);
String z = s2.substring(i+1);
display(s1+x, y+z); // Recursive function is called
}
}
}
public static void main(String args[]) // Main method declared
{
Anagrams ob=new Anagrams(); // Object to use Anagrams class
ob.input();
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                c                     int          Used for counter 
 *                                                      variable to keep 
 *                                                      track of no. of 
 *                                                      anagrams
 *  2                s                   String         Used for storing the
 *                                                      word whose anagrams
 *                                                      are to be found
 *  3               s1                   String         Formal Parameter in
 *                                                      display function
 *  4               s2                   String         Formal Parameter in
 *                                                      display function
 *  5               x                    String         Stores 1st part of
 *                                                      anagram
 *  6               y                    String         Stores 2nd part of
 *                                                      anagram
 *  7               z                    String         Stores 3rd part of
 *                                                      anagram */
