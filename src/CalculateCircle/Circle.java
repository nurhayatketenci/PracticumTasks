package CalculateCircle;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Yaricapi giriniz : ");
		 double r,pi,centerAngle,area,circumFerence;
		 r =input.nextDouble();
		 pi=3.14;
		 System.out.println("Merkez aci olcusu giriniz : ");
		 centerAngle=input.nextDouble();
		 area=(pi*(Math.pow(r, 2))* centerAngle)/360;
		 circumFerence=2*pi*r;
		 System.out.println("Dairenin alani :" +area+"\n Dairenin cevresi : "+circumFerence);
	}
}
