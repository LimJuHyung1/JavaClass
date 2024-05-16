interface Coin {
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
}

public class Practice55 implements Coin {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();
		
		// System.out.println("예제 1 : Dime은 " + Coin.DIME + "센트입니다.");
		System.out.println("예제 2 : Dime은 " + DIME + "센트입니다.");		
	}
}
