package InvertedTriangle;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// Declaring and initializing variable to
        // Size of the pyramid
		System.out.println("Enter the number");
        int number = input.nextInt();
  
        int i = number, j;
        while (i > 0) {
            j = 0;
            // Inner loop
            while (j++ < number - i) {
                // Print whitespaces
                System.out.print(" ");
            }
            j = 0;
            // Condition check
            while (j++ < (i * 2) - 1) {
                // Print star
                System.out.print("*");
            }
  
            // By now, we reach end of execution for one row
            // so next line
            System.out.println();
            i--;
        }

	}

}
