/* Program to show no. and type(6,12,48) of cartons used to cover boxes
 * E.G - If boxes = 726
 * No. of 48 box cartons = 15
 * No. of 24 boc cartons = 0
 * No. of 12 box cartons = 0
 * No. of 6 box cartons = 1
 * Remaining boxes = 0
 * Total number of boxes = 16 */

import java.util.Scanner; // Scanner class imported from java.util package
public class Carton
{
int s,t,tf,f,r; // Instance Variables Declared
void div(int a) // Function div declared
{
r = a; // variable a gets the value of number of boxes
f = r/48; // dividing by 48 shows how many 48 box cartons are required
r = r%48; // remainder gives us the boxes left to be covered
tf = r/24; // dividing by 24 shows how many 24 box cartons are required
r = r%24; // remainder gives us the boxes left to be covered
t = r/12; // dividing by 12 shows how many 12 box cartons are required
r = r%12; // remainder gives us the boxes left to be covered
s = r/6; // dividing by 6 shows how many 6 box cartons are required
r = r%6; // remainder gives us the boxes left to be covered(by 1 carton)
}
void print(int a) // Function display declared
{
System.out.println("No of cartons = " + a); // no. of cartons
System.out.println("No. of 6 box cartons used = " + s); // no. of all
System.out.println("No. of 12 box cartons used = " + t); // types of 
System.out.println("No. of 24 box cartons used = " + tf); // cartons are
System.out.println("No. of 48 box cartons used = " + f); // shown to user
System.out.println("Remaining boxes = " + r); // remaining boxes are shown
if(r == 0) // if remaining boxes are 0
System.out.println("Total number of cartons used = " + (s+t+tf+f)); // carton no. is not increased
else // otherwise
System.out.println("Total number of cartons used = " + (s+t+tf+f+1)); // carton no. is increased
}
public static void main(String args[]) // Main method declared
{
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class
System.out.println("Enter no. of boxes"); // Asking user for no. of boxes
int n = sc.nextInt(); // Getting value from user
Carton car = new Carton(); // Declaring object to use Carton class
car.div(n); // function div is called with value of n passing to it
car.print(n); // function div is called with value of n passing to it
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                 s                    int        Used to store no. of
 *                                                    6 box cartons used
 *  2                 t                    int        Used to store no. of
 *                                                    12 box cartons used
 *  3                tf                    int        Used to store no. of
 *                                                    24 box cartons used
 *  4                 f                    int        Used to store no. of
 *                                                    48 box cartons used
 *  5                 r                    int        Used to store the 
 *                                                    same value as 
 *                                                    variable a & used to
 *                                                    show number of boxes
 *                                                    left
 *  6                 a                     int       Used to accept and 
 *                                                    store the number 
 *                                                    of boxes to be 
 *                                                    covered */
