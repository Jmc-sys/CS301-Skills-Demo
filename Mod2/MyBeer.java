public class MyBeer {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int sims = 1000;
		int win = 0;
		for (int w = 0; w < sims; w++) {
			int[] beers = new int[n];
			
			for (int i = 0; i < n; i++) {
				beers[i] = i;
			}
			for (int i = 0; i < n; i++) {
				int rand = i + (int)(Math.random()*(n - i));
				int x = beers[i];
				beers[i] = beers[rand];
				beers[rand] = x;
			}
			boolean oG = false;
			for (int i = 0; i < n; i++) {
				if(beers[i] == i) {
					oG = true;
					break;
				}
			}
			if (oG) {
				win++;
			}
		}
		double ratio = 100 * ((double) win / sims);
		System.out.println(win + "/" + sims + " = " + ratio + "% Chance");
	}
}

