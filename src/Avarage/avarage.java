package Avarage;

import java.util.Scanner;

public class avarage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik giriniz : ");
		int matematik=input.nextInt();
		
		System.out.println("Fizik giriniz : ");
		int fizik=input.nextInt();
		
		System.out.println("Kimya giriniz : ");
		int kimya=input.nextInt();
		
		System.out.println("Turkce giriniz : ");
		int turkce=input.nextInt();
		
		System.out.println("Tarih giriniz : ");
		int tarih=input.nextInt();
		
		System.out.println("Muzik giriniz : ");
		int muzik=input.nextInt();
		
		int avarage=(matematik+fizik+turkce+kimya+tarih+muzik)/6;
		System.out.println((avarage > 60) ? "Sinifi gecti" : "Sinifta kaldi");
		
		

	}

}
