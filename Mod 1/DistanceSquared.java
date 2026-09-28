public class DistanceSquared {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int distsqrd = Integer.sum((x*x),(y*y));
		System.out.println("Distance Squared = " + distsqrd);
	}
}
