package FlightTicket;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int age,voyageType;
		double totalPrice;
		System.out.println("Mesafeyi giriniz : ");
		double distance=input.nextDouble();
		
		System.out.println("Yasinizi giriniz : ");
		age=input.nextInt();
		
		System.out.println("Yolculuk tipini giriniz : \n1:Tek yon \2:Gidis donus");
		voyageType=input.nextInt();

		totalPrice=distance*0.1;
		boolean status=(distance > 0 && age > 0 && voyageType==1 || voyageType==2) ? true : false;
		
		if(!status) {
			System.out.println("Hatali veri girdiniz!!");
		}
		else {
            if(age < 12) {
            	totalPrice=totalPrice*0.5;
            }
            if(age > 12 &&  age < 24) {
            	totalPrice=totalPrice-(totalPrice*0.1);
            }
            if(age > 65) {
            	totalPrice=totalPrice-(totalPrice*0.3);
            }
            if(voyageType == 2) {
            	totalPrice=(totalPrice-(totalPrice*0.2))*2;
            }
		}
		System.out.println("Toplam " +totalPrice);
		

	}

}
