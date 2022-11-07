package NoteAvarage;

import java.util.Scanner;

public class Avarage {

	public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  String [] lessonArr= {"Matematik", "Fizik", "Turkce", "Kimya", "Muzik"};
	  int j=0 , total=0 , note=0 ,avarage;
	  String message="";
	  for(int i=0 ; i < lessonArr.length ; i++) {
		  System.out.print(lessonArr[i]+" dersinin notunu giriniz : ");
		  note=input.nextInt();
		  if(note > 0 && note<100) {
			  total +=note;
			  j++;
		  }
	  }
	  avarage=total/j;
	  message=avarage > 55 ? avarage+ " Ortalamayla Sinifi Gecti" :  avarage+ " Ortalamayla Sinifta Kaldi";
	  System.out.println(message);

	}

}
