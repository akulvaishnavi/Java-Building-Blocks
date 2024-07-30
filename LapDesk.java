import java.util.Scanner;
public class LapDesk
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        String name,address,PC_type;
        double aop;
        double dis;
        System.out.println("Enter Name");
        name = sc.next();
        System.out.println("Enter Address");
        address = sc.next();
        System.out.println("Enter PC Type");
        PC_type = sc.next();
        System.out.println("Enter Purchase Amount");
        aop = sc.nextDouble();
        char ch = PC_type.charAt(0);
        if(ch == 'l' || ch == 'L')
        {
        
            
            if (aop>0 && aop <=25000)
            {
                dis = aop * 0;
                aop = aop - dis;
                System.out.println("Net Amount" + aop);
            }
            if (aop>25000 && aop <=57000)
            {
                dis = aop * 0.05;
                aop = aop - dis;
                System.out.println("Net Amount" + aop);
            }
             if (aop>57000 && aop <=100000)
            {
                dis = aop * 0.75;
                aop = aop - dis;
                System.out.println("Net Amount" + aop);
            }
            if (aop > 100000)
            {
            dis = aop * 0.1;
                aop = aop - dis;
                System.out.println("Net Amount" + aop);
            }
        }
         if(ch == 'd' || ch == 'D')
        {
        
           if (aop>0 && aop <25000)
            {
                dis = aop * 0.05;
                aop = aop - dis;
                System.out.println("Net Amount" + aop);
            }
           if (aop>25000 && aop <=57000)
            {
                dis = aop * 0.76;
                aop = aop - dis;
                System.out.println("Net Amount" + aop);
            }
            if (aop>57000 && aop <=100000)
            {
                dis = aop * 0.1;
                aop = aop - dis;
                System.out.println("Net Amount" + aop);
            }
             if (aop > 100000)
            {
                dis = aop * 15/100d;
                aop = aop - dis;
                System.out.println("Net Amount" + aop);
            }
        
    }
}
}
