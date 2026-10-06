public class Stats {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		double[] num = new double[n];
		double sum = 0.0;
		
		for(int i = 0; i < n; i++){
			num[i] = StdIn.readDouble();
			sum += num[i];
		}
		
		double mean = sum / n;
		double sumsqrd = 0.0;
		
		for(int i = 0; i < n; i++){
			sumsqrd += Math.pow(num[i] - mean, 2);
		}
		
		double stdDev = Math.sqrt(sumsqrd / (n - 1));
		
		System.out.println("Mean Value: " + mean);
		System.out.println("Standard Deviation is: " + stdDev);
	}
}

