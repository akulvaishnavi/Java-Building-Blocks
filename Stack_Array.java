/* Program to stack array with elements with option to later
pop them out*/

import java.util.Scanner; // Scanner class imported from java.util package
public class Stack_Array
{
int s[];
int size;
int top;
Stack_Array(int capacity)//Constructor to give value 
//to instance variables
{
size=capacity;//size is now 5
s=new int[size];
top=-1;
}   
public void push(int element)//function to push element into array in 
                            //the form of stack 
{
if(top==size-1)//if top element is equal to last element of array
{
System.out.println("Overflows");//array will be overflows
}
else//otherwise
{
top=top+1;//element added
s[top]=element;//to the top
}
display();//array is displayed
}
public void pop()//function to pop outermost element
{
if(top==-1)//if there is no element in array
{
System.out.println("Underflows");//array will be underflows
}
else//otherwise
{
int v=s[top];//topmost element
System.out.println("Element popped "+v);//is poppped
top=top-1;
}
display();//array is displayed
}
public void display()//function to display array
{
for(int i=top;i>=0;i--)
{

System.out.println(s[i]);//array is displayed
}
}      
public static void main(String args[])//Main method declared
{
Scanner sc=new Scanner(System.in);//Declaring object to use Scanner class
Stack_Array st=new Stack_Array(5);//Declaring object to use Stack_Array
                                 //class
int choice=0;
do{//do while loop for completion of process after posting menu
System.out.println("1.Push");//menu
System.out.println("2.pop");
System.out.println("3.exit");
System.out.println("Enter ur choice");//Asking user for choice
choice=sc.nextInt();//Value is entered by user
switch(choice)//switch is declared with choice as equality variable
{
case 1://1st case is for push
System.out.println("Enter element");//Asking user for element
int element=sc.nextInt();//Value is entered by user
st.push(element);//push function is called
break;
case 2:
st.pop();//pop function is called
break;
case 3:
System.exit(0);//program is exited
default:
System.out.println("Invalid choice");//error message is shown
}
System.out.println("Do you want to continue");//user asked for
                                             //continuation
choice=sc.nextInt();//Value is entered by user
}while(choice==1);//loop continues if choice is equal to 1
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                s[]                  int           Used for storing the
 *                                                      stacked elements
 *  2               size                  int           Used for storing the
 *                                                      size of array
 *  3                top                  int           Used to store top-
 *                                                      most position of an
 *                                                      array at a point
 *  4              capacity               int           Formal parameter in
 *                                                      Constructor
 *  5               element               int           Formal parameter in
 *                                                      Constructor and 
 *                                                      used to store value
 *                                                     of element from user
 *  6                 v                   int           Used to store the
 *                                                      copy of the topmost
 *                                                      element
 *  7                i                   int        Used for initialization
 *                                                  of variable in for loop
 *  8             choice                  int           Used to store the
 *                                                      choice of user for
 *                                                      both push or pop &
 *                                                      for continuation of
 *                                                      process */
