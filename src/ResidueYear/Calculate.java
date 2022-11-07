package ResidueYear;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Yil giriniz : ");
		int year=input.nextInt();
		boolean status=false;
		
		if (year %4 == 0){
			status=(year % 100 == 0 && year % 400 != 0) ? false :true ;
        }
		
		String message=status ? year + " artik bir yildir" : year +" artik bir yil degildir";
        System.out.println(message);
	}

}
