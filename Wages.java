/* Program to find the wages of a worker using inheritance*/
import java.util.Scanner;//Scanner class imported from java.util package
class Worker
{
String name;
double basic;
Worker(String n, double b)//Constructor to give value to instance 
//variables
{
name = n;
basic = b;
}
void display()//Function to display the name and basic salary
{
System.out.println("The name is " + name + " & the basic is " + basic);
}
}
public class Wages extends Worker//class Wages declared which inherits
//properties from Worker class
{
int hrs;
double wage;
double rate;
Wages(String n, double b, int h, double r)//Constructor to give values
//to instance variables
{
super (n,b);//values are sent to constructor of super class for 
//initialization of variables
hrs = h;
rate = r;
}
double overtime()//function to find overtime of worker
{
return hrs * rate;
}
void display()//Function to display values to user
{
super.display();//display function of super class is executed
System.out.println("hours worked " + hrs + "rate is " + rate);
wage = overtime() + basic;
System.out.println("The wages are " + wage);
}
public static void main(String args[])// Main method declared
{
Scanner sc = new Scanner(System.in);//Declaring object to use Scanner class
System.out.println("Enter name");//Asking user for name, basic salary,
String nam = sc.next();//hrs, rate and user enters values in variables
System.out.println("Enter basic salary");
double bas = sc.nextDouble();
System.out.println("Enter hours");
int hr = sc.nextInt();
System.out.println("Enter rate");
int rat = sc.nextInt();
Wages w = new Wages (nam,bas,hr,rat);//Declaring object to use Wages class
w.display();
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1               name                  String        Used for storing the
 *                                                      name of the worker
 *  2              basic                  double        Used for storing the
 *                                                      basic salary of the
 *                                                      worker
 *  3                n                  String          Formal parameter in
 *                                                      Constructor
 *  4                b                  Double          Formal parameter in
 *                                                      Constructor
 *  5                h                    int           Formal parameter in
 *                                                      Constructor
 *  6                r                  Double          Formal parameter in
 *                                                      Constructor
 *  7               hrs                   int           Used to store hrs
 *                                                      worked by worker
 *  8              wage                 double          Used to store total
 *                                                      wage of worker
 *  9              rate                 double          Used to store rate 
 *                                                      per hour
 * 10               nam                 String          Used to take input 
 *                                                      from user
 * 11               bas                 double          Used to take input 
 *                                                      from user
 * 12               hr                    int           Used to take input 
 *                                                      from user
 * 13               rat                   int           Used to take input 
 *                                                      from user
 */
