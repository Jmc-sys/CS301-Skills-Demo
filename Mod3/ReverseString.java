public class ReverseString {
	
	public static String rewind (String s) {
		if(s.isEmpty()) return s;
		return rewind(s.substring(1)) + s.charAt(0);
	}
	
	public static void main (String[] args) {
		if (args.length == 0){
			 System.out.println("Error: You didnt type anything.");
			 return;
		 }
		String t = String.join(" ", args);
		
		System.out.println("You entered: " + t);
		System.out.println("Now Backwards: " + rewind(t));
	}
}

