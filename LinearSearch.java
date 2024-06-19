import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int key = sc.nextInt();

        int result = linearSearch(array, key);

        if (result == -1) 
        {
            System.out.println("Element not found in the array.");
        } 
        else 
        {
            System.out.println("Element found at index: " + result);
        }
      
        sc.close();
    }
  
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; 
            }
        }
        return -1;
    }
}

