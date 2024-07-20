/* Program to find area of cube and cuboid using Constructor Overloading*/
import java.util.Scanner;//Scanner class imported from java.util package
public class Box
{
    double width,height,depth;//instance variables declared
    Box(double w, double h, double d)//First Constructor declared
    {
        width = w;//initial value
        height = h;//given to
        depth = d;//Instance variables
    }
    double volume()//function volume declared
    {
        return width*height*depth;//value of volume is returned
    }
    Box(double l)//Second Constructor declared
    {
        width=height=depth=l;//value of l given to all instance variables
    }
    public static void main(String args[])// Main method declared
    {
Scanner sc = new Scanner(System.in);//Declaring object to use Scanner class
        System.out.println("Enter height");//Asking user for height
        double h = sc.nextDouble();//Accepting value from User
         System.out.println("Enter width");//Asking user for width
        double w = sc.nextDouble();//Accepting value from User
         System.out.println("Enter depth");//Asking user for depth
        double d = sc.nextDouble();//Accepting value from User
        if(h==w && w==d)//if height,width and depth are all same
        {
        Box b1 = new Box(h);//Constructor with one value is invoked
double vol = b1.volume();//volume returned value is stored in variable vol
        System.out.println("The volume is " + vol);//volume is displayed
    }
        else//otherwise
        {
        Box b2 = new Box(w,h,d);//Constructor with 3 values is invoked
double vol = b2.volume();//volume returned value is stored in variable vol
        System.out.println("The volume is " + vol);//volume is displayed
    }
}
}
/* Variable Description table
 * S.No         Variable Name           Data Type          Description
 *  1               width                double       Used to store value 
 *                                                    of w in constructor
 *  2               height               double       Used to store value 
 *                                                    of h in constructor
 *  3               depth                double       Used to store value 
 *                                                    of d in constructor
 *  4                 w                  double       Used to accept and 
 *                                                    store value of 
 *                                                    width from user 
 *  5                 h                  double       Used to accept and 
 *                                                    store value of 
 *                                                    height from user 
 *  6                 d                  double       Used to accept and 
 *                                                    store value of 
 *                                                    depth from user
 *  7                vol                 double       Used to store the 
 *                                                    returned value of 
 *                                                    the volume
 */  
