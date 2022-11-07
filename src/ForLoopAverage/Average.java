package ForLoopAverage;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Bir sayi giriniz");
       int number=input.nextInt();
       int total=0,count=0,average;
       for(int i=1 ; i < number ; i++ ) {
    	   if(i % 3 ==0 && i%4 == 0) {
    		   System.out.println(i);
    		   total += i;
    		   count++;
    	   }
       }
       average= total / count;
	   System.out.println(average);

       
	}

}
