package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		   Scanner input=new Scanner(System.in);
		   
	       System.out.println("Birinci sayi giriniz");
	       int numberOne=input.nextInt();
	       
	       System.out.println("Ikinci sayi giriniz");
	       int numberTwo=input.nextInt();
	       
	       System.out.println("Islemi seciniz: \n 1:Toplama \n 2:Cikarma \n 3:Carpma \n 4:Bolme ");
	       int selected=input.nextInt();
	       
	       switch(selected) {
		       case 1:
		    	   System.out.println("islem sonucu : "+(numberOne+numberTwo));
		           break;
		       case 2:   
		    	   System.out.println("islem sonucu : "+(numberOne-numberTwo));
		           break;
		       case 3:   
		    	   System.out.println("islem sonucu : "+(numberOne*numberTwo));
		           break; 
		       case 4:   
		    	   System.out.println("islem sonucu : "+(numberOne/numberTwo));
		           break;
		       default:
		    	   System.out.println("Gecersiz sayilar");
		          
	       }


	}

}
