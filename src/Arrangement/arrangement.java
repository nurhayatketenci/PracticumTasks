package Arrangement;

import java.util.Scanner;

public class arrangement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Kac adet sayı girilecek: ");
		int count=input.nextInt();
		int [] arr=new int[count];
		for(int i=0 ; i < count ; i++) {
			System.out.println(i+ " . sayiyi giriniz:");
			arr[i]=input.nextInt();
		}
		int temporary=0;
		for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] > arr[i]) {
                	temporary = arr[i];
                	arr[i] = arr[j];
                	arr[j] = temporary;
                }
            }
        }
		
		 for(int i = 0; i < arr.length; i++)
	        {
	            System.out.println( arr[i]);
	        }
	}

}
