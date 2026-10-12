public class Partition {
	public static void partition (int N, int y, String z) {
		if(N == 0){
			System.out.println(z);
			return;
		}
		
		for(int i = Math.min(N,y); i >= 1; i--){
			if(z.isEmpty()){
				partition(N - i, i, String.valueOf(i));
			}else{
				partition(N - i, i, z + " + " + i);
			}
		}
	}
	
	public static void main (String[] args) {
		if (args.length != 1){
			 System.out.println("Error: Enter one number.");
			 return;
		 }
		 
		 int N = Integer.parseInt(args[0]);
		 if(N <= 0){
			 System.out.println("Error: N must be a positive number.");
			 return;
		 }
		 partition(N, N, "");
	}
}

