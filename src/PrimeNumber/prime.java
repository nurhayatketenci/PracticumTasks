package PrimeNumber;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  System.out.println("Bir sayi girin : ");
	  int num=input.nextInt();
      for(int i=2 ; i<=num ; i++) {
    	  if(primeNum(i , 2)) {
    		  if(i == num) {
        		  System.out.println(num+" sayisi asaldir");
                   break;
    		  }
    		  else {
    			  System.out.println(num+ " sayisi asal degildir");
                  break;
    		  }
    	  }
      }
	}
	public static boolean primeNum(int num ,int counter) {
	 if(num <= 2 ) {
		 return (num==2) ? true :false;
	 }
	 if(num % counter ==0) {
		 return false;
	 }
	 if(counter * counter > num) {
		 return true;
	 }
	 return primeNum(num,counter+1);
	}

}
