package Taximeter;

import java.util.Scanner;

public class taximeter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Km giriniz : ");
		double distance=input.nextDouble();
		double km=2.20;
		double totalPrice=0;
		totalPrice=(km*distance)+10;
		System.out.println((totalPrice>20) ? "Odenecek tutar :"+totalPrice : "Odenecek tutar : 20");
	}

}
