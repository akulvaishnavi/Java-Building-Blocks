/* Program to enter octal values in a 2d array and then show their
* decimal values in another 2d array */
import java.util.Scanner;//Scanner class imported from java.util package
class ArrayDecimal{
int m; //number of rows in array
int n; //number of columns in array
int[][] arr;
ArrayDecimal(int m, int n)//Constructor to give value 
//to instance variables
{
this.m = m;
this.n = n;
}
boolean check()//checks limit values for array size
{ 
if(0 > m || m > 10)
return false;
if(2 > m || m>6)
return false;
arr = new int[m][n];
return true;
}
void inputArr()//asks for input
{ 
System.out.println("enter elements");
Scanner sc = new Scanner(System.in);
for(int i = 0; i<m; i++)//for loop to ask user for elements
{
for(int j = 0; j<n; j++)
{
arr[i][j] = sc.nextInt();
}
}
}
int octToDec(int[] x)//converts octal numbers in a 1d array to decimal
{// where int[] x would be a row in our main array
int num = 0;
for(int i = x.length-1; i>=0; i--)//for loop to convert to decimal
{
num = num  + (x[i] * (int)Math.pow(8, (x.length-1) - i));
}
return num;
}
void printer(){//prints the original array
for(int i = 0; i<m; i++)//for loop to print original array
{
for(int j = 0; j<n; j++)
{
System.out.print(arr[i][j] + " ");
}
System.out.println();
}
}
void calc(){//calculates and prints the required decimal values
System.out.println("Decimal:");
for(int i = 0; i<arr.length; i++)//for loop to print decimal values
{
System.out.println(octToDec(arr[i]));
//here arr[i] is a row in the main array
}
}
public static void main(String args[]){
ArrayDecimal obj = new ArrayDecimal(3,3);//Declaring object to use 
                                        //ArrayDecimal class
if(obj.check()){ //executes only if array size is valid
obj.inputArr();
obj.printer();
obj.calc();
}
else{
System.out.println("Invalid Size Values");//error message is shown
}
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                m                     int          Used for storing the
 *                                                      rows of the array
 *  2                n                     int          Used for storing the
 *                                                      columns of the array
 *  3              arr[][]                 int          Array used to store 
 *                                                      octal values
 *  4                i                    int        Used for initialization
 *                                                   of variable in for loop
 *  5                j                    int        Used for initialization
 *                                                   of variable in for loop
 *  6               x[]                   int           Formal parameter in
 *                                                      Constructor
 *  7               num                   int           Used to store the
 *                                                      converted decimal
 *                                                      no. from the octal
 *                                                      array */
