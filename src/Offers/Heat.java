package Offers;

import java.util.Scanner;

public class Heat {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Hava sicakligini giriniz: ");
		double heat=input.nextDouble();
		
		if(heat < 5) {
			System.out.println("Onerilen Etkinlik Kayak");
		}
		if(heat > 5 && heat < 15) {
			System.out.println("Onerilen Etkinlik Sinema");
		}
		if(heat > 15 && heat < 25) {
			System.out.println("Onerilen Etkinlik Piknik");
		}
		else if(heat > 25){
			System.out.println("Onerilen Etkinlik Yuzme");
		}

	}

}

