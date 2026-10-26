import java.util.Random;
public class FindKthLargest {
	public static int findKthLargest(int[] a, int k){
		Random rand = new Random();
		int target = a.length - k;
		int low = 0, high = a.length - 1;
		
		while(low <= high){
			int swap = a[low + rand.nextInt(high - low + 1)];
			int i = low, j = high;
			while(i <= j){
				while(i <= j && a[i] < swap) i++;
				while(i <= j && a[j] > swap) j--;
				
				if(i <= j){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
					j--; 
				}
			}
			if(target <= j){
				high = j;
			}else if(target >= i){
				low = i;
			}else{
				return a[target];
			}
		}
		return a[target]; 
	}
	
	public static void main (String[] args) {
		Random rand = new Random();
		int[] a = new int[rand.nextInt(25) + 5];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(100) + 1;			
		}
		 int k = rand.nextInt(a.length) + 1;
		 
		 System.out.println(findKthLargest(a, k));
	}
}

