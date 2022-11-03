package Greengrocer;

import java.util.Scanner;

public class greengrocer {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		double [] unitPrice= {2.14 , 3.67 , 1.11 , 0.95 , 5};
		String [] products= {"armut" , "elma" ,"domates" ,"muz" ,"patlican"};
		double [] unit=new double[products.length];
		double totalPrice=0;
		for(int i=0 ; i < products.length ; i++) {
			System.out.println(products[i] + " Kac kilo ?");
			unit[i]=input.nextDouble();
			totalPrice += unit[i]*unitPrice[i];
		}
		System.out.println("Toplam ucret :"+totalPrice);
		

	}

}
