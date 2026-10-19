public class Once {
	public static void once (String s) {
		for(int i = 0; i < s.length(); i++){
			char a = s.charAt(i);
			int total = 0;
			
			for(int x = 0; x < s.length(); x++){
				if(s.charAt(x) == a){
					total++;
				}
			}
			if(total == 1) {
				System.out.println(a);
				break;
			}
			
		} 
		return;
	}
	
	public static void main (String[] args) {
		if(args.length > 0){
			once(args[0]);
		}else{
			System.out.println("Missing string");		
		}
	}
}

