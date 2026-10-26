public class BinarySearch {

	public static int binarySearch(int[] a){
		int min = 0;
		int max = a.length - 1;
		while(min <= max){
			int i = min + ((max - min) / 2);
			if(a[i] == i){
				return i;
			}else if(a[i] < i){
				min = i + 1;
			}else{
				max = i - 1;
			}
		}
		return -1;		
	}

	public static void main (String[] args) {
		int[] a = {-4, -2, 2, 4, 6, 8, 10};
		int x = binarySearch(a);
		if(x != -1) {
			System.out.println("Found index at: " + x);
		}else{ 
			System.out.println("No Match Found");
		}
	}
}

