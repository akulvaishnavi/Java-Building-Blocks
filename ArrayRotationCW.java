import java.util.Scanner;
public class ArrayRotationCW
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of rows/columns (Square matrix upto 20)");
        int m = sc.nextInt();
        System.out.println("Enter Elements");
        int a[][]= new int[m][m];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m/2; i++)
        {
            for(int j = i; j < m-i-1; j++)
            {
               int temp = a[i][j];
                a[i][j] = a[m-1-j][i];  
                a[m-1-j][i] = a[m-1-i][m-1-j]; 
                a[m-1-i][m-1-j] = a[j][m-1-i];
                a[j][m-1-i]= temp; 
            }
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
