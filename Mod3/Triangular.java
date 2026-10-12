public class Triangular{
	
	public static boolean areTriangular (double x, double y, double z) {
		if(x > 0 && y > 0 && z > 0){
			if(x < y + z && y < x + z && z < x + y){
				return true;
			}
		}
		return false;
	}

	public static void main (String[] args) {
		System.out.println("Test Sides 3, 4, 5 :" + areTriangular(3, 4, 5));
		System.out.println("Test Sides 2, 4, 6 :" + areTriangular(2, 4, 6));
		System.out.println("Test Sides 5, 5, 5 :" + areTriangular(5, 5, 5));
		System.out.println("Test Sides 0, 4, 5 :" + areTriangular(0, 4, 5));
		System.out.println("Test Sides 3, 0, 5 :" + areTriangular(3, 0, 5));
		
	}
}




