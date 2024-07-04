import java.util.Scanner;
public class AndOrXor
{
    public void and (int a,int b)
    {
        int d = a & b;
        System.out.println(d);
    }
    public void or (int a, int b)
    {
        int d = a | b;
        System.out.println(d);
    }
    public void xor (int a, int b)
    {
        int d = a ^ b;
         System.out.println(d);
        }
        public static void main (String args [])
        {
            Scanner sc = new Scanner(System.in);
            AndOrXor aox = new AndOrXor();
            System.out.println("Enter first number");
            int x = sc.nextInt();
            System.out.println("Enter second number");
            int y = sc.nextInt();
            System.out.println("Enter Choice (1. And Operator, 2. Or Operator, 3. Xor Operator)");
            int akul = sc.nextInt();
            switch (akul)
            {
                case 1:
                aox.and(x,y);
                break;
                case 2:
                aox.or(x,y);
                case 3:
                aox.xor(x,y);
                break;
                default:
                System.out.println("Invalid");
            }
        }
}
