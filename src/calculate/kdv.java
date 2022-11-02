package calculate;

import java.util.Scanner;

public class kdv {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Fee");
		double fee=input.nextDouble();
		double kdv=1.8;
		double newFee=0;
		if(fee > 0 && fee < 1000) {
			newFee=fee+(fee*0.18);
		}
		if(fee > 1000) {
			newFee=fee+(fee*0.08);
			kdv=0.8;
		}
		
		System.out.println("Kdv siz fiyati : "+fee+
				           "\nKdv li fiyati : "+newFee+
				           "\nKdv tutari : " +kdv);
	
		
	}

}
