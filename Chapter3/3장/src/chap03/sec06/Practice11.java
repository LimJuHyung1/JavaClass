package sec06;

import java.util.Scanner;

public class Practice11 {

	public static void PrintIntroduce() {
		System.out.println("2019305061 임주형");		
	}
	
	public static void method(int s, int e, Scanner scanner) {		
		System.out.print("Start : ");		
		s = scanner.nextInt();
		
		System.out.print("End : ");		
		e = scanner.nextInt();
		
		System.out.println(s + "부터 " + e + "까지의 합은 " + sum(s, e) + "입니다,");
	}
	
	public static int sum(int i1, int i2) {
		int sum = 0;
		for (int i = i1; i <= i2; i++)
			sum += i;

		return sum;
	}
	
	public static void main(String[] args) {
		PrintIntroduce();
		
		int start = 0, end = 0;		
		Scanner scan = new Scanner(System.in);
		
		try {						
			method(start, end, scan);					
		}
		
		catch(Exception e) {
			System.out.println("올바른 입력이 아닙니다.");
		}			
	}
}
