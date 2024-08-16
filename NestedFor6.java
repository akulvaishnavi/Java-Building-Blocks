/* Program to print the following pattern:-
* 1
* 12
* 123
* 1234.... */
public class NestedFor6
{
public static void main (String args [])// Main method declared
{
int n = 9;
for(int i = 1; i <= n; i++)//First for loop for number of columns and rows
{
    for (int j = 1; j <= i; j++)//Second for loop for printing pattern
    {
    System.out.print(j + " ");//numbers of one line are printed
}
System.out.println();//line breaks here
}
}
}
/* Variable Description table
* S.No         Variable Name           Data Type          Description
*  1                 n                    int        Used to store value     
*                                                    till loop will execute
*  2                 i                    int        Used to check working 
*                                                    of first loop;till when
*                                                    will loop work  
*  3                 j                    int        Used to check working 
*                                                    of second loop;till 
*                                                    when will loop work
*/
