package CalculateHypotenuse;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Birinci kenari girin :");
		double a=input.nextDouble();
		System.out.println("Ikinci kenari girin :");
		double b=input.nextDouble();
        double hypotenuse=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(hypotenuse);
        double perimeter=a+b+hypotenuse;
        System.out.println("cevresi :"+perimeter);
		
		
		
		
		

	}

}
