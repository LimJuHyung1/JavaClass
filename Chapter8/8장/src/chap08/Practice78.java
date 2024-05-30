
import java.util.Random;

class Dice{
	static int roll() {
		Random r = new Random();
				
		return r.nextInt(6) + 1;
	}
}

public class Practice78 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번째 결과 : " + Dice.roll());
		}
	}
}