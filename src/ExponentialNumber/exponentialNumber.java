package ExponentialNumber;

import java.util.Scanner;

public class exponentialNumber {

	public static void main(String[] args) {
		  Scanner input=new Scanner(System.in);
		  System.out.println("Taban degeri girin : ");
		  int base=input.nextInt();
		  System.out.println("Us degeri girin : ");
		  int value=input.nextInt();
		  System.out.println(exponential(base,value));

	}
	public static int exponential(int base,int value)
	{
	   if(value == 0) {
		return 1;
	   }
	   else if(base == 1) {
		   return 1;
	   }
	   else {
			return base*exponential(base, value-1);
	   }
	}

}
