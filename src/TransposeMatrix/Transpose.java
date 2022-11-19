package TransposeMatrix;

import java.util.Scanner;

public class Transpose {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
	    int row = 0;
        int column = 0;
	    System.out.println("Enter the number rows and columns in matrix");
	    row = input.nextInt();
	    column = input.nextInt();
    

        int matrix[][] = new int[row][column];

        System.out.println("Enter the elements matrix");
       //getting the matrix values
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Transpose entered matrix ");

        int transpose[][] = transpose(matrix);
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%s ", transpose[j][i]);
            }
            System.out.print("\n");
        }

    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int transpose[][] = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return matrix;
    }


}
