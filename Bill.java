/*Program to find total rental charge of phone using inheritance*/
import java.util.Scanner; // Scanner class imported from java.util package
class Detail
{
String name;
String address;
long telno;
double rent;
Detail(String a, String b, long c, double d) // Constructor to give value to instance variables
{
name = a;
address = b;
telno = c;
rent = d;
}
public void show() // Function to display info to user
{
System.out.println("Name of customer - " + name);
System.out.println("Address of Customer - " + address);
System.out.println("Phone no. of customer - " + telno);
System.out.println("Total monthly rental charge is " + rent);
}
}
public class Bill extends Detail // class Bill declared which inherits properties from Detail class
{
int n;
double amt;
Bill(String a, String b, long c, double d, int e) // Constructor to give values to instance variables
{
super(a,b,c,d); // values are sent to constructor of super class for initialization of variables
n = e;
amt = 0.0;
}
void cal() // function to calculate total rental charge
{
if(n <= 100) // if calls less than 100
{
amt = rent;
}
else if(n > 100 && n <= 200) // calls less than 200, more than 100
{
amt = rent + (0.6 * n);
}
else if(n > 200 && n <= 300) // calls less than 300, more than 200
{
amt = rent + (0.8 * n);
}
else if(n > 300) // calls more than 300
{
amt = rent + n;
}
}
public void show() // Function to display values to user
{
super.show(); // show function of super class is executed
System.out.println("Total amt to be paid is " + amt);
}
public static void main(String args[]) // Main method declared
{
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class
System.out.println("Enter name"); // Asking user for name,address,tel no.
String nam = sc.next(); // fixed charge,calls and user enters values in variables
System.out.println("Enter address");
String add = sc.nextLine();
System.out.println("Enter telephone no.");
long teln = sc.nextLong();
System.out.println("Enter fixed charge");
double ren = sc.nextDouble();
System.out.println("Enter no.of calls");
int calls = sc.nextInt();
Bill b = new Bill(nam,add,teln,ren,calls); // Declaring object to use Bill class
b.cal();
b.show();
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1               name                 String         Used for storing the
 *                                                      name of the user
 *  2             address                String         Used for storing the
 *                                                      address of the user
 *  3              telno                 long           Used to store tel
 *                                                      number of the user
 *  4              rent                  double         Used to store fixed
 *                                                      monthly charge of 
 *                                                      user
 *  5                n                    int           Used to store no. of
 *                                                      calls of user
 *  6               amt                  double         Used to store total
 *                                                      amount of user
 *  7                a                   String         Formal parameter in
 *                                                      Constructor
 *  8                b                   String         Formal parameter in
 *                                                      Constructor
 *  9                c                    long          Formal parameter in
 *                                                      Constructor
 * 10                d                   Double         Formal parameter in
 *                                                      Constructor
 * 11                e                     int          Formal parameter in
 *                                                      Constructor
 * 12               nam                  String         Used to take input 
 *                                                      from user
 * 13               add                  String         Used to take input 
 *                                                      from user
 * 14               teln                 long           Used to take input 
 *                                                      from user
 * 15               ren                  double         Used to take input 
 *                                                      from user
 * 16               calls                 int           Used to take input 
 *                                                      from user
 */
