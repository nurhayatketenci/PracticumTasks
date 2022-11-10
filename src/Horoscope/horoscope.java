package Horoscope;

import java.util.Scanner;

public class horoscope {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dogdugunuz gun : ");
		int day=input.nextInt();
		System.out.println("Dogdugunuz ay : ");
		int month=input.nextInt();
		String horoscope=" ";
		
		if(month==1){
            if(day<=19){horoscope="oğlak";}
            if(day>19){horoscope="kova";}
        }
        if(month==2){
            if(day<=18){horoscope="kova";}
            if(day>18){horoscope="balık";}
        }
        if(month==3){
            if(day<=19){horoscope="balık";}
            if(day>19){horoscope="koç";}
        }
        if(month==4){
            if(day<=19){horoscope="koç";}
            if(day>19){horoscope="boğa";}
        }
        if(month==5){
            if(day<=20){horoscope="boğa";}
            if(day>20){horoscope="ikizler";}
        }
        if(month==6){
            if(day<=21){horoscope="ikizler";}
            if(day>21){horoscope="yengeç";}
        }
        if(month==7){
            if(day<=22){horoscope="yengeç";}
            if(day>22){horoscope="aslan";}
        }
        if(month==8){
            if(day<=22){horoscope="aslan";}
            if(day>22){horoscope="başak";}
        }
        if(month==9){
            if(day<=22){horoscope="başak";}
            if(day>22){horoscope="terazi";}
        }
        if(month==10){
            if(day<=22){horoscope="terazi";}
            if(day>22){horoscope="akrep";}
        }
        if(month==11){
            if(day<=21){horoscope="akrep";}
            if(day>21){horoscope="yay";}
        }
        if(month==12){
            if(day<=21){horoscope="yay";}
            if(day>21){horoscope="oğlak";}
        }
        System.out.println("Burcunuz:"+horoscope);
		

	}

}
