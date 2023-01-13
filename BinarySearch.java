import java.util.Scanner;

public class BinarySearch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to find");
        int n = sc.nextInt();
        int a[] = {1,2,3,4,6,7,9,10,13,14};
        int f = 0;
        int l = 0, u = 9;
        while (l<=u)
        {
            int m = (l+u)/2;
            if(a[m] < n)
            l = m + 1;
            else if(a[m] > n)
            u = m - 1;
            else
            {
            f = 1;
            break;
            }
        }
        if(f == 1)
        System.out.println("Element found");
        else
        System.out.println("Element not found");
        sc.close();
    }    
}
