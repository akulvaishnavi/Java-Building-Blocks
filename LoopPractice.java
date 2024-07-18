/* Program to execute the following sum of series
 * 1. sum = 1-x^2/2+x^4/4...... upto n terms
 * 2. sum = 1+4+9+16.....upto n terms
 */
import java.util.Scanner;//Scanner class imported from java.util package
public class LoopPractice
{
   public static void main(String main[])// Main method declared
   {
     Scanner sc = new Scanner(System.in);// Declaring object to use Scanner
                                        //class
     LoopPractice lp = new LoopPractice();// Declaring object to use 
                                         //LoopPractice class
     System.out.println("Enter x");//Asking user for value of x
     double x = sc.nextDouble();//Accepting value from User
     System.out.println("Enter n1");//Asking user for value of n1
     double n1 = sc.nextDouble();//Accepting value from User
     System.out.println("Enter n2");//Asking user for value of n2
     double n2 = sc.nextDouble();//Accepting value from User
     lp.one(x,n1);//Calling function one & passing values of x and n1 to it
     lp.two(n2);//Calling function two and passing values of n2 to it
    }
    public void one(double x,double n)//function one declared
    {
        double sum = 1.0;   
        double y = 2;
        double f = 1.0;
for(int i = 1; i<= n;i++)//for loop declared for until the sum of series 
//will work
        {
            for(int j = 1; j <=y;j++)
            {
                f = f * j;
            }
if(i % 2 == 0)//if the loop is on an even number
{
           sum = sum +(Math.pow(x,y))/ f;//x raised to the powery, divided 
           //by y will be Added to sum 
}
else//otherwise
{
  sum = sum - (Math.pow(x,y))/ f;//x raised to the powery, divided by y 
  //will be Added to sum
}
y += 2;//y is incremented by 2
}
System.out.println("The sum is" + sum);//sum is shown to user
}
public void two(double n)//function two declared
{
    int z = 1; double sum = 0;
    for(int i = 1; i <=n; i++)//for loop declared for until the sum of 
    //series will work
    {
    sum = sum + (Math.pow(z,2));//sq of z is added to sum  
    z++;//z is incremented by 1
}
System.out.println("The sum is " + sum);//sum is displayed to user
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1                 x                  double       Used to accept and 
 *                                                    store its value 
 *                                                    from user and it 
 *                                                    is the number 
 *                                                    which is raised to
 *                                                    the power 'y' in 
 *                                                    the function one
 *  2                 n1                 double       Used to accept and
 *                                                    store its value
 *                                                    from user and its
 *                                                    value is passed to
 *                                                    function one, where
 *                                                    it determines the 
 *                                                    length of sum of 
 *                                                    series
 *  3                 n2                 double       Used to accept and
 *                                                    store its value 
 *                                                    from user and its
 *                                                    value is passed to
 *                                                    function two, where
 *                                                    it determines the 
 *                                                    length of sum of 
 *                                                    series
 *  4                 n                  double       Used in function one
 *                                                    and two to determine
 *                                                    the length of sum of
 *                                                    series
 *  5                sum                 double       Used in function one
 *                                                    and two to store the
 *                                                    value of sum of 
 *                                                    series
 *  6                 y                  double       Used in function one
 *                                                    as exponent of x and
 *                                                    divsor of x^y
 *  7                 z                  double       Used in function two
 *                                                    as number whose sq is
 *                                                    added to sum
 */
