package fibonacci;

import java.util.Scanner;

public class fibonacci {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
  
        return fib(n - 1)
            + fib(n - 2);
    }
  
    public static void main(String args[])
    {
    	Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
        int number = input.nextInt();
  
        for (int i = 0; i < number; i++) {
  
            System.out.print(fib(i) + " ");
        }
    }
}
