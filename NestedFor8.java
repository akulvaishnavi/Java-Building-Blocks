/* Program to print the following pattern:-
* 9
* 96
* 963
* 9630
*/
public class NestedFor8
{
public static void main (String args [])// Main method declared
{
for(int i = 9; i >=0; i -= 3)//First for loop for number of columns and rows
{
for(int j = 9; j >=i; j = j - 3)//Second for loop for printing pattern
{
  System.out.print(j + " ");//numbers of one line are printed
}
System.out.println();//line breaks here
}
}
}
/* Variable Description table
* S.No         Variable Name           Data Type          Description
*  1                 i                    int        Used to check working  
*                                                    of first loop;till when
*                                                    will loop work  
*  2                 j                    int        Used to check working 
*                                                    of second loop;till 
*                                                    when will loop work
*/
