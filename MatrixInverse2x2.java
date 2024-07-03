import java.util.Scanner;

public class MatrixInverse2x2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the 2x2 matrix:");
        
        double[][] matrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        
        double determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        
        if (determinant == 0) {
            System.out.println("The matrix is not invertible.");
        } else {
            double[][] inverse = new double[2][2];
            inverse[0][0] = matrix[1][1] / determinant;
            inverse[0][1] = -matrix[0][1] / determinant;
            inverse[1][0] = -matrix[1][0] / determinant;
            inverse[1][1] = matrix[0][0] / determinant;

            System.out.println("The inverse of the matrix is:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(inverse[i][j] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
