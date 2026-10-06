public class Banner {
	public static void main (String[] args) {
		String s = args[0];
		int speed = Integer.parseInt(args[1]);
		
		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(0, 425);
		StdDraw.setYscale(0, 200);
		
		double x = 0.0;
		double y = 100.0;
		int rev = 1;
		while(true){
			StdDraw.clear();
			StdDraw.text(x, y, s);
			StdDraw.show();
			StdDraw.pause(speed);
			x++;
			if(x > 400){
				x = 0;
			}
			
		}
	}
}

