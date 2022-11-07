package Login;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String passwordData="123456" ;
		
		System.out.println("kullanici adi giriniz: ");
		String userName=input.nextLine();
		
		System.out.println("Sifrenizi giriniz: ");
		String password=input.nextLine();
		int select=0;
		boolean status=(password == passwordData ? true : false);
		
		if(!status) {
   			System.out.println("Sifre sifirlamak istiyor musunuz ? \n1:Evet \n2:Cik");
   			int control=input.nextInt();
   			if(control==1) {
   		    System.out.println("Yeni sifreyi giriniz : ");
   		    String newPasss=input.nextLine();
			
   			}
		}
	}
}


