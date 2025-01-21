/* Program to find no. of Permutations or no. of
 * Combinations as per the users choice
 * (Permutation = n!/(n-r)!, Combination = n!/r!(n-r)!)
 */
import java.util.Scanner;//Scanner class imported from java.util package
public class PandC
{
    int factorial(int n)//recursive function to find factorial of number
    {
        if(n == 0)//if n = 0
        return 1;//1 is returned
        else//otherise
        return (n*factorial(n-1));//n is multiplied w factorial of n-1
    }                             //thus factorial of n is found
    public static void main(String args[])// Main method declared
    {
        Scanner sc = new Scanner(System.in);//Declaring object to use Scanner class
        PandC pc = new PandC ();//Declaring object to use PandC class
        System.out.println("Menu");//Menu with options
        System.out.println("1. Permutation");//is shown
        System.out.println("2. Combination");//to user
        System.out.println("Enter Choice");//Asking user for choice
        int c = sc.nextInt();//Accepting choice from user
        switch(c)//switch is used with c is parameter
        {
            case 1://when c is 1
            System.out.println("Enter value of n");//value of n is asked from user
            int n1 = sc.nextInt();//Accepting value from user
            System.out.println("Enter value of r");//value of r is asked from user
            int r1 = sc.nextInt();//Accepting value from user
            int a1 = pc.factorial(n1);//n! is stored in a1
            int b1 = pc.factorial(n1-r1);//(n-r)! is stored in b1
            int ans1 = a1/b1;//ans1 contains formula for permutation
            System.out.println("Answer - " + ans1);//answer is shown to user
            break;
            case 2://when c is 2
            System.out.println("Enter value of n");//value of n is asked from user
            int n2 = sc.nextInt();//Accepting value from user
            System.out.println("Enter value of r");//value of r is asked from user
            int r2 = sc.nextInt();//Accepting value from user
            int a2 = pc.factorial(n2);//n! is stored in a2
            int b2 = pc.factorial(n2-r2);//(n-r)! is stored in b2
            int c2 = pc.factorial(r2);//r! is stored in c2
            int ans2 = a2/(c2*b2);//ans2 contains formula for combination
            System.out.println("Answer - " + ans2);//answer is shown to user
            break;
            default://if c is anything else
            System.out.println("Error");//error message is shown
        }
    }
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                n                     int          Formal parameter of
 *                                                      factorial function
 *                                                      which contains 
 *                                                      value of number 
 *                                                      whose factorial is
 *                                                      to be found
 *  2                c                     int          Used to store 
 *                                                      choice of user
 *  3               n1                     int          Used to store value
 *                                                      of n in permutation
 *  4               r1                     int          Used to store value
 *                                                      of r in permutation
 *  5               a1                     int          Used to store the
 *                                                      factorial of n1
 *  6               b1                     int          Used to store the
 *                                                      factorial of (n1-r1)
 *  7               ans1                   int          Used to store answer
 *                                                      for permutation
 *  8               n2                     int          Used to store value
 *                                                      of n in combination
 *  9               r2                     int          Used to store value
 *                                                      of r in combination
 * 10               a2                     int          Used to store the
 *                                                      factorial of n2
 * 11               b2                     int          Used to store the
 *                                                      factorial of (n2-r2) 
 * 12               c2                     int          Used to store the
 *                                                      factorial of r2
 * 13               ans2                   int          Used to store answer
 *                                                      for combination
 */
