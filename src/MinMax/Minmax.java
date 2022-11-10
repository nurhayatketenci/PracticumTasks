package MinMax;

import java.util.Scanner;

public class Minmax {

	public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Kac sayi girmek istiyorsunuz : ");
      int count=input.nextInt();
      int [] arr=new int[count];
      int smallest,biggest;
      
      for(int i=0 ; i < count ; i++) {
    	  System.out.print((i+1)+". sayiyi giriniz : ");
    	  arr[i]=input.nextInt();
      }
      
       smallest=arr[0];
       biggest=arr[0];
      
      for(int j=0 ; j < arr.length ; j++) {
    	  if(smallest > arr[j]) {
    		  smallest=arr[j];
    	  }
    	  if(biggest < arr[j]) {
    		  biggest=arr[j];
    	  }
      }
      System.out.println("En kucuk : "+smallest+"\nEn buyuk : "+biggest);

	}

}
