package PerfectNumber;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		  Scanner input=new Scanner(System.in);
		  System.out.println("Bir sayi girin : ");
		  int num=input.nextInt();
          int total=0;
          for(int i=1 ; i < num ; i++) {
        	  if(num %i == 0) {  
  				total += i;
              }
          }
          String message=total==num ? num+" Mukemmel sayidir." : num+" Mukemmel sayi degildir.";
		  System.out.println(message);
	}

}
