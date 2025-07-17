import java.util.Scanner;

public class PalindromeCount {

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        int count = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }

        System.out.println("Number of palindromes between " + lowerLimit + " and " + upperLimit + " is: " + count);
    }
}
