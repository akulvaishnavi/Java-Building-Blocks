import java.util.Scanner;

public class TripleX {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int levelDifficulty = 1;
        int codeA = 1 + (int)(Math.random() * levelDifficulty);
        int codeB = 1 + (int)(Math.random() * levelDifficulty);
        int codeC = 1 + (int)(Math.random() * levelDifficulty);

        int codeSum = codeA + codeB + codeC;
        int codeProduct = codeA * codeB * codeC;

        System.out.println("You are a secret agent breaking into a level " + levelDifficulty + " secure server room...");
        System.out.println("Enter the correct code to continue...");

        int guessA, guessB, guessC;

        System.out.println("+ There are 3 numbers in the code");
        System.out.println("+ The codes add-up to: " + codeSum);
        System.out.println("+ The codes multiply to give: " + codeProduct);

        guessA = scanner.nextInt();
        guessB = scanner.nextInt();
        guessC = scanner.nextInt();

        int guessSum = guessA + guessB + guessC;
        int guessProduct = guessA * guessB * guessC;

        if (guessSum == codeSum && guessProduct == codeProduct) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}
