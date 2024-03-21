import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);

		System.out.println("2019305061 임주형");
		
		try {			
			System.out.print("몇 단? >> ");
			input = scan.nextInt();
			int i = 0;
			
			do {
				i += 1;
				System.out.print(input * i + " ");
			} while(i < 9);			
		}
		
		catch(Exception e) {
			System.out.println("올바른 입력이 아닙니다.");
		}			
	}
}
