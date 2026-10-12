public class SAT {
	
	public static void main (String[] args) {
		//double a = 20000.0;
		//double admit = 5000.0;
		//double cutrate = 1 - (admit / a);
		
		double mean = 1200.0;
		double stdDev = 100.0;
		//This link is for finding the normal distribution with a cutrate of .75
		//https://www.statscalculators.com/calculators/probability/inverse-normal-distribution-calculator
		//
		
		double x = 0.6745;
		double lowScore = mean + x * stdDev;
		
		System.out.println("Low Score Cutoff: " + lowScore);
	}
}

