public class Circles {
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		double prob = Double.parseDouble(args[1]);
		double minR = Double.parseDouble(args[2]);
		double maxR = Double.parseDouble(args[3]);
		
		for(int i = 0; i < num; i++){
			double x = Math.random();
			double y = Math.random();
			
			double rad = minR + (double)Math.random() * (maxR - minR);
			
			if(Math.random() < prob){
				StdDraw.setPenColor(StdDraw.BLACK);
			}else{
				StdDraw.setPenColor(StdDraw.WHITE);
			}
			StdDraw.filledCircle(x, y, rad);
		}
		
	}
}
