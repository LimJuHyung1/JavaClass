import java.util.Scanner;

public class Practice90 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		Scanner in = new Scanner(System.in);
		try {
			square(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수가 아닙니다.");
		}		
	}
	
	private static void square(String s) throws NumberFormatException {
		int n = Integer.parseInt(s);
		System.out.println(n * n);
	}
}
