package BodyMassIndex;

import java.util.Scanner;

public class MassIndex {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		System.out.println("Boyunuz : ");
		double height=input.nextDouble();
		
		System.out.println("Kilonuz : ");
		double weight=input.nextDouble();
		
		double index=weight / (Math.pow(height, 2));
		System.out.println("Vucut kitle indeksiniz :"+index);
		

	}

}
