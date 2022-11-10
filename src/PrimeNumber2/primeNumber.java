package PrimeNumber2;

public class primeNumber {

	public static void main(String[] args) {
		int j = 0;
        for(int num = 2; num <= 100;num++)
        {
            int control=0;
            for (int i = 2; i < num; i++)
            {
               if (num % i == 0)
                {
            	   control = 1;
                    break;
                } 
            }
                
            if(control==0)
            {
                System.out.print(num+",");
                j++; 
            }
        }
	}

}
