public class Rot13 {
	
	public static String rot13 (String s) {
		String e = "";
		for(int i = 0; i < s.length(); i++){
			char x = s.charAt(i);
			if(x >= 'a' && x <= 'z') x = (char)('a' + (x - 'a' + 13) % 26);
			if(x >= 'A' && x <= 'Z') x = (char)('A' + (x - 'A' + 13) % 26);
			e += x;
		}
		return e;
	}	
	
	public static void main (String[] args) {
		if(args.length > 0){
			String result = rot13(args[0]);
			//My sanity test
			//Boolean t = (result.equals("Rapelcgvba"))? true : false;
			//System.out.println(result + "\nCorrect Encryption? " + t);
			System.out.println(result);
		}else{
			System.out.println("Error: missing String.");
		}
	}
}

