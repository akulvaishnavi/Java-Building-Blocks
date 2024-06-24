import java.util.Scanner;
public class Armstrong
  {
      public static void main (String args[])
        {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number");
          int no = sc.nextInt();
          int sum = 0, t = no;
          while(no > 0)
            {
              int sad = no % 10;
              sum = sum + (int) Math.pow(sad,3);
              no = no / 10;
            }
          if(sum == t)
          {
            System.out.println("Number is an Armstrong Number");
          }
          else
          {
            System.out.println("Number is NOT Armstrong Number");
          }
        }
  }     
