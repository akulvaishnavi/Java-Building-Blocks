import java.util.Scanner;
public class BookFair
{
   String bname;
   double price;
   public void input()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Book Name");
       bname = sc.nextLine();
       System.out.println("Enter price");
       price = sc.nextDouble();
}
public void calculate()
{
    double d;
    if (price <=1000)
    {
        d = price * 0.02;
        price = price - d;
    }
    if (price >1000 && price <=3000 )
    {
        d = price * 0.1;
        price = price - d;
    }
    if (price >3000)
    {
        d = price * 0.15;
        price = price - d;
    }
}
public void display()
{
    System.out.println(bname);
    System.out.println(price);
}
public static void main(String args [])
{
    BookFair bf = new BookFair();
    bf.input();
    bf.calculate();
    bf.display();
}
}
    
    
