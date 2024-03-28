import java.util.Scanner;

public class Chapter3Task1 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}
	
	public static int factorial(int result, int n) {
		while(n > 0) {
			result *= n;
			n -= 1;
		}
		return result;
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
    	int result = 1;
    	int n;
    	Scanner in = new Scanner(System.in);
    	
    	System.out.print("팩토리얼 값을 구할 정수 : ");
    	
    	// 2번
    	n = in.nextInt();
    	
    	// 키보드로 정수를 입력받고 팩토리얼 값을 계산하는 코드    	
    	result = factorial(result, n);
    	
    	System.out.println(result);    	
    }   
}
