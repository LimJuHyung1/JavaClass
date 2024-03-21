import java.util.Scanner;

public class Practice11 {

	public static void PrintIntroduce() {
		System.out.println("2019305061 임주형");		
	}
	
	public static void main(String[] args) {
		PrintIntroduce();
		
		int input;
		Scanner scan = new Scanner(System.in);
		
		try {			
			System.out.print("몇 단? >> ");		
			input = scan.nextInt();
			
			for(int i = 1; i <= 9; i++) {
				System.out.print(input * i + " ");
			}
		}
		
		catch(Exception e) {
			System.out.println("올바른 입력이 아닙니다.");
		}			
	}
}
