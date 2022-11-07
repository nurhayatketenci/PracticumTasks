package Arrangement;

import java.util.Scanner;

public class arrangement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Kac adet sayı girilecek: ");
		int count=input.nextInt();
		int [] arr=new int[count];
		for(int i=0 ; i < count ; i++) {
			System.out.println(i+ " . sayiyi giriniz:");
			arr[i]=input.nextInt();
		}
        
	}

}
