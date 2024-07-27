import java.util.Scanner;
public class NBEArray
{
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array(nxn)");
    int n = sc.nextInt();
    int a[][] = new int[n][n];
    if(n < 4 || n > 10)
    {
        System.out.println("Error");
        System.exit(0);
}
else
{
    System.out.println("Enter array elements");
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println();
    System.out.println("The array is -");
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    int c = 0;
    for(int i = 1; i < n-1; i++)
    {
        for(int j = 1; j < n-1; j++)
        {
            c++;
        }
    }
    int z[] = new int[c];
    int k = 0;
    for(int i = 1; i < n-1; i++)
    {
        for(int j = 1; j < n-1; j++)
        {
            z[k] = a[i][j];
            k++;
        }
    }
int min = 0;
for(int i = 0; i < z.length; i++)
{
min = i;
for(int j = i + 1;j < z.length; j++)
{
if(z[j] < z[min])
min = j;
}
int t = z[i];
z[i] = z[min];
z[min] = t;
}
int h = 0;
for(int i = 1; i < n-1; i++)
    {
        for(int j = 1; j < n-1; j++)
        {
            a[i][j] = z[h];
           h++;
        }
    }
    System.out.println();
    System.out.println("The new array is -");
for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    int sumd = 0;
for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            if(i == j || ((i+j) == (n-1)))
            sumd = sumd + a[i][j];
        }
    }
    System.out.println("The sum of diagonals is " + sumd);
}
}
}
