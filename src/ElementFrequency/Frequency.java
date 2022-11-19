package ElementFrequency;

public class Frequency {
	 public static void main (String[] args) {
	        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
	        int size = arr.length;
	        calculatorFrequency(arr, size);
	    }

	    static void calculatorFrequency(int[] arr, int size)
	    {

	        for (int i = 0; i < size; i++){
	            boolean status=false;
	            int count = 0;
                //if there is a member i keep checking
	            for (int j = i+1; j < size; j++){
	                if (arr[i] == arr[j]){
	                    status = true;
	                    break;
	                }
	            }

	            if (status) {
	            	continue;
	            }
	                
	            for (int j = 0;j<=i;j++){
	                if (arr[i] == arr[j])
	                    count++;
	            }
	            System.out.println(arr[i] + " number was repeated " + count + " times");
	        }
	    }

}
