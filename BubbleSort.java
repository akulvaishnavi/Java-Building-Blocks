import java.util.Scanner;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int a[] = new int[n];
        System.out.println("Enter Elements in array");
        for(int i = 0; i < 10; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < (n-i-1); j++)
            {
                if(a[j+1] < a[j])
                {
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println();
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }    
}    
