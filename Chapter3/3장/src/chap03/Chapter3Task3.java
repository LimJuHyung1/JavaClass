import java.util.Scanner;

public class Chapter3Task3 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}
	
	public static boolean isPrime(int num) {
		// 1이하인 경우
		if(num <= 1) return false;
		
		// 2가 아니면서 짝수인 경우
		else if(num % 2 == 0 && num != 2) return false;
		
		// 2인 경우
		else if(num == 2) return true;
		
		// num의 제곱근까지의 정수로 나누어 떨어진다면 소수 아님, 나누어 떨어지지 않는다면 소수
		else{
			for(int i = 3; i <= Math.sqrt(num); i += 2) {
				if(num % i == 0) return false;
			}
			return true;
		}		
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
    	System.out.print("양의 정수를 입력하세요 : ");
    	int num = new Scanner(System.in).nextInt();
    	
    	if(isPrime(num))
    		System.out.println(num + "는 소수입니다.");
    	else
    		System.out.println(num + "는 소수가 아닙니다.");    	
    }   
}
