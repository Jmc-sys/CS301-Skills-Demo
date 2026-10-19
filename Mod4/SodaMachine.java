public class SodaMachine {
	
	
	private int balance;
	private int inventory;
	private int price = 150;
	private final String[] currency = {"Nickle", "Dime", "Quarter", "Dollar Coin"};	
	private int[] currencyValue = {5, 10, 25, 100};	
	
	public SodaMachine(){
		balance = 0;
		inventory = 10;
	}
	
	public void insertcoin(int c){
		boolean accept = false;
		int coin = 0;
		
		for (int i = 0; i < currencyValue.length; i++){
			if(c == currencyValue[i]){
				accept = true;
				coin = i;
				break;
			}
		}
		if(accept){
			balance += c;
			System.out.println(currency[coin] + " inserted.");
			return;
		}else{
			System.out.println("Coin not accepted\n");
			return;
		}
	}
	
	public int makeChange(){
		int change = balance;
		balance = 0;
		return change;
	}
	
	public boolean buy(){
		if(inventory == 0) {
			System.out.println("Sold out.\n");
			return false;
		}else if(balance < price){
			System.out.println("Insufficient funds, insert coins\n");
			return false;
		}else {
			balance -= price;
			inventory --;
			System.out.println("Dispensing Soda\nEnjoy!!\n");
			return true;
		}
	}
	
	public int getBalance(){
		return balance;
	}
	
	public int getInventory(){
		return inventory;
	}	
	
	public static void main (String[] args) {
		SodaMachine machine1 = new SodaMachine();
		
		machine1.insertcoin(100);
		machine1.insertcoin(25);
		machine1.insertcoin(5);
		machine1.insertcoin(25);
		
		System.out.println("Available Balance: " + machine1.getBalance() + " cents\n");		
		machine1.buy();
		System.out.println("Remaining Balance: " + machine1.getBalance() + " cents\n");
		
		machine1.insertcoin(5);
		machine1.insertcoin(10);
		machine1.insertcoin(5);
		machine1.insertcoin(100);
		machine1.insertcoin(1);
		
		System.out.println("Available Balance: " + machine1.getBalance() + " cents\n");
		machine1.buy();
		
		System.out.println("Remaining Balance: " + machine1.getBalance() + " cents\n");
		
		System.out.println("Available Inventory: " + machine1.getInventory());
		
		System.out.println("Dispensing " + machine1.makeChange() + " cents change. \nThank you. Please come again!");
		
	}
}

