package MultiplesOfNumbers;

import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.println("Insert the number: ");
	        int number = input.nextInt();

	        // I made it more dynamic with giving the control of changing power value to the user

	        System.out.println("Which number's power do you want to get checked? : ");
	        int pow = input.nextInt();
	            for(int i = 0; i < number;i++){
	                for(int x=1;x<number;x = x*pow)
	                    if(i == x ){
	                        System.out.println(i);
	            }
	        }

	}

}
