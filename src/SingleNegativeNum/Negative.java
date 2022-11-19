package SingleNegativeNum;

import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		int total  = 0;
		int num;
		
		do {
			System.out.print("Sayıyı giriniz : ");
			num = input.nextInt();
			if(num % 2 == 1) {
				break;
			}
			else if (num % 4 == 0) {
				total +=num;
			}			
		 }
		 while(num % 2 == 0);
		 System.out.println("Toplam  : " + total);

	}

}
