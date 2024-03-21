import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {		
		System.out.println("2019305061 임주형");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		try {
			int input = scan.nextInt();
						
			System.out.println(input % 2 == 0 ? "짝수" : "홀수");			
		}
		catch(Exception e){
			System.out.println("올바른 입력이 아닙니다!");
		}
				
	}

}
