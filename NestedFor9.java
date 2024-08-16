import java.util.Scanner;
public class NestedFor9
{
   public static void main (String args [])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no");
       int x = sc.nextInt();
       for(int i = 1; i <=x; i++)
       {
          for(int j = i; j >=1; j--)
          {
              System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
