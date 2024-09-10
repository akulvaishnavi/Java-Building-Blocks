/* Program to store quiz attempts of students and then finding the 
 * correct answers of each student */

import java.util.Scanner; // Scanner class imported from java.util package
public class QuizDemo
{
public static void main(String args[]) // Main method declared
{
Scanner sc=new Scanner(System.in); // Declaring object to use Scanner class
System.out.println("Enter the number of participants"); // Asking user for number of participants
int n=sc.nextInt(); // Accepting value from user
char p[][]=new char[n][5]; // Array for students and their answers
char key[]=new char[5];
int arr[]=new int[n]; // Array for number of correct answers
if(n>=3 && n<=11) // students are between 3 and 11
{
for(int i=0;i<n;i++) // for loop to accept value from user
{
System.out.println("Enter ans for Participant  "+(i+1));
for(int j=0;j<5;j++)
{
p[i][j]=sc.next().charAt(0); // Answers of students is entered
}
}
System.out.println("Enter ans key");
for(int i=0;i<5;i++) // for loop to accept value from user
{
key[i]=sc.next().charAt(0); // Answer key is entered
}
for(int i=0;i<n;i++) // for loop to accept value from user
{
for(int j=0;j<5;j++)
{
System.out.print(p[i][j]+" "); // Answers are shown to user
}
System.out.println();
}
for(int i=0;i<5;i++)
{
System.out.print(key[i]+" "); // key is is hown to user
}
int max=0,index=0;
for(int i=0;i<n;i++) // for loop to find no. of correct answer
{
int count=0;          
for(int j=0;j<5;j++)
{
if(p[i][j]==key[j]) // if char of ans is same as that of key
{
count++; // no. of correct answers increases by 1
}
}
arr[i]=count;//correct answer is stored
if(max<=count)//if max is less than count
max=count;//it becomes the new maximum
}
for(int i=0;i<n;i++)//for loop to show participants and their scores
{
System.out.println("Participant"+(i+1)+" Scores"+arr[i]);
}
for(int i=0;i<n;i++)//for loop to show the maximum score
{
if(arr[i]==max)//if max score is same as that of a student
{
System.out.println("Participant"+(i+1));//student with max marks is
                                        //shown
}
}
}
else//if students are less than 3 or more than 11
{
System.out.println("Invalid Out of Range");//error message is shown
System.exit(0);
}
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                p[][]                int       Array for students 
 *                                                  and their answers
 *  2                   n                 int       Used to store number 
 *                                                  of participants
 *  3                 key[]               int       Used to store answer
 *                                                  key 
 *  4                arr[]                int       Used to store correct
 *                                                  ans of each student
 *  5                  i                   int      Used for initialization
 *                                                  of variable in for loop
 *  6                  j                   int      Used for initialization
 *                                                  of variable in for loop
 *  7                max                   int      Used for storing 
 *                                                  highest no of answers
 *                                                  of a student
 *  8               count                  int      Used as a counter
 *                                                  variable to find the no.
 *                                                  of correct answers of a 
 *                                                  student
 */
