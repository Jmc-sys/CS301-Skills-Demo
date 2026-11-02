import java.util.Scanner;

public class MatchPhoneNumber {
	public static String helper(String s){
		Scanner scan = new Scanner(System.in);
		boolean x = true;
		while(x){
			if(s.matches("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}") || s.matches("[0-9]{3}-[0-9]{4}")){
				x = false;
			}else{
				System.out.println("Error: Invalid format, must be (###) ###-####");
				System.out.print("Enter a valid Phone number: ");
				s = scan.nextLine();
			}
		}
		return s;
	}
	
	public static void result(String a, String b){
		if(a.matches(b)){
				System.out.println("Phone numbers match!");
			}else{
				System.out.println("Phone numbers do not match!");
			}
	}
	
	public static void main (String[] args) {
		boolean area = true;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a valid Phone number: ");
		String phoneA = scan.nextLine();
		helper(phoneA);
		System.out.print("Enter another valid Phone number: ");
		String phoneB = scan.nextLine();
		helper(phoneB);
		if(phoneA.length() == phoneB.length()){
			result(phoneA, phoneB);
		}else if(phoneA.length() > phoneB.length()){
			String seven = phoneA.substring(phoneA.length() - 8);
			result(seven, phoneB);
		}else{
			String seven = phoneB.substring(phoneB.length() - 8);
			result(phoneA, seven);
		}
		scan.close();
		}
}

