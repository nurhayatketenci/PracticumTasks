package Createpattern;

import java.util.Scanner;

public class pattern {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number ");
	        int num = input.nextInt();
	        int pattern = num;
	        
	        createPattern(num,pattern,true);
	    }
	    static void createPattern(int n1,int n2,boolean status){
	        int n3 =n2 ;
	        
	        System.out.print(n1+"  ");
	        
	        if (n1-5 > 0 && status){
	        	n1 -= 5;
	            createPattern(n1,n3,true);
	        }
	        
	        else {
	        	
	            if (n1 < n3){
	            	n1 += 5;
	                createPattern(n1,n3,false);
	            }
	            
	        }

	    }

}
