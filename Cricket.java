/* Program to find out the strike rate of batsman and economy of bowler
 * Strike Rate = (runs/balls faced) * 100
 * Economy Rate = runs/overs bowled */

import java.util.Scanner; // Scanner class imported from java.util package
public class Cricket
{
public void strikerate(double r, double b) // function strikerate declared
    {
        double sr = (r/b)* 100; // strike rate is found by dividing runs by bowls and multipling it by 100
System.out.println("The Strike Rate of the batsman is " + sr); // strikerate is shown here
    }
public void economyrate(double o, double ru)
    {
        double eco = ru/o; // economy rate is found by dividing runs by overs
System.out.println("The economy rate of the bowler is " + eco); // economy rate is shown here
    }
    public static void main(String args[]) // Main method declared
    {
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class 
System.out.println("Enter runs scored by batsman"); // Asking user for runs scored
double r = sc.nextDouble(); // Accepting value from user
System.out.println("Enter balls faced by batsman"); // Asking user for balls faced
double b = sc.nextDouble(); // Accepting value from user
System.out.println("Enter overs bowled by bowler"); // Asking user for overs bowled
double o = sc.nextDouble(); // Accepting value from user
System.out.println("Enter runs conceded by bowler"); // Asking user for runs conceded
double ru = sc.nextDouble(); // Accepting value from user
Cricket cr = new Cricket(); // Declaring object to use Cricket class
cr.strikerate(r,b); // value of r and b is passed to function strikerate
cr.economyrate(o,ru); // value of o and ru is passed to function economyrate 
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                 r                 double        Used for accepting &
 *                                                    storing value of runs 
 *                                                    scored in main method 
 *                                                    and used as runs 
 *                                                    scored to take out 
 *                                                    strike rate in 
 *                                                    function strikerate
 *  2                 b                 double        Used for accepting 
 *                                                    and storing value of 
 *                                                    balls faced in main
 *                                                    method and used as 
 *                                                    balls faced to take
 *                                                    out strike rate in 
 *                                                    function strikerate
 *  3                 o                 double        Used for accepting 
 *                                                    and storing value 
 *                                                    of overs bowled in
 *                                                    main method and used
 *                                                    as overs bowled to 
 *                                                    take out economy rate  
 *                                                    in func economyrate      
 *  4                 ru                double        Used for accepting 
 *                                                    and storing value 
 *                                                    of runs conceded in
 *                                                    main method and 
 *                                                    used as runs 
 *                                                    conceded to take out
 *                                                    economy rate in 
 *                                                    function economyrate   
 */
