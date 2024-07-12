 // Program to deposit and withdraw money from an account
import java.util.Scanner; // Scanner class imported from java.util package
public class Bank
{
    String depositorName,typeOfAccount; // instance variables declared
    int accountNumber,balanceAmount;
Bank(String dn, String toa, int an, int ba) // Constructor declared
    {
     depositorName = dn; // Initial value given to all instance variables
     typeOfAccount = toa;
     accountNumber = an;
     balanceAmount = ba;
}
public void deposit(int amount) // function deposit declared
{
balanceAmount = balanceAmount + amount;//here amount is added to balance
}
public void withdraw(int amount)//function withdraw declared
{
int ba2 = balanceAmount;
balanceAmount = balanceAmount - amount;//here amount is taken from balance
if(balanceAmount < amount)//if amount is more rhan than the balance
{
System.out.println("Sorry, you can only withdraw " + ba2);
//message will come tellng only a specific value can be taken
}
}
public void display()//function display declared
{
System.out.println("The name of the depositor is " + depositorName);//all
System.out.println("The type of amount is " + typeOfAccount);//details are
System.out.println("Account number is " + accountNumber);//shown to user
System.out.println("The balance is " + balanceAmount);//here
}
public static void main(String args[])// Main method declared
{
Scanner sc = new Scanner(System.in);//Declaring object to use Scanner class
System.out.println("Enter Name");//Asking user for name
String dn = sc.next();//Accepting value from User
System.out.println("Enter Type of Account");//Asking user for account type
String toa = sc.next();//Accepting value from User
System.out.println("Enter Account Number");//Asking user for account number
int an = sc.nextInt();//Accepting value from User
System.out.println("Enter Balance");//Asking user for balance
int ba = sc.nextInt();//Accepting value from User
System.out.println("Write 1 to deposit money to account, 2 to withdraw");
//Asking user if he wants to deposit or withdraw money
int c = sc.nextInt();//Accepting value from User
switch(c)//switch case declared with variable c as expression
{
case 1://If c is 1, then these set of statements are executed
System.out.println("Enter money to deposit");//Asking user for money to be
                                             //deposited
int a = sc.nextInt();//Accepting value from user
Bank c1 = new Bank(dn,toa,an,ba);//Values are passed to
                                              //Constructor
c1.deposit(a);//deposit function is invoked with value of a getting passed
             //to it
c1.display();//display function is invoked
break;//break statement terminates statements in case
case 2://If c is 2, then these set of statements are executed
System.out.println("Enter money to withdraw");//Asking user for money to be
                                             //withdrawn
int b = sc.nextInt();//Accepting value from user
Bank c2 = new Bank(dn,toa,an,ba);//Values are passed to
                                              //Constructor
c2.withdraw(b);//withdraw function is invoked with value of b getting
             //passed to it
if(ba < b)//if balance amount is smaller than amount withdrawn
{
    break;//case is broken(no details are showed)
}
c2.display();//display function is invoked
break;//break statement terminates statements in case
}
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1           depositorName            String       Used to store value
 *                                                    of dn in constructor
 *  2           typeOfAccount            String       Used to store value
 *                                                   of toa in constructor
 *  3           accountNumber              int        Used to store value
 *                                                    of an in constructor
 *  4           balanceAmount              int        Used to store value
 *                                                    of ba in constructor
 *  5                 dn                 String       Used to accept and
 *                                                    store value of name
 *                                                    from user
 *  6                toa                 String       Used to accept and
 *                                                    store value of type
 *                                                    of account from user
 *  7                 an                   int        Used to accept and
 *                                                    store value of
 *                                                    account number from
 *                                                    user
 *  8                 ba                   int        Used to accept and
 *                                                    store value of
 *                                                    balance from user
 *  9                  c                   int        Used to accept
 *                                                    choice of user for
 *                                                    depositing or
 *                                                    withdrawing money
 *  10                 a                   int        Used to accept and
 *                                                    store value of
 *                                                    money to be
 *                                                    deposited
 *  11                 b                   int        Used to accept and
 *                                                    store value of
 *                                                    money to be
 *                                                    withdrawn
 *  12                ba2                  int        Used to store the
 *                                                    same value as that
 *                                                    of balanceAmount
 */
