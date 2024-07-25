/* Program to find highest rank out of the given students using 
 * inheritance and printing all the records of the students as well */

import java.util.Scanner; // Scanner class imported from java.util package
class Record
{
String name[];
int rnk[];
Record() // Constructor to give value to instance variables
{
name = new String[5];
rnk = new int[5];
}
void readvalues() // Function to enter all records of students 
{
Scanner sc = new Scanner(System.in); // Declaring object to use Scanner class
System.out.println("Enter names of students"); // Asking user for names of students
for(int i = 0; i < 5; i++)
{
name[i] = sc.next(); // Value is entered by user
}
System.out.println("Enter rank of student"); // Asking user for ranks of students
for(int i = 0; i < 5; i++)
{
rnk[i] = sc.nextInt(); // Value is entered by user
}
}
void display()//function to show values to the user
{
for(int i = 0; i < 5; i++)
{
System.out.println(name[i] + " " + rnk[i]);
}
}
}
public class Rank extends Record//class Rank declared which inherits
//properties from Record class
{
int index;
String stu;
Rank()//Constructor to give value 
//to instance variables
{
index = 0;
stu = "";
}
void highest()//function to find highest rank
{
int min = rnk[0];
stu = name[0];
for(int i = 0; i < 5; i++)
{
if(rnk [i] < min)//if rank is less than min
{
min = rnk[i];//it becomes new "highest" rank
stu = name[i];
}
}
index = min;
}
void display()//function to display values to user
{
super.display();//display function of super class is displayed 
System.out.println("Topmost rank is " + index + " and the student is " + stu); 
}
public static void main(String args[])
{
Rank ob = new Rank();//Declaring object to use Rank class
ob.readvalues();
ob.highest();
ob.display();
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1             name[]                  String        Used for storing the
 *                                                      names of the students
 *  2              rnk[]                   int          Used for storing the
 *                                                      ranks of the students
 *  3                i                     int          Used as initialization 
 *                                                      variable in for loop
 *  4              index                   int          Used to store highest 
 *                                                      rank of students
 *  5               stu                   Double        Used to store the name
 *                                                      of the highest ranked
 *                                                      student
 *  6               min                    int          Used to store least
 *                                                      leave of the given nos
 */
