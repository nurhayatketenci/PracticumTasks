package CinZodyagi;

import java.util.Scanner;

public class Zodyak {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dogum yilinizi giriniz : ");
		int birthYear=input.nextInt();
		int remainder=birthYear % 12;
		String [] arr= {"Maymun","Horoz","Kopek","Domuz","Fare","Okuz","Kaplan","Tavsan","Ejderha","Yilan","At","Koyun"};
		System.out.println("Cin zodyagi burcunuz: "+arr[remainder]);

	}

}
