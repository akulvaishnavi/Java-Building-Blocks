import java.util.*;
public class MergeSort
{
    static int partition(int a[], int s, int e)
    {
        int piv = a[e];
        int i = s - 1;
        for(int j = s; j < e; j++)
        {
            if(a[j] < piv)
            {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[e];
        a[e] = t; 
        return (i+1);
    }
    void quick(int a[], int s, int e)   
{  
    if (s < e)  
    {  
        int p = partition(a, s, e);
        quick(a, s, p - 1);  
        quick(a, p + 1, e);  
    }  
}  
void display(int a[], int n)
{
    for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
}
    public static void main(String args[])
    {
        QuickSort qs = new QuickSort();
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int a[] = new int[n];
        System.out.println("Enter Elements in array");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        qs.display(a,n);
        qs.quick(a,0,n-1);
        qs.display(a,n);
        sc.close();
    }
}