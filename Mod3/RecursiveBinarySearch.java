public class RecursiveBinarySearch {
	public static boolean search(int[] numbers, int x, int low, int high){
		if(low > high) return false;
		int mid = low + ((high - low)/2);
		if(numbers[mid] == x){
			return true;
		}else if(x < numbers[mid]){
			return search(numbers, x, low, mid - 1);
		}else {
			return search(numbers, x, mid + 1, high);
		}
	}
	
	
	public static void main (String[] args) {
		int[] numbers = {3, 8, 12, 17, 21, 35, 48};
		int x;
		if(args.length == 0){
			System.out.println("Error: Missing search value.");
			return;
		}else{
			x = Integer.parseInt(args[0]); 
		}
		
		boolean found = search(numbers, x, 0, numbers.length - 1);
		
		if(found) System.out.println(true);else System.out.println(false);
		
	}
}

