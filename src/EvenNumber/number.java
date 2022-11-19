package EvenNumber;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int num=input.nextInt();
		System.out.println("Cift sayilar: ");
		for(int i=0 ; i < num ;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
