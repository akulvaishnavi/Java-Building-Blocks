public class PN100
{
    public static void main (String args [])
    {
        int c = 0;
        int t = 0;;
        int sum = 0;
        for (int i = 1;i <=100; i++)
        {
            for (int l = 1; l <=i; l++)
       {
        if (i / l == 1)
        {
             c++;
        }
        t = c;
       }
        if (t == 2)
        {
            sum = sum + i;
        }
     }
     
  System.out.println("The sum is " + sum);
 }
}
