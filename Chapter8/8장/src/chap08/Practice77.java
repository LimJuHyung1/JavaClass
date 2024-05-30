
import java.util.Random;

public class Practice77 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		Random r = new Random();

		for (int i = 0; i < 5; i++) {
			System.out.print(r.nextInt(100) + " ");
		}
	}
}