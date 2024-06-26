import java.util.Scanner;

public class SelectionSort 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) 
        {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) 
        {
            int min = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (array[j] < array[min]) 
                {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
