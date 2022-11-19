package ArrangementTwo;

import java.util.Scanner;

public class arrangement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array count: ");
		int count=input.nextInt();
		int [] arr=new int[count];
		//take the array values
		for(int i=0 ; i < count ; i++) {
			System.out.println((i+1)+ " . enter the number:");
			arr[i]=input.nextInt();
		}
		
		//define a temporary and assign the value we have to it one by one and sort it
		int temporary=0;
		for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < arr[i]) {
                	temporary = arr[i];
                	arr[i] = arr[j];
                	arr[j] = temporary;
                }
            }
        }
		//printing the new array
		 for(int i = 0; i < arr.length; i++)
	        {
	            System.out.println( arr[i]);
	        }

	}

}
