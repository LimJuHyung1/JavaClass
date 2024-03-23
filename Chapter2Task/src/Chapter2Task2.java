import java.util.Scanner;

public class Chapter2Task2 {
	public static void printMyName() {
		System.out.println("2019305061 임주형");
	}
	
	public static void main(String[] args) { 		
		Scanner scan = new Scanner(System.in);
		
		printMyName();
		
		try {
			System.out.print("정수를 입력하세요 : ");
			int input = scan.nextInt();
			
			System.out.printf("%d의 제곱은 %d", input, input * input);
		}
		catch(Exception e) {
			System.out.println("올바른 입력이 아닙니다.");
		}					
		
	}

}
